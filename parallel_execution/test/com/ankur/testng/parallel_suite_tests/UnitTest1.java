package com.ankur.testng.parallel_suite_tests;

import org.testng.annotations.Test;

public class UnitTest1 {
    @Test
    public void unitTest1(){
        System.out.println("UnitTest1 > threadId = "+Thread.currentThread().getId());
    }
}
