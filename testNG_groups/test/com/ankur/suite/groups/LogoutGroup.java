package com.ankur.suite.groups;

import org.testng.annotations.Test;

public class LogoutGroup {

    @Test(groups="ui")
    public void logoutUI(){
        System.out.println("logoutUI");
    }

    @Test(groups="service")
    public void logoutService(){
        System.out.println("logoutService");
    }
}
