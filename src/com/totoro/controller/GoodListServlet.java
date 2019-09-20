package com.totoro.controller;

import com.totoro.dao.GoodDao;
import com.totoro.model.Goods;
import com.totoro.service.GoodService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "goods_list",urlPatterns ="/goods_list")
public class GoodListServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Goods> goods=new GoodService().selectAllGoods();
        request.setAttribute("goods",goods);
        request.getRequestDispatcher("/admin/goods_list.jsp").forward(request,response);
    }
}
