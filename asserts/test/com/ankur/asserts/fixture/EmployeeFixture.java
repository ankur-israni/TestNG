package com.ankur.asserts.fixture;

import com.ankur.domain.Employee;

public class EmployeeFixture {

    public static Employee createEmployee(){
        return new Employee(1,"ankur",9999,"frisco");
    }

}
