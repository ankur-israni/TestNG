package com.ankur.testng.same_unit_test;


import org.testng.annotations.Test;

public class SameUnitTest {
    @Test(threadPoolSize = 4, invocationCount = 4, timeOut = 1000)
    public void testMethod() {
        System.out.println("Thread ID Is : " + Thread.currentThread().getId());
    }
}
