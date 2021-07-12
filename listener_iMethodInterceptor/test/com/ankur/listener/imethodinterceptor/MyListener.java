package com.ankur.listener.imethodinterceptor;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;

import java.util.List;

public class MyListener implements IMethodInterceptor {
    @Override
    public List<IMethodInstance> intercept(List<IMethodInstance> list, ITestContext iTestContext) {

        for(IMethodInstance instance : list){
            System.out.println("MyListener > intercept() > method = "+ instance.getMethod().getMethodName());
        }

        return list;
    }
}
