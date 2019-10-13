package com.dorothy.listener.listenerDemo;


import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.dorothy.listener.listenerDemo.utils.SessionUtils.getUserBySessionId;


@WebListener
public class UserInfoListener implements ServletRequestListener {

    private List<UserInfo> userList;

    public void requestDestroyed(ServletRequestEvent sre) {

    }

    public void requestInitialized(ServletRequestEvent sre) {

        userList = (List<UserInfo>) sre.getServletContext().getAttribute("userList");
        if (userList==null) {
            userList = new ArrayList<UserInfo>();
        }

        HttpServletRequest request = (HttpServletRequest) sre.getServletRequest();
        String id = request.getSession().getId();
        if (getUserBySessionId(userList,id)==null) {
             UserInfo userInfo = new UserInfo(id,new SimpleDateFormat("yyyy-MM-dd:HH-mm-ss").format(new Date())
                     ,request.getRemoteAddr());
             userList.add(userInfo);
        }
        request.getServletContext().setAttribute("userList",userList);
    }


}
