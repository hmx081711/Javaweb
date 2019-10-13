package com.dorothy.listener.attributeListener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

@WebListener
public class MyHttpSessionAttributeListener implements HttpSessionAttributeListener {

    public void attributeAdded(HttpSessionBindingEvent se) {
        System.out.println("attributeAdded" + se.getName() + "\t" + se.getValue());
    }

    public void attributeRemoved(HttpSessionBindingEvent se) {
        System.out.println("attributeRemoved" + se.getName() + "\t" + se.getValue());
    }

    public void attributeReplaced(HttpSessionBindingEvent se) {
        System.out.println("attributeReplaced" + se.getName() + "\t" + se.getValue());
    }
}
