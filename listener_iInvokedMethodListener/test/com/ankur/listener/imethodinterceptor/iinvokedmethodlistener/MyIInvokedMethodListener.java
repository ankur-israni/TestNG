package com.ankur.listener.imethodinterceptor.iinvokedmethodlistener;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class MyIInvokedMethodListener implements IInvokedMethodListener {
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        System.out.println("MyIInvokedMethodListener > beforeInvocation() - method = : " + method.getTestMethod().getMethodName() + " of Class:" + testResult.getTestClass());
    }

    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        System.out.println("MyIInvokedMethodListener > afterInvocation() - method = : " + method.getTestMethod().getMethodName() + " of Class:" + testResult.getTestClass());

    }
}
