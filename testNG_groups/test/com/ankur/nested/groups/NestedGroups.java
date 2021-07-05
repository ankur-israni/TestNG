package com.ankur.nested.groups;

import org.testng.annotations.Test;

public class NestedGroups {

    @Test(groups="InnerGroup")
    public void innerGroup1(){
        System.out.println("innerGroup1");
    }


    @Test(groups="InnerGroup")
    public void innerGroup2(){
        System.out.println("innerGroup2");
    }

    @Test(groups="SomeOtherGroup")
    public void someOtherGroup(){
        System.out.println("someOtherGroup");
    }
}
