package com.ankur.listener.isuitelistener;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class MySuiteListener implements ISuiteListener {
    public void onStart(ISuite suite) {
        System.out.println("MySuiteListener > onStart() - suiteName =   "  + suite.getName());
    }
    public void onFinish(ISuite suite) {
        System.out.println("MySuiteListener > onFinish() - suiteName = "  + suite.getName());
    }
}
