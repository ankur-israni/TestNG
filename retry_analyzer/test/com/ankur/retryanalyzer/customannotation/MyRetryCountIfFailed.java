package com.ankur.retryanalyzer.customannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyRetryCountIfFailed {

    /**
     * Specify how many times you want to retry the test if failed.
     * Default count is set to ZERO.
     */
    int value() default 0;
}
