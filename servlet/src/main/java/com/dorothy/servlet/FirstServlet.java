package com.dorothy.servlet;


import javax.servlet.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class FirstServlet extends GenericServlet {

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        ServletOutputStream stream = servletResponse.getOutputStream();
        stream.write("Hello Servlet".getBytes("UTF-8"));
        stream.write((this.getServletContext().toString()+"\n").getBytes());
        //使用ServletContext对象获取配置文件
        InputStream inputStream = this.getServletContext().getResourceAsStream("/WEB-INF/classes/test.properties");
        String realPath = this.getServletContext().getRealPath("/WEB-INF/classes/test.properties");
        System.out.println(realPath);
        Properties properties = new Properties();
        properties.load(inputStream);
        System.out.println(properties.get("com.dorothy.age"));
        //获取到ServletContext对象，实现转发
        this.getServletContext().getRequestDispatcher("/index.html").forward(servletRequest,servletResponse);
    }
}
