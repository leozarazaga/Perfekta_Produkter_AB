package org.example;

import java.time.LocalDate;

public class StaffFromStart {
    public static void addStaffToRetrieveStaffDetails() {

        Employee employee1 = new Employee(GenerateRandomID.generateRandomID(), "female", "Carola Johansson", LocalDate.of(2023, 9, 1), 30000);
        Employee employee2 = new Employee(GenerateRandomID.generateRandomID(), "female", "Lina Luna", LocalDate.of(2023, 11, 20), 40000);
        Employee employee3 = new Employee(GenerateRandomID.generateRandomID(), "male", "Leo Winston", LocalDate.of(2022, 10, 30), 20000);
        Employee employee4 = new Employee(GenerateRandomID.generateRandomID(), "female", "Mimmi Beckman", LocalDate.of(2023, 9, 5), 30000);
        Employee employee5 = new Employee(GenerateRandomID.generateRandomID(), "female", "Martina Oskarsson", LocalDate.of(2023, 11, 2), 40000);
        Employee employee6 = new Employee(GenerateRandomID.generateRandomID(), "male", "Muhammad Ali", LocalDate.of(2022, 10, 15), 20000);
        Employee.employeeList.add(employee1);
        Employee.employeeList.add(employee2);
        Employee.employeeList.add(employee3);
        Employee.employeeList.add(employee4);
        Employee.employeeList.add(employee5);
        Employee.employeeList.add(employee6);

        Intern intern1 = new Intern(GenerateRandomID.generateRandomID(), "female", "Felicia Fernstone", LocalDate.of(2024, 1, 1), "Hejdå");
        Intern intern2 = new Intern(GenerateRandomID.generateRandomID(), "female", "Fanny Stjerna", LocalDate.of(2024, 6, 7), "Bra jobbat");
        Intern intern3 = new Intern(GenerateRandomID.generateRandomID(), "female", "Felicia Fernstone", LocalDate.of(2024, 11, 15), "Vi kommer inte att anställa dig");
        Intern intern4 = new Intern(GenerateRandomID.generateRandomID(), "female", "Fanny Stjerna", LocalDate.of(2024, 10, 25), "Du är grym!");
        Intern.internList.add(intern1);
        Intern.internList.add(intern2);
        Intern.internList.add(intern3);
        Intern.internList.add(intern4);

    }

}
