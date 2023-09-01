package org.example;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {


        MenuChoice.mainMenu();
        Employee employee1 = new Employee(1, "female", "Carola", LocalDate.of(2023, 9, 1), 30);
        Employee.employeeList.add(employee1);
        System.out.println(Employee.getStaffList());

    }


}