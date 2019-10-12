package com.dorothy.servlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

@WebServlet(name = "loginServlet",urlPatterns = "/login")
public class RequestServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("RequestServlet启动");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        //得到客户机的ip地址
        System.out.println("客户机Ip地址:" +req.getRemoteAddr());
        Map<String, String[]> map = req.getParameterMap();
        Set<Map.Entry<String, String[]>> entries = map.entrySet();
        for (Map.Entry<String, String[]> entry : entries) {
            System.out.println(entry.getKey()+":"+entry.getValue()[0]);
        }
        resp.sendRedirect("/index.html");
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
