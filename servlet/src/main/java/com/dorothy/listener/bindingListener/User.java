package com.dorothy.listener.bindingListener;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;
import java.io.Serializable;

public class User implements HttpSessionBindingListener, HttpSessionActivationListener, Serializable {

    private String name;

    private String password;


    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void valueBound(HttpSessionBindingEvent event) {
        System.out.println("valueBound\t"+event.getName());
        System.out.println("valueBound\t"+event.getValue());
    }

    public void valueUnbound(HttpSessionBindingEvent event) {
        System.out.println("valueUnbound\t"+event.getName());
        System.out.println("valueUnbound\t"+event.getValue());
    }

    //钝化session
    public void sessionWillPassivate(HttpSessionEvent se) {
        System.out.println("sessionWillPassivate\t"+se.getSource());
    }

    //活化session
    public void sessionDidActivate(HttpSessionEvent se) {
        System.out.println("sessionDidActivate\t"+se.getSource());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
