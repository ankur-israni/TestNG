package com.ankur.dataprovider.inherited;

import org.testng.annotations.DataProvider;

/**
 * When Data Provider is in a foreign class, it needs to be static.
 * Inherited Data Provider means that the @Test class and the @DataProvider are in two seperate classes.
 */
public class MyDataProvider {

        @DataProvider(name = "data-provider")
        public static Object[][] dpMethod() {
            return new Object[][]{{"Value Passed"}};
        }
}

