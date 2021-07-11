package com.ankur.testng.parallel_suite_tests;

import org.testng.annotations.Test;

public class UnitTest2 {
    @Test
    public void unitTest(){
        System.out.println("UnitTest2 > threadId = "+Thread.currentThread().getId());
    }
}
