package com.dorothy.listener;


import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class FirstListener implements ServletContextListener {


    public void contextInitialized(ServletContextEvent sce) {
        //当ServletContext对象被初始化时，该方法被调用，可以获取到当前应用的ServletContext对象
        String initParam = sce.getServletContext().getInitParameter("initParam");
        sce.getServletContext().setAttribute("Dorothy","dorothy");
        System.out.println("ServletContextListener + initParam"+initParam);
    }

    public void contextDestroyed(ServletContextEvent sce) {

        // 在里面可以释放一些资源，避免资源浪费
        System.out.println("ServletContextListener 被销毁");
    }
}
