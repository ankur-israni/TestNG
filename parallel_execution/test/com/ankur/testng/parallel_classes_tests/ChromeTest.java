package com.ankur.testng.parallel_classes_tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromeTest {

    @BeforeTest
    public void setup(){
        System.out.println("ChromeTest > setup() - threadId = "+Thread.currentThread().getId());
    }

    @Test
    public void chromeTest(){
        System.out.println("ChromeTest > chromeTest() - threadId = " +Thread.currentThread().getId());
    }

    @AfterTest
    public void cleanup(){
        System.out.println("ChromeTest > cleanup() - threadId = "+Thread.currentThread().getId());
    }
}
