package com.totoro.filter;

import com.totoro.model.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "AdminFilter")
public class AdminFilter implements Filter {
    @Override
    public void destroy() {
        System.out.println("destroy");
    }
    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest httpServletRequest=(HttpServletRequest) req;
        HttpServletResponse httpServletResponse=(HttpServletResponse) resp;
        Object o=httpServletRequest.getSession().getAttribute("User");
        if (o==null){
            httpServletResponse.sendRedirect(httpServletRequest.getContextPath()+"/index.jsp");
        }else{
            User user=(User)o;
            if (user.isAdmin()) {
                chain.doFilter(req, resp);
            }else{
                httpServletResponse.sendRedirect(httpServletRequest.getContextPath()+"/index.jsp");
            }
        }


    }
    @Override
    public void init(FilterConfig config) throws ServletException {
        System.out.println("init");
    }

}
