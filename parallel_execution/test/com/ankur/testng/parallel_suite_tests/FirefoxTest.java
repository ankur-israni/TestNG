package com.ankur.testng.parallel_suite_tests;

import org.testng.annotations.Test;

public class FirefoxTest {
    @Test
    public void firefoxTest(){
        System.out.println("FirefoxTest > threadId = "+Thread.currentThread().getId());
    }
}
