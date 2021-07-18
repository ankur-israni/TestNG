package com.ankur.retryanalyzer.customannotation;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetryAnalyzer implements IRetryAnalyzer {
    int counter = 0;

    @Override
    public boolean retry(ITestResult iTestResult) {
        // check if the test method had RetryCountIfFailed annotation
        MyRetryCountIfFailed annotation = iTestResult.getMethod().getConstructorOrMethod().getMethod()
                .getAnnotation(MyRetryCountIfFailed.class);

        // based on the value of annotation see if test needs to be rerun
        if ((annotation != null) && (counter < annotation.value())) {
            counter++;
            return true;
        }
        return false;
    }
}

