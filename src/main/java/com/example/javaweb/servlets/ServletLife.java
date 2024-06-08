package com.example.javaweb.servlets;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

public class ServletLife extends HttpServlet {


    //Servlet的生命周期
    /*
    1) 生命周期：就是对应Servlet的三个核心方法，init/service/destroy
    2) 默认情况下：
        第一次接收请求时，这个Servlet会进行实例化（调用构造方法），tomcat帮我们通过反射创建，调用service
        第二次接收请求时，直接调用service
        关闭tomcat容器时，Servlet示例被销毁，调用销毁方法
    3）
        - Servlet示例tomcat只会创建一个，所有的请求都是这个实例去响应
        - 默认情况下，第一次请求来时，才创建实例
        - 如果需要提高系统的启动速度，默认就可以，但如果需要提高响应速度，应设置servlet初始化时机
    4） 修改Servlet初始化时机
        设置启动顺序，0,1,2,3,4 etc.
        如：在web.xml的<load-on-startup>1</load-on-startup>
    5） Servlet在容器中是：单例的,线程不安全的
    */

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
