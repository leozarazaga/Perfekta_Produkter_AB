package org.example;

import java.util.Date;

public class Main {
    public static void main(String[] args) {


        MenuChoice.mainMenu();

        Employee employee1 = new Employee(1, "female", "Carola", new Date(23, 9, 1), 30);
        Employee.employeeList.add(String.valueOf(employee1));
        System.out.println(Employee.getStaffList());

    }


}