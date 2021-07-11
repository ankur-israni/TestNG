package com.ankur.testng.parallel_test_classes;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirefoxTest {

    @BeforeTest
    public void setup(){
        System.out.println("FirefoxTest > setup() - threadId = "+Thread.currentThread().getId());
    }

    @Test
    public void firefoxTest(){
        System.out.println("FirefoxTest > firefoxTest() - threadId = " +Thread.currentThread().getId());
    }

    @AfterTest
    public void cleanup(){
        System.out.println("FirefoxTest > cleanup() - threadId = "+Thread.currentThread().getId());
    }
}
