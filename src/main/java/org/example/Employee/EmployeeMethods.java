package org.example.Employee;

import org.example.utils.GenerateRandomID;
import org.example.MenuChoice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static org.example.Employee.Employee.employeeList;
import static org.example.Employee.EmployeeMenu.employeeMenu;
import java.util.Scanner;



public class EmployeeMethods {
    static Scanner scanner = new Scanner(System.in);
    public static void viewAllEmployees() {
        System.out.println("\nView all employees");
        System.out.println("‾ ‾ ‾ ‾ ‾ ‾ ‾ ‾ ‾ ‾");
        for (Employee employee : employeeList) {
            System.out.print(employee);
        }
        returnToEmployeeMenu();
    }

    public static void addEmployee() {
        System.out.println("\nAdd a new employee");
        System.out.println("‾ ‾ ‾ ‾ ‾ ‾ ‾ ‾ ‾ ‾");


        String id = GenerateRandomID.generateRandomID();
        System.out.print("Enter gender: (male/female) ");
        String gender = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter name: (Firstname Surname) ");
        String name = scanner.nextLine();
        System.out.print("Enter start date: (yyyy-mm-dd) ");
        String date = scanner.nextLine();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate startDate = LocalDate.parse(date, dateFormatter);
        System.out.print("Enter salary: ");
        int salary = scanner.nextInt();
        scanner.nextLine();

        Employee employee = new Employee(id, gender, name, startDate, salary);
        employeeList.add(employee);
        System.out.println("\n You successfully added the following employee to our system: ");
        System.out.print(employee);
        returnToEmployeeMenu();
    }

    public static void removeEmployee() {
        System.out.println("\nDelete employee");
        System.out.println("‾ ‾ ‾ ‾ ‾ ‾ ‾ ‾");
        System.out.println("Employees in the system");
        //Kanske implementera en sort metod där id och namnet syns bara?

        for (Employee employee : employeeList) {
            System.out.print(employee);
        }
        System.out.print("\nPlease enter the ID of the employee you would like to delete: ");
        String id = scanner.nextLine();

        for (Employee employee : employeeList) {
            if (Objects.equals(employee.getId(), id)) {
                employeeList.remove(employee);
                System.out.println("Employee: " + employee.getName() + " has been removed.");
                returnToEmployeeMenu();
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found. Try again.");
        removeEmployee();
    }


    public static void modifyEmployee() {
        for (Employee employee : employeeList) {
            System.out.print(employee);

        }
        scanner.nextLine();
        System.out.print("Enter Employee ID that you would like to modify: ");
        String modifyEmployeeID = scanner.nextLine();


        for (Employee employee : Employee.employeeList) {
            if (Objects.equals(employee.getId(), modifyEmployeeID)) {

                System.out.println("Modifying: " + employee);

                System.out.print("Enter a gender (male/female): ");
                String newGender = scanner.next();
                employee.setGender(newGender);

                System.out.print("Enter a new name: ");
                scanner.nextLine();
                String newName = scanner.nextLine();
                employee.setName(newName);

                System.out.print("Enter a new Start date: (yyyy-mm-dd): ");
                String startDateInput = scanner.next();
                LocalDate employeeStartDate = LocalDate.parse(startDateInput, DateTimeFormatter.ISO_LOCAL_DATE);
                employee.setStartDate(employeeStartDate);

                System.out.print("Enter new paycheck: ");
                int newPayCheck = scanner.nextInt();
                scanner.nextLine();
                employee.setPaycheck(newPayCheck);

                System.out.println("Updated employee: " + employee);
                returnToEmployeeMenu();

                return;
            }
        }
        System.out.println("Employee with ID " + modifyEmployeeID + " not found.");
        employeeMenu();
    }


    public static void calculateAverageWageForMen() {
        List<Employee> maleEmployees =
                employeeList.
                        stream().filter(employee -> "male".
                                equals(employee.getGender())).collect(Collectors.toList());

        double totalSalary = maleEmployees.stream().mapToDouble(Employee::getPaycheck).sum();
        double averageSalary = totalSalary / maleEmployees.size();
        System.out.println("Average salary for males: " + averageSalary);
    }


    public static void calculateAverageWageForWomen() {
        List<Employee> femaleEmployees =
                employeeList.
                        stream().filter(employee -> "female".
                                equals(employee.getGender())).collect(Collectors.toList());

        double totalSalary = femaleEmployees.stream().mapToDouble(Employee::getPaycheck).sum();
        double averageSalary = totalSalary / femaleEmployees.size();
        System.out.println("Average salary for females: " + averageSalary);
    }

    public static void calculateAverageWage() {
        double totalSalary = employeeList.stream().mapToDouble(Employee::getPaycheck).sum();
        double averageSalary = totalSalary / employeeList.size();
        System.out.println("Average salary for all employees are: " + averageSalary);
    }


    public static void orderEmployeesByHireDate() {
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return emp2.getStartDate().compareTo(emp1.getStartDate());
            }
        });

        for(Employee employee : employeeList) {
            System.out.println("Name: " + employee.getName() + ", Start date: " + employee.getStartDate());
        }
    }


    public static void returnToMainMenu() {
        System.out.println(" \nPress Enter to return to the main menu...");
        scanner.nextLine();
        scanner.nextLine();
        MenuChoice.mainMenu();
    }

    public static void returnToEmployeeMenu() {
        System.out.print("\n↩ Press Enter to go back ");
        scanner.nextLine();
        employeeMenu();
    }
}
