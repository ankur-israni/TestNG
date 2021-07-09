package com.ankur.parameters.suite;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamsAtSuiteLevel {
    @Test
    @Parameters({"val1", "val2"})
    public void sum(int v1, int v2) {
        int finalsum = v1 + v2;
        System.out.println("The final sum of the given values is " + finalsum);
    }

    @Test
    @Parameters ({"val1", "val2"})
    public void diff (int v1, int v2) {
        int finaldiff = v1 - v2;
        System.out.println("The final difference of the given values is " + finaldiff);
    }
}
