package com.totoro.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "TestFilter")
public class TestFilter implements Filter {
    @Override
    public void destroy() {
        System.out.println("destroy");
    }
    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("TestFilet doFilter before");
        chain.doFilter(req, resp);
        System.out.println("TestFilet doFilter after");
    }
    @Override
    public void init(FilterConfig config) throws ServletException {
        System.out.println("init");
    }

}
