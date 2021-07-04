package com.ankur.testing.priority;

import org.testng.annotations.Test;

public class DifferentPriority{

    @Test(priority=1)
    public void alpha(){
        System.out.println("alpha...priority = 1");
    }

    @Test(priority=0)
    public void beta(){
        System.out.println("beta...priority = 0");
    }
}
