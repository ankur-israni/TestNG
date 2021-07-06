package com.ankur.reporterlog;

import org.testng.Reporter;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ConsoleEmailAndHtmlReports {

    @Test(priority = 1)
    public void openBrowser(){
        Reporter.log("openBrowser",true);
    }

    @Test(priority = 2)
    public void closeBrowser(){
        Reporter.log("closeBrowser",true);
    }
}
