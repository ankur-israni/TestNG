package com.ankur.testng.parallel_suite_tests;

import org.testng.annotations.Test;

public class ChromeTest {

    @Test
    public void chromeTest(){
        System.out.println("ChromeTest > threadId = "+Thread.currentThread().getId());
    }
}
