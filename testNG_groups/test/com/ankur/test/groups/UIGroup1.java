package com.ankur.test.groups;

import org.testng.annotations.Test;

public class UIGroup1 {

    @Test(groups="ui")
    public void initUI(){
        System.out.println("initUI");
    }


    @Test(groups="service")
    public void endService(){
        System.out.println("endService");
    }
}
