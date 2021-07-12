package com.ankur.listener.imethodinterceptor.ireporter;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest {
    @Test
    public void firstMethod() {
        Assert.assertTrue(true);
    }

    @Test
    public void secondMethod() {
        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = {"firstMethod"})
    public void thirdMethod() {
        Assert.assertTrue(true);
    }
}
