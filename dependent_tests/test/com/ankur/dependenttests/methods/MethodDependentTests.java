package com.ankur.dependenttests.methods;

import org.testng.annotations.Test;

public class MethodDependentTests {

    @Test
    public void signIn(){
        System.out.println("signIn()");
    }

    @Test
    public void openBrowser(){
        System.out.println("openBrowser()");
    }

    @Test(dependsOnMethods = {"signIn","openBrowser"})
    public void logout(){
        System.out.println("logout()");
    }

}
