package com.dorothy.filter;

import javax.servlet.*;
import java.io.IOException;

public class FirstFilter extends GenericFilter {

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("Filter 启动");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("过滤操作之前处理");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("过滤操作之后处理");
    }

    public void destroy() {
        System.out.println("Filter被销毁了");
    }
}
