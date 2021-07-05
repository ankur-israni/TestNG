package com.ankur.exclude.groups;

import org.testng.annotations.Test;

public class ExcludeGroups {

    @Test(groups="ui")
    public void initUI(){
        System.out.println("initUI");
    }

    @Test(groups="ui")
    public void displayUI(){
        System.out.println("displayUI");
    }


    @Test(groups="service")
    public void endService(){
        System.out.println("endService");
    }

    @Test(groups="service")
    public void startService(){
        System.out.println("startService");
    }
}
