package com.dorothy.listener.attributeListener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServletRequestAttributeListener implements ServletRequestAttributeListener {

    public void attributeAdded(ServletRequestAttributeEvent srae) {
        System.out.println("attributeAdded" + srae.getName() + "\t" + srae.getValue());
    }

    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        System.out.println("attributeRemoved" + srae.getName() + "\t" + srae.getValue());
    }

    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        System.out.println("attributeReplaced" + srae.getName() + "\t" + srae.getValue());
    }
}
