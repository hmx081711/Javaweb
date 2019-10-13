package com.dorothy.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyHttpSessionlistener implements HttpSessionListener {

    public void sessionCreated(HttpSessionEvent se) {
        //用户第一次访问应用资源时调用
        System.out.println("sessionCreated");
    }

    public void sessionDestroyed(HttpSessionEvent se) {
        //session被销毁时调用
        System.out.println("sessionDestroyed");
    }
}
