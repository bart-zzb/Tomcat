package com.example.javaweb.servlets;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class ServletAttribute extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取session，如果没有，直接创建一个新的session
        HttpSession session = req.getSession();
        //session作用域：向这个session存入一个attribute，key："token", value:"123456"
        session.setAttribute("token","123456");
    }
}
