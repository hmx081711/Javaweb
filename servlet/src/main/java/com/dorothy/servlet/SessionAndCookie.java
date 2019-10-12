package com.dorothy.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;


public class SessionAndCookie extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取session
        HttpSession session = req.getSession();
        //String sessionId = session.getId();
        //Cookie cookie = new Cookie("JSESSIONID",sessionId);
        //cookie.setMaxAge(3600);
        //cookie.setPath("/session/*");
        //resp.setContentType("text/html;charSet=utf-8");
        //resp.addCookie(cookie);
        //resp.getOutputStream().write("Session设置成功".getBytes("UTF-8"));

        // 浏览器禁用Cookie的情况，要使用UrlEncoding进行资源转发
        String encodeURL = resp.encodeURL("/success");
        resp.sendRedirect(encodeURL);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
