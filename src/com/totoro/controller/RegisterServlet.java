package com.totoro.controller;

import com.totoro.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "register_do",urlPatterns = "/register_do")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        int age=Integer.parseInt(request.getParameter("age"));
        String sex=request.getParameter("sex");
        UserService userService=new UserService();
        boolean isSuccessful=userService.register(username,password,age,sex);
        if (isSuccessful){
            request.setAttribute("message","<font color='green'>注册成功,请登录！</font><br/>");
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }else {
            request.setAttribute("message","<font color='red'>用户名重复,请重新填写！</font><br/>");
            request.getRequestDispatcher("/register.jsp").forward(request,response);
        }
    }

}
