package com.ankur.listener.imethodinterceptor.iexecutionlistener;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(value = MyIExecutionListener.class)
public class MyTest {


    @BeforeClass
    public void beforeClass() {
        System.out.println("MyTest > beforeClass() ");
    }

    @Test
    public void test1() {
        System.out.println("MyTest > test1()");
    }

    @Test
    public void test2() {
        System.out.println("MyTest > test2()");
    }


    @AfterClass
    public void afterClass() {
        System.out.println("MyTest > afterClass()");
    }

}
