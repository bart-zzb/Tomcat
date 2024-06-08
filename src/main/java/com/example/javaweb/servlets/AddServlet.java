package com.example.javaweb.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //get方式下目前不需要设置编码（基于tomcat8）
        //如果是get请求发送的中文数据，转码稍微麻烦（tomcat8之前）
//        String name = request.getParameter("name");
//        //将字符串打散成字节数据
//        byte[] bytes = name.getBytes("ISO-8859-1");
//        //将字节数据按照设定的编码重新组装成字符串
//        name = new String(bytes, "ISO-8859-1");

        //post方式下，设置编码，防止中文乱码
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        Integer price = Integer.valueOf(request.getParameter("price"));
        Integer count = Integer.valueOf(request.getParameter("stock"));
        String info = request.getParameter("info");

        System.out.println("name = " + name + " price = " + price + " count = " + count + " info = " + info);

        //继承关系：
        //1)HttpServlet -> GenericServlet -> Servlet
        //2)Servlet中的核心方法：init(), service(), destroy()
        //3)service会调用相对应do的方法：如doPost/doGet，所以必选实现相对应的方法，否则报405，不支持该方法的请求

    }
}
