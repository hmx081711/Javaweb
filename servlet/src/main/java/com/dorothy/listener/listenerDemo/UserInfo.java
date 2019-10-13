package com.dorothy.listener.listenerDemo;


public class UserInfo {

    private String sessionid;

    private String firstLoginTime;

    private String ipAddr;

    public UserInfo(String sessionid, String firstLoginTime, String ipAddr) {
        this.sessionid = sessionid;
        this.firstLoginTime = firstLoginTime;
        this.ipAddr = ipAddr;
    }

    public String getSessionid() {
        return sessionid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid;
    }

    public String getFirstLoginTime() {
        return firstLoginTime;
    }

    public void setFirstLoginTime(String firstLoginTime) {
        this.firstLoginTime = firstLoginTime;
    }

    public String getIpAddr() {
        return ipAddr;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
    }
}
