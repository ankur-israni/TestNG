package com.ankur.testing.priority;

import org.testng.annotations.Test;

public class WithAndWithoutPriority {
    @Test(priority = 1)
    public void beta() {
        System.out.println("This is beta()...priority = 1");
    }

    @Test (priority = 1)
    public void alpha() {
        System.out.println("This is alpha()...priority = 1");
    }

    @Test
    public void delta() {
        System.out.println("This is delta()...No priority");
    }

    @Test
    public void charlie() {
        System.out.println("This is charlie()...No priority");
    }
}
