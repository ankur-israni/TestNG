package com.ankur.testng.parallel_suite_tests;

import org.testng.annotations.Test;

public class IntegrationTest2 {
    @Test
    public void integrationTest2(){
        System.out.println("IntegrationTest2 > threadId = "+Thread.currentThread().getId());
    }
}
