package com.dorothy.listener.listenerDemo;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.List;

import static com.dorothy.listener.listenerDemo.utils.SessionUtils.getUserBySessionId;

@WebListener
public class UserOnlineNumberListener implements HttpSessionListener {

    private int onlineNumber;

    public void sessionCreated(HttpSessionEvent se) {
        onlineNumber++;
        se.getSession().getServletContext().setAttribute("onlineNumber",onlineNumber);
    }

    public void sessionDestroyed(HttpSessionEvent se) {
        onlineNumber--;
        se.getSession().getServletContext().setAttribute("onlineNumber",onlineNumber);

        List<UserInfo> userList = (List)se.getSession().getServletContext().getAttribute("userList");
        String id = se.getSession().getId();
        UserInfo user = getUserBySessionId(userList,id);
        if (user!=null) {
            userList.remove(user);
        }
        se.getSession().getServletContext().setAttribute("userList",userList);
    }
}
