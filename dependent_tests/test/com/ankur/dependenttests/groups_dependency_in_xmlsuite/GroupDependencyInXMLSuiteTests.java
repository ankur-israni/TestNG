package com.ankur.dependenttests.groups_dependency_in_xmlsuite;

import org.testng.annotations.Test;

public class GroupDependencyInXMLSuiteTests {

    @Test(groups = { "viewAccount" })
    public void viewAccount() {
        System.out.println("viewAccount()");
    }

    @Test(groups = { "openBrowser" })
    public void openBrowser() {
        System.out.println("openBrowser()");
    }

    @Test(groups = { "login" })
    public void login() {
        System.out.println("login()");
    }

    @Test(groups = {"logout"})
    public void logout() {
        System.out.println("logout()");
    }

}
