package com.ankur.listener.imethodinterceptor.isuitelistener;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test2 {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Test2 > beforeSuite");
    }


    @Test
    public void test() {
        System.out.println("Test2 > test()");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Test2 > afterSuite");
    }
}
