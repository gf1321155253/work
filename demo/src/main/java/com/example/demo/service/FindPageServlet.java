package com.example.demo.service;

import com.example.demo.entity.Brand;
import com.example.demo.entity.PageBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/findPageServlet")
public class FindPageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取参数
        String currentPage = req.getParameter("currentPage");//当前页码
        String rows = req.getParameter("rows");//每页显示的条数
        //调用service查询
        BrandService service = new BrandService();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
