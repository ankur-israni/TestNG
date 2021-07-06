package com.ankur.asserts;



import com.ankur.asserts.fixture.EmployeeFixture;
import com.ankur.domain.Employee;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.*;

public class SoftAsserts {
    private Employee employee = null;
    private SoftAssert softAssert=null;

    @BeforeMethod
    public void setup(){
        employee= EmployeeFixture.createEmployee();
        softAssert=new SoftAssert();
    }


    @Test
    public void testAssertEquals(){
        softAssert.assertEquals(1,employee.getId());
    }

    /**
     * This test should fail so we can see the custom failure message.
     */
    @Test
    public void testAssertEqualsWithFailureMessage(){
        softAssert.assertEquals(2,employee.getId(),"Incorrect employee id");
    }

    @Test
    public void testAssertTrue(){
        softAssert.assertTrue(employee.getName().equals("ankur"),"employee name should be ankur");
    }

    /**
     * This test should fail so we can see the custom failure message.
     */
    @Test
    public void testAssertTrueWithFailureMessage(){
        softAssert.assertTrue(employee.getName().equals("donald"),"Correct name should be ankur");
    }

    @Test
    public void testAssertFalse(){
        softAssert.assertFalse(employee.getName().equals("donald"));
    }

    /**
     * This test should fail so we can see the custom failure message.
     */
    @Test
    public void testAssertFalseWithFailureMessage(){
        softAssert.assertFalse(employee.getName().equals("ankur"),"The assert statement should be reversed here.");
    }

    @Test
    public void testNull(){
        Employee employee = null;
        softAssert.assertNull(employee);
    }

    /**
     * This test should fail so we can see the custom failure message.
     */
    @Test
    public void testNullWithMessages(){
        Employee employee = new Employee(1,"ankur",9999,"plano");
        softAssert.assertNull(employee,"Employee object is not null here.");
    }


    @Test
    public void testNotNull(){
        Employee employee = new Employee(1,"ankur",9999,"plano");
        softAssert.assertNotNull(employee);
    }

    /**
     * assertAll() will tell us which assert failed. If we  dont use assertAll(), the test will show as passed althouth it might have failed.
     */
    @Test
    public void testNotNullWithMessages(){
        Employee employee = null;
        softAssert.assertNotNull(employee,"Employee object is null here.");
        softAssert.assertNotNull(new Object(),"object is not null here");
        softAssert.assertAll();

    }


       /** assertAll() will tell us which assert failed. If we  dont use assertAll(), the test will show as passed althouth it might have failed.*/
    @Test
    public void testFail(){
        if(employee.getName().equalsIgnoreCase("ankur")){
            softAssert.fail("We expected employee name to be donald");
        }
        softAssert.assertAll();
    }

    @Test
    public void testAssertEqualsNoOrder(){
        Integer[] actual = {1,2,3};
        Integer[] expected = {3,2,1};
        softAssert.assertEqualsNoOrder(actual,expected);
        softAssert.assertAll();
    }


     /** assertAll() will tell us which assert failed. If we  dont use assertAll(), the test will show as passed althouth it might have failed.*/
    @Test
    public void testAssertNotEqualsNoOrder(){
        Integer[] actual = {4,2,3};
        Integer[] expected = {3,2,1};
        softAssert.assertEqualsNoOrder(actual,expected);
        softAssert.assertAll();
    }

    @Test
    public void testAssertSame(){
        Employee employee1 = EmployeeFixture.createEmployee();
        Employee employee2 = employee1;
        softAssert.assertSame(employee1, employee2);
        softAssert.assertAll();
    }

    /**
     * This test should fail so we can see the custom failure message.
     */
    @Test
    public void testAssertSameWithFailureMessage(){
        Employee employee1 = EmployeeFixture.createEmployee();
        Employee employee2 = EmployeeFixture.createEmployee();
        softAssert.assertSame(employee1, employee2,"employee1 and employee2 are not the same objects");
        softAssert.assertAll();
    }

    @Test
    public void testAssertNotSame(){
        Employee employee1 = EmployeeFixture.createEmployee();
        Employee employee2 = EmployeeFixture.createEmployee();
        softAssert.assertNotSame(employee1, employee2);
        softAssert.assertAll();
    }

    @Test
    public void testAssertNotSameWithFailureMessage(){
        Employee employee1 = EmployeeFixture.createEmployee();
        Employee employee2 = EmployeeFixture.createEmployee();
        softAssert.assertNotSame(employee1, employee2, "employee1 and employee2 are not the same objects");
        softAssert.assertAll();
    }

}

