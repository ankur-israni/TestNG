package com.ankur.suite.groups;

import org.testng.annotations.Test;

public class LoginGroup {

    @Test(groups="ui")
    public void loginUI(){
        System.out.println("loginUI");
    }



    @Test(groups="service")
    public void loginService(){
        System.out.println("loginService");
    }


}
