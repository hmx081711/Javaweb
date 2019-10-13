package com.dorothy.listener.attributeListener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServletContextAttributeListener implements ServletContextAttributeListener {

    public void attributeAdded(ServletContextAttributeEvent scae) {
        System.out.println("attributeAdded" + scae.getName() + "\t" + scae.getValue());
    }

    public void attributeRemoved(ServletContextAttributeEvent scae) {
        System.out.println("attributeRemoved" + scae.getName() + "\t" + scae.getValue());
    }

    public void attributeReplaced(ServletContextAttributeEvent scae) {
        System.out.println("attributeReplaced" + scae.getName() + "\t" + scae.getValue());
    }
}
