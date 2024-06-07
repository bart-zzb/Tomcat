package com.example.javaweb.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        Integer price = Integer.valueOf(request.getParameter("price"));
        Integer count = Integer.valueOf(request.getParameter("stock"));
        String info = request.getParameter("info");

        System.out.println("name = " + name + " price = " + price + " count = " + count + " info = " + info);
    }
}
