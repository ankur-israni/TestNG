package com.ankur.testng.parallel_different_unit_tests;

import org.testng.annotations.Test;

public class ParallelDifferentUnitTests {

    @Test
    public void FirefoxTest() {
        System.out.println("Firefox test - thread =  "+Thread.currentThread().getId());
    }

    @Test
    public void ChromeTest() {
        System.out.println("Chrome test = thread = "+Thread.currentThread().getId());

    }
}
