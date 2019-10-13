package com.dorothy.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "secondFilter",servletNames = "hello servlet")
public class SecondFilter extends GenericFilter {

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("SecondFilter启动");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("SecondFilter前处理");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("SecondFilter后处理");
    }

    public void destroy() {
        System.out.println("SecondFilter销毁");
    }
}
