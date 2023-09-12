package org.example.Employee;

import org.example.utils.GenerateRandomID;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;
import java.util.stream.Collectors;

import static org.example.Employee.Employee.employeeList;
import static org.example.Employee.EmployeeMenu.employeeMenu;


public class EmployeeMethods {
    static Scanner scanner = new Scanner(System.in);

    public static void viewAllEmployees() {
        System.out.println("\nView all employees\n‾ ‾ ‾ ‾ ‾ ‾ ‾ ‾ ‾ ‾");
        System.out.println("All employees in the system: " + employeeList.size() + "\n");
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
        System.out.println("\nYou successfully added the following employee to our system: ");
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
        System.out.print("\nCopy and paste the ID you would like to delete: ");
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
        System.out.println("\nModify employee");
        System.out.println("‾ ‾ ‾ ‾ ‾ ‾ ‾ ‾ ‾");

        for (Employee employee : employeeList) {
            System.out.print(employee);
        }

        boolean foundEmployee = false;
        do {
            System.out.print("\nCopy and paste the ID you would like to modify: ");
            String modifyEmployeeID = scanner.nextLine();

            for (Employee employee : employeeList) {
                if (Objects.equals(employee.getId(), modifyEmployeeID)) {
                    foundEmployee = true;
                    System.out.println("Modifying: " + employee);

                    // Gender
                    String newGender = null;
                    boolean validGender = false;
                    while (!validGender) {
                        System.out.print("Enter a gender (male/female/other): ");
                        newGender = scanner.next();
                        scanner.nextLine();

                        if (newGender.equalsIgnoreCase("male") || newGender.equalsIgnoreCase("female") || newGender.equalsIgnoreCase("other")) {
                            validGender = true;
                        } else {
                            System.out.println("Invalid input. Enter 'male', 'female' or 'other'\n");
                        }
                    }
                    employee.setGender(newGender);

                    // New name
                    System.out.print("Enter a new name: ");
                    String newName = scanner.nextLine();
                    employee.setName(newName);

                    // Start date
                    LocalDate employeeStartDate = null;
                    boolean validStartDate = false;
                    while (!validStartDate) {
                        try {
                            System.out.print("Enter a new start date (yyyy-mm-dd): ");
                            String startDateInput = scanner.next();
                            scanner.nextLine();
                            employeeStartDate = LocalDate.parse(startDateInput, DateTimeFormatter.ISO_LOCAL_DATE);
                            validStartDate = true;
                        } catch (DateTimeParseException e) {
                            System.out.println("Invalid date format. Use yyyy-mm-dd format (example 1992-02-27).\n");
                        }
                    }
                    employee.setStartDate(employeeStartDate);

                    // New paycheck
                    int newPaycheck = 0;
                    boolean validPaycheck = false;
                    while (!validPaycheck) {
                        try {
                            System.out.print("Enter new paycheck: ");
                            newPaycheck = scanner.nextInt();
                            scanner.nextLine();
                            validPaycheck = true;
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Enter a valid number for the paycheck.\n");
                            scanner.nextLine();
                        }
                    }
                    employee.setPaycheck(newPaycheck);

                    System.out.print("\nUpdated employee: " + employee);
                    returnToEmployeeMenu();
                    break;
                }
            }
            if (!foundEmployee) {
                System.out.print("Employee with ID " + modifyEmployeeID + " not found. Try again.");
            }

        } while (!foundEmployee);
    }

    public static void calculateAverageWageForMen() {
        List<Employee> maleEmployees =
                employeeList.
                        stream().filter(employee -> "male".
                                equals(employee.getGender())).collect(Collectors.toList());

        double totalSalary = maleEmployees.stream().mapToDouble(Employee::getPaycheck).sum();
        double averageSalary = totalSalary / maleEmployees.size();
        System.out.println("Average wage for males: $" + averageSalary + "$");
    }

    public static void calculateAverageWageForWomen() {
        List<Employee> femaleEmployees =
                employeeList.
                        stream().filter(employee -> "female".
                                equals(employee.getGender())).collect(Collectors.toList());

        double totalSalary = femaleEmployees.stream().mapToDouble(Employee::getPaycheck).sum();
        double averageSalary = totalSalary / femaleEmployees.size();
        System.out.println("Average wage for females: $" + averageSalary);
    }

    public static void calculateAverageWage() {
        System.out.println("\nAverage wage\n̅  ̅  ̅  ̅  ̅  ̅  ");

        double totalSalary = employeeList.stream().mapToDouble(Employee::getPaycheck).sum();
        double averageSalary = totalSalary / employeeList.size();
        System.out.println("Average wage for all employees are: $" + averageSalary);
    }

    public static void orderEmployeesByHireDate() {
        System.out.println("\nOrdered by latest hired\n̅  ̅  ̅̅  ̅̅  ̅̅  ̅̅  ̅̅  ̅̅  ̅̅  ̅̅  ̅̅  ̅̅ ");
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return emp2.getStartDate().compareTo(emp1.getStartDate());
            }
        });

        for (Employee employee : employeeList) {
            System.out.println("Name: " + employee.getName() + ", Start date: " + employee.getStartDate());
        }
    }

    public static void returnToEmployeeMenu() {
        System.out.print("\n↩ Press Enter to go back ");
        scanner.nextLine();
        employeeMenu();
    }
}
