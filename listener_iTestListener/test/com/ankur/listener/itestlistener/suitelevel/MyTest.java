package com.ankur.listener.itestlistener.suitelevel;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

@Listeners(MyListener.class)
public class MyTest {

    @Test
    public void successTest() {
        assertTrue(true);
    }

    private int i = 1;
    //Failing with bounds of success.
    @Test(successPercentage = 60, invocationCount = 3)
    public void partialSuccessTest() {
        if (i < 2) {
            assertEquals(i, i);
            i++;
        }
    }

    @Test
    public void skipTest(){
        throw new SkipException("Skipping this test");
    }
}
