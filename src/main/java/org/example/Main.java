package org.example;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        MenuChoice.mainMenu();
        Employee employee1 = new Employee(1, "female", "Carola", LocalDate.of(2023, 9, 1), 30);
        Employee employee2 = new Employee(2, "female", "Lina", LocalDate.of(2023, 11, 2), 40);
        Employee employee3 = new Employee(3, "male", "Leo", LocalDate.of(2022, 10, 15), 20);
        Intern intern1 = new Intern(4, "female", "Felicia", LocalDate.of(2024, 1, 1), "Hejdå");
        Intern intern2 = new Intern(5, "female", "Fanny", LocalDate.of(2024, 1, 1), "Hejdå");
        Intern.internList.add(intern1);
        Intern.internList.add(intern2);
        Employee.employeeList.add(employee1);
        Employee.employeeList.add(employee2);
        Employee.employeeList.add(employee3);
        String interns = intern1.retrieveStaffDetails();
        Employee.employeeList.remove(employee1);
        String allEmployees = employee1.retrieveStaffDetails();
        //System.out.println("Employees: \n" + Employee.getStaffList());
        //System.out.println(employee1.staffList());
        //System.out.println(employee2.retrieveStaffDetails());
        System.out.println(employee1);
        System.out.println(allEmployees);
        System.out.println(interns);
        System.out.println(allEmployees + interns);

    }


}