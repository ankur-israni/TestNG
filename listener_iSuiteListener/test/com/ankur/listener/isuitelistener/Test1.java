package com.ankur.listener.isuitelistener;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test1 {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Test1 > beforeSuite");
    }


    @Test
    public void test() {
        System.out.println("Test1 > test()");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Test1 > afterSuite");
    }
}
