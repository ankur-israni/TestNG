package com.ankur.asserts;

import com.ankur.asserts.fixture.EmployeeFixture;
import com.ankur.domain.Employee;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HardAsserts {
    private Employee employee = null;

    @BeforeMethod
    public void setup(){
        employee= EmployeeFixture.createEmployee();
    }


    @Test
    public void testAssertEquals(){
        assertEquals(1,employee.getId());
    }

    /**
     * This test should fail so we can see the custom failure message.
     */
    @Test
    public void testAssertEqualsWithFailureMessage(){
        assertEquals(2,employee.getId(),"Incorrect employee id");
    }

    @Test
    public void testAssertTrue(){
        assertTrue(employee.getName().equals("ankur"));
    }

    /**
     * This test should fail so we can see the custom failure message.
     */
    @Test
    public void testAssertTrueWithFailureMessage(){
        assertTrue(employee.getName().equals("donald"),"Correct name should be ankur");
    }

    @Test
    public void testAssertFalse(){
        assertFalse(employee.getName().equals("donald"));
    }

    /**
     * This test should fail so we can see the custom failure message.
     */
    @Test
    public void testAssertFalseWithFailureMessage(){
        assertFalse(employee.getName().equals("ankur"),"The assert statement should be reversed here.");
    }

    @Test
    public void testNull(){
        Employee employee = null;
        assertNull(employee);
    }

    /**
     * This test should fail so we can see the custom failure message.
     */
    @Test
    public void testNullWithMessages(){
        Employee employee = new Employee(1,"ankur",9999,"plano");
        assertNull(employee,"Employee object is not null here.");
    }


    @Test
    public void testNotNull(){
        Employee employee = new Employee(1,"ankur",9999,"plano");
        assertNotNull(employee);
    }

    /**
     * This test should fail so we can see the custom failure message.
     */
    @Test
    public void testNotNullWithMessages(){
        Employee employee = null;
        assertNotNull(employee,"Employee object is null here.");
    }


    /**
     * This test should fail so we could see the usage of fail() and also see the custom failure message.
     */
    @Test
    public void testFail(){
        if(employee.getName().equalsIgnoreCase("ankur")){
            fail("We expected employee name to be donald");
        }
    }

    @Test
    public void testAssertEqualsNoOrder(){
        Integer[] actual = {1,2,3};
        Integer[] expected = {3,2,1};
        assertEqualsNoOrder(actual,expected);
    }

    /**
     * This test should fail since the arrays are not equal.
     */
    @Test
    public void testAssertNotEqualsNoOrder(){
        Integer[] actual = {4,2,3};
        Integer[] expected = {3,2,1};
        assertEqualsNoOrder(actual,expected);
    }

    @Test
    public void testAssertSame(){
        Employee employee1 = EmployeeFixture.createEmployee();
        Employee employee2 = employee1;
        assertSame(employee1, employee2);
    }

    /**
     * This test should fail so we can see the custom failure message.
     */
    @Test
    public void testAssertSameWithFailureMessage(){
        Employee employee1 = EmployeeFixture.createEmployee();
        Employee employee2 = EmployeeFixture.createEmployee();
        assertSame(employee1, employee2,"employee1 and employee2 are not the same objects");
    }

    @Test
    public void testAssertNotSame(){
        Employee employee1 = EmployeeFixture.createEmployee();
        Employee employee2 = EmployeeFixture.createEmployee();
        assertNotSame(employee1, employee2);
    }

    @Test
    public void testAssertNotSameWithFailureMessage(){
        Employee employee1 = EmployeeFixture.createEmployee();
        Employee employee2 = EmployeeFixture.createEmployee();
        assertNotSame(employee1, employee2, "employee1 and employee2 are not the same objects");
    }

}
