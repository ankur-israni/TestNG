package com.ankur.retryanalyzer.customannotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest {
    @Test
    @MyRetryCountIfFailed(10)
    public void test1() {
        Assert.assertEquals(false, true);
    }

    @Test
    public void test2() {
        Assert.assertEquals(false, true);
    }
}
