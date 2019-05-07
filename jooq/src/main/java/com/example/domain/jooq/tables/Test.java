/*
 * This file is generated by jOOQ.
*/
package com.example.domain.jooq.tables;


import com.example.domain.jooq.Indexes;
import com.example.domain.jooq.Jay;
import com.example.domain.jooq.Keys;
import com.example.domain.jooq.tables.records.TestRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Test extends TableImpl<TestRecord> {

    private static final long serialVersionUID = 1634163465;

    /**
     * The reference instance of <code>jay.test</code>
     */
    public static final Test TEST = new Test();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TestRecord> getRecordType() {
        return TestRecord.class;
    }

    /**
     * The column <code>jay.test.id</code>.
     */
    public final TableField<TestRecord, UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>jay.test.name</code>.
     */
    public final TableField<TestRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>jay.test.java</code>.
     */
    public final TableField<TestRecord, Integer> JAVA = createField("java", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>jay.test.mysql</code>.
     */
    public final TableField<TestRecord, Integer> MYSQL = createField("mysql", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>jay.test.kafka</code>.
     */
    public final TableField<TestRecord, Integer> KAFKA = createField("kafka", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>jay.test</code> table reference
     */
    public Test() {
        this(DSL.name("test"), null);
    }

    /**
     * Create an aliased <code>jay.test</code> table reference
     */
    public Test(String alias) {
        this(DSL.name(alias), TEST);
    }

    /**
     * Create an aliased <code>jay.test</code> table reference
     */
    public Test(Name alias) {
        this(alias, TEST);
    }

    private Test(Name alias, Table<TestRecord> aliased) {
        this(alias, aliased, null);
    }

    private Test(Name alias, Table<TestRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Jay.JAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.TEST_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TestRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_TEST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TestRecord> getPrimaryKey() {
        return Keys.KEY_TEST_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TestRecord>> getKeys() {
        return Arrays.<UniqueKey<TestRecord>>asList(Keys.KEY_TEST_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Test as(String alias) {
        return new Test(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Test as(Name alias) {
        return new Test(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Test rename(String name) {
        return new Test(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Test rename(Name name) {
        return new Test(name, null);
    }
}