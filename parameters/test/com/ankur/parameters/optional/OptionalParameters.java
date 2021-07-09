package com.ankur.parameters.optional;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OptionalParameters {
    @Test
    @Parameters("message")
    public void OP( @Optional("Optional Parameter") String message) {
        System.out.println(message);
    }
}
