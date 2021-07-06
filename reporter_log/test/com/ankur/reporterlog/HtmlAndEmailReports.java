package com.ankur.reporterlog;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class HtmlAndEmailReports {

    @Test(priority = 1)
    public void openBrowser(){
        Reporter.log("openBrowser");
    }

    @Test(priority = 2)
    public void closeBrowser(){
        Reporter.log("closeBrowser");
    }
}
