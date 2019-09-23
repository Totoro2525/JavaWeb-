package com.totoro.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "DispatcherFilter")
public class DispatcherFilter implements Filter {
    @Override
    public void destroy() {
        System.out.println("Dispatcher detroy");
    }
    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("Dispatcher dofilter");
        chain.doFilter(req, resp);
    }
    @Override
    public void init(FilterConfig config) throws ServletException {
        System.out.println("Dispatcher init");
    }

}
