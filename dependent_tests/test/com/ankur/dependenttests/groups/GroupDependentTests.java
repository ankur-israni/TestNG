package com.ankur.dependenttests.groups;

import org.testng.annotations.Test;

/**
 * Note that in this example, the methods are called in this sequence: -
 *  1) login()
 *  2) openBrowser()
 *  3) viewAccount()
 *
 * The correct ideally should be: -
 *  1) openBrowser()
 *  2) login()
 *  3) viewAccount()
 *
 *  This however happens, because since openBrowser() and login() are both in the same group(i.e., SignIn),
 *  - they are executed in alphabetical order i.e. (1) login() and then (2) openBrowser()
 */
public class GroupDependentTests {

    @Test(dependsOnGroups = "SignIn")
    public void viewAccount(){
        System.out.println("viewAccount()");
    }

    @Test(groups={"SignIn"})
    public void openBrowser(){
        System.out.println("openBrowser()");
    }

    @Test(groups={"SignIn"})
    public void login(){
        System.out.println("login()");
    }



}
