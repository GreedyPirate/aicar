package com.ttyc.stream;

import com.ttyc.stream.obj.Demo;
import com.ttyc.stream.obj.User;
import org.junit.Test;

import java.util.*;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static com.ttyc.stream.Source.users;
import static java.lang.System.out;

public class Intermediate {
    final Pattern pattern = Pattern.compile("/");

    /**
     * (User user)可增加可读性？
     */
    @Test
    public void testType() {
        users.stream().forEach((User user) -> {
            System.out.println(user.getName());
        });
    }

    @Test
    public void testCount() {
        long count = users.stream().filter(t -> t.getType().equals(2)).count();
        System.out.println("count = " + count);
    }

    @Test
    public void testSort() {
        List<User> collect = users.stream().sorted(Comparator.comparing(User::getAge)).collect(Collectors.toList());
        System.out.println(users);
        System.out.println(collect);
    }

    @Test
    public void testMap() {
        Stream<String> stringStream = users.stream().map(User::getName);
        stringStream.forEach(out::println);
    }

    @Test
    public void testPeek() {
        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .forEach(out::println);

        String text = "xx";
        Optional.of(text).ifPresent(out::println);
    }

    @Test
    public void testSkip() {
        String url = "gateway/user/role-list";
        pattern.splitAsStream(url).forEach(item -> System.out.println(item));
    }

    /**
     * 多字段分组求和
     */
    @Test
    public void testMultiGroup() {
        Map<User, LongSummaryStatistics> map = Source.users.stream().collect(Collectors
                .groupingBy(
                        user -> new User(user.getName(), user.getGender()),
                        Collectors.summarizingLong(user -> user.getAge())
                )
        );

        map.forEach((k,v) -> {
            k.setAge(v.getSum());
        });

        Set<User> users = map.keySet();
        users.stream().forEach(System.out::println);
    }

    /**
     * 按前缀分组
     */
    @Test
    public void testPrefixGroup() {
        List<String> list = new ArrayList<>();
        list.add("20190101_01.log");
        list.add("20190101_02.log");
        list.add("20190101_03.log");

        list.add("20190102_01.log");
        list.add("20190102_02.log");

        list.add("20190103_01.log");

        Map<String, List<String>> map = list.stream().collect(Collectors.groupingBy(s -> s.substring(0, s.indexOf('_')), Collectors.toList()));
        map.forEach((k, v) -> System.out.println(k + "----" + v));
    }

    /**
     * 按下标分组
     */
    @Test
    public void testIndexGroup() {
        List<String> names = Arrays.asList("Sam", "Pamela", "Dave", "Pascal", "Erik");
        List<String> list = IntStream.range(0, names.size())
                .filter(i -> i % 2 == 0)
                .mapToObj(i -> names.get(i))
                .collect(Collectors.toList());
        System.out.println(Arrays.toString(list.toArray(new String[list.size()])));
    }

    /**
     * list转map时，去除重复key
     */
    @Test
    public void testDuplicateKey() {
        List<Demo> list = new ArrayList<>();
        list.add(Demo.of("k1", "a"));
        list.add(Demo.of("k1", "b"));
        list.add(Demo.of("k2", "c"));

        Map<String, String> map = list.stream().collect(Collectors.toMap(Demo::getKey, Demo::getName, (e1,e2) -> e1));

        map.forEach((k,v) -> {
            System.out.println(k + "--" + v);
        });

        User user = null;
        Optional<User> optionalUser = Optional.ofNullable(user);
        optionalUser.orElseThrow(() -> new RuntimeException("用户不存在"));
    }

    @Test
    public void testDuplicateKeyError() {
        Map<Integer, User> errorMap = Source.users.stream().collect(Collectors.toMap(User::getType, Function.identity()));
    }

    @Test
    public void testJoinStr() {
        Map<String, List<String>> mergeGender = Source.users.stream().collect(Collectors.groupingBy(User::getName, Collectors.mapping(User::getGender, Collectors.toList())));
        System.out.println("mergeGender = " + mergeGender);
    }

}
