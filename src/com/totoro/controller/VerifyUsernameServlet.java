package com.totoro.controller;

import com.totoro.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "verifyusername",urlPatterns = "/verifyusername")
public class VerifyUsernameServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName=request.getParameter("username");
        UserService service=new UserService();
        boolean isExist=service.isExit(userName);
        response.getWriter().append("{\"isSuccess\":"+!isExist+"}");
    }
}
