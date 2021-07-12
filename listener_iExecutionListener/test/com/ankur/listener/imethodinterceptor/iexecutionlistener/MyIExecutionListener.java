package com.ankur.listener.imethodinterceptor.iexecutionlistener;

import org.testng.IExecutionListener;

public class MyIExecutionListener implements IExecutionListener {
    @Override
    public void onExecutionStart() {
        System.out.println("MyIExecutionListener > onExecutionStart() ");
    }

    @Override
    public void onExecutionFinish() {
        System.out.println("MyIExecutionListener > onExecutionFinish() ");

    }
}
