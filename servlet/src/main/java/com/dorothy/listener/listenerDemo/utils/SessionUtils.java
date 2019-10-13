package com.dorothy.listener.listenerDemo.utils;

import com.dorothy.listener.listenerDemo.UserInfo;

import java.util.List;
import java.util.stream.Collectors;

public class SessionUtils {

    public static UserInfo getUserBySessionId(List<UserInfo> userList, final String id) {
        List<UserInfo> users = userList.stream().filter(user -> user.getSessionid().equals(id)).collect(Collectors.toList());
        if (users.size()==0) {
            return null;
        } else {
            return users.get(0);
        }
    }
}
