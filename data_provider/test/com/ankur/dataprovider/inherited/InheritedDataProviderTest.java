package com.ankur.dataprovider.inherited;


import org.testng.annotations.Test;

public class InheritedDataProviderTest {

        @Test(dataProvider = "data-provider", dataProviderClass = com.ankur.dataprovider.inherited.MyDataProvider.class)
        public void myTest (String val) {
            System.out.println("Current Status : " + val);
        }
}



