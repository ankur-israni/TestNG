package com.ankur.retryanalyzer.simple;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest {

    @Test(retryAnalyzer = MyRetryAnalyzer.class)
    public void test1() {
        Assert.assertEquals(false, true);
    }

    @Test
    public void test2() {
        Assert.assertEquals(false, true);
    }

}
