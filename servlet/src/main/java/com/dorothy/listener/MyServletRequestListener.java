package com.dorothy.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;


// value属性声明listener的描述信息
@WebListener(value = "requestListener")
public class MyServletRequestListener implements ServletRequestListener {

    public void requestDestroyed(ServletRequestEvent sre) {
        //请求处理完毕时调用
        System.out.println("requestDestroyed");
    }

    public void requestInitialized(ServletRequestEvent sre) {
        //浏览器向服务器发请求时调用
        System.out.println("requestInitialized");
    }
}
