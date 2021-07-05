package com.ankur.test.groups;

import org.testng.annotations.Test;

public class UIGroup2 {


    @Test(groups="ui")
    public void displayUI(){
        System.out.println("displayUI");
    }

    @Test(groups="service")
    public void startService(){
        System.out.println("startService");
    }


}
