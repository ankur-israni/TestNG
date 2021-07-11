package com.ankur.testng.parallel_tests_with_dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParallelExecutionWithDataProvider {

    @Test(dataProvider = "dp")
    public void testMethod(int number) {
        System.out.println("The Thread ID for " + number + " Is :  " + Thread.currentThread().getId());
    }

    @DataProvider(name = "dp", parallel = true)
    public Object[][] dataProvider() {
        return new Object[][]{
                new Object[]{1},
                new Object[]{2},
                new Object[]{3},
                new Object[]{4},
                new Object[]{5},
                new Object[]{6},
                new Object[]{7},
                new Object[]{8}

        };
    }
}
