package com.example.javaweb.servlets;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

public class ServletLife extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("Servlet init");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Servlet service");
    }

    @Override
    public void destroy() {
        System.out.println("Servlet destroy");
    }


}
