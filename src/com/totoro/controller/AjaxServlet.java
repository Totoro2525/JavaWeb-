package com.totoro.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ajaxrequest",urlPatterns = "/ajaxrequest")
public class AjaxServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("收到了ajax请求："+request.getParameter("data"));
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().append("我是数据");
    }
}
