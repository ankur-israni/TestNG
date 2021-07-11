package com.ankur.testng.parallel_suite_tests;

import org.testng.annotations.Test;

public class IntegrationTest1 {
    @Test
    public void integrationTest1(){
        System.out.println("IntegrationTest1 > threadId = "+Thread.currentThread().getId());
    }
}
