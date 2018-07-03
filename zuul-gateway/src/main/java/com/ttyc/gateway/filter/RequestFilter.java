package com.ttyc.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import com.sun.xml.internal.ws.client.ResponseContext;
import org.springframework.beans.factory.annotation.Value;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestFilter extends ZuulFilter {
    @Value("${crossdomain.hosts}")
    private String crossDomainHosts;

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        String token = request.getHeader("");
        if (token != null) {
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
//            ctx.setResponseBody();
            return null;
        }

        // 支持跨域
        /*supportCrossDomain(request, response);
        // 对外API,通过Service-Token进行认证
        String url = httpRequest.getRequestURI().substring(httpRequest.getContextPath().length());
        if (url.contains("/api/")) {
            return validServiceToken(httpRequest);
        }*/
        return null;
    }

    /**
     * 支持前端的跨域请求
     *
     * @param response
     */
    private void supportCrossDomain(HttpServletRequest request, HttpServletResponse response) {
        String orginUrl = request.getHeader("Origin");
        if (orginUrl != null && crossDomainHosts.contains(orginUrl)) {
            response.addHeader("Access-Control-Allow-Origin", orginUrl);
            response.addHeader("Access-Control-Allow-Methods", "POST,GET,OPTIONS,DELETE"); // 支持的http动作
            response.addHeader("Access-Control-Allow-Headers",
                    "X_Requested_With,x-requested-with,content-type,Authorization");
            response.addHeader("Access-Control-Allow-Credentials", "true");
        }
    }
}
