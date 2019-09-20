package com.totoro.controller;

import com.totoro.dao.UserDao;
import com.totoro.model.User;
import com.totoro.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "login_do",urlPatterns = "/login_do")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        UserService userService=new UserService();
        User user=userService.login(username,password);
        if (user!=null){
            request.getSession().setAttribute("User",user);
            if (user.isAdmin()) {
                response.sendRedirect("goods_list");
                //request.getRequestDispatcher("goods_list").forward(request,response);
            }else{
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
        }else{
            request.setAttribute("message","用户或密码错误，请重新登录");
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }
    }

}
