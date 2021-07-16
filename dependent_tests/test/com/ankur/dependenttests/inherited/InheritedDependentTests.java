package com.ankur.dependenttests.inherited;

import org.testng.annotations.Test;

class SuperClass {

    @Test
    public void openBrowser() {
        System.out.println("openBrowser()");
    }
}

public class InheritedDependentTests extends SuperClass {

    @Test(dependsOnMethods = {"openBrowser"})
    public void login() {
        System.out.println("login()");
    }
}
