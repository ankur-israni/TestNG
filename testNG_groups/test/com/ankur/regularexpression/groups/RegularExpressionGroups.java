package com.ankur.regularexpression.groups;

import org.testng.annotations.Test;

public class RegularExpressionGroups {

    @Test(groups="ui")
    public void initUI(){
        System.out.println("initUI");
    }

    @Test(groups="service3")
    public void doService(){
        System.out.println("doService");
    }

    @Test(groups="service1")
    public void endService(){
        System.out.println("endService");
    }

    @Test(groups="service2")
    public void startService(){
        System.out.println("startService");
    }
}
