1. Servlet继承关系：
   - HttpServlet -> GenericServlet -> Servlet
   - Servlet中的核心方法：init(), service(), destroy()
   - service会调用相对应do的方法：如doPost/doGet，所以必选实现相对应的方法，否则报405，不支持该方法的请求

2. Servlet的生命周期

    1) 生命周期：就是对应Servlet的三个核心方法，init/service/destroy
    2) 默认情况下：
        第一次接收请求时，这个Servlet会进行实例化（调用构造方法），tomcat帮我们通过反射创建，调用service
        第二次接收请求时，直接调用service
        关闭tomcat容器时，Servlet示例被销毁，调用销毁方法
   3) 
        - Servlet示例tomcat只会创建一个，所有的请求都是这个实例去响应
        - 默认情况下，第一次请求来时，才创建实例
        - 如果需要提高系统的启动速度，默认就可以，但如果需要提高响应速度，应设置servlet初始化时机
   4) 修改Servlet初始化时机
        设置启动顺序，0,1,2,3,4 etc.
        如：在web.xml的<load-on-startup>1</load-on-startup>
   5)  Servlet在容器中是：单例的,线程不安全的

3. Http协议
   1) Http 超文本传输协议
   2) Http是无状态的
   3) Http有两个个部分：请求和响应
      - 请求：
        包含三个部分：请求行/请求头/请求体
        1) 请求行：包含三个信息：1.请求的方式 2.请求的url 3.请求的协议（一般都是HTTP1.1）
        2) 请求头：包含客户端需要告诉服务器的信息，比如：浏览器型号，版本，我能接收的内容的类型等
        3) 请求体，三个情况：
            get方式，没有请求体，可以有queryString
            post方式，有请求体， form data
            json方式，有请求体， request payload
      - 响应
        包含三个部分：响应行/响应头/响应体
        1) 响应行：包含三个信息：1.协议 2.响应状态码 3.响应状态
        2) 响应头：包含服务器的信息，服务器发送给浏览器的信心（内容的媒体类型，编码，内容长度等）
        3) 响应体：响应的实际内容（比如请求add.html页面，响应的内容就是<html><head><body><form>...）