package com.ankur.parameters.suite;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamsAtSuiteLevel2 {
    @Test
    @Parameters({"val1", "val2"})
    public void mul(int v1, int v2) {
        int prod = v1*v2;
        System.out.println("The Product Of Value 1 and 2 is " + prod);
    }
}
