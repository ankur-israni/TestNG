package com.ankur.listener.imethodinterceptor;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(value=MyListener.class)
public class MyTest {
    @Test
    public void firstMethod() {
        System.out.println("MyTest > firstMethod()");
    }

    @Test
    public void secondMethod() {
        System.out.println("MyTest > secondMethod()");
    }

    @Test(dependsOnMethods = {"firstMethod"})
    public void thirdMethod() {
        System.out.println("MyTest > thirdMethod()");
    }
}
