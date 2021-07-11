package com.ankur.dataprovider.method_as_a_parameter;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class MethodAsAParameterDataProvider {

        @DataProvider(name = "data-provider")
        public Object[][] dpMethod (Method m){
            switch (m.getName()) {
                case "sum":
                    return new Object[][] {{2, 3 , 5}, {5, 7, 12}};
                case "diff":
                    return new Object[][] {{2, 3, -1}, {5, 7, -2}};
            }
            return null;

        }

        @Test(dataProvider = "data-provider")
        public void sum (int a, int b, int result) {
            int sum = a + b;
            Assert.assertEquals(result, sum);
        }

        @Test (dataProvider = "data-provider")
        public void diff (int a, int b, int result) {
            int diff = a - b;
            Assert.assertEquals(result, diff);
        }
}
