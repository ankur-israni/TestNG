package com.ankur.suite.groups;

import org.testng.annotations.Test;

public class CartGroup {



    @Test(groups="ui")
    public void cartUI(){
        System.out.println("cartUI");
    }

    @Test(groups="service")
    public void cartService(){
        System.out.println("cartService");
    }
}
