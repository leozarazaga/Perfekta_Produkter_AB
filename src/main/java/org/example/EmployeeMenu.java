package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static org.example.Employee.employeeList;

import static org.example.Employee.employeeList;

public class EmployeeMenu {

    static Scanner scanner = new Scanner(System.in);

    public static void employeeMenu() {

/*
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

 */


        System.out.println("1. View all employees | " + " 2. Add new employee | " + "3. Delete employee | " +
                "4. Modify employee | " + "5. Average wage (men/women) | " + "6. Back to main menu ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // method that prints out all employees
               break;
            case 2:
                // call method that adds an employee
                addEmployee();

                break;

            case 3:
                // method to delete an employee
                removeEmployee();

                break;
            case 4:
                //method to modify an employee
                //modifyEmployee();
                break;
            case 5:
                calculateAverageWage();
                calculateAverageWageForWomen();
                calculateAverageWageForMen();
                break;
            case 6:
                MenuChoice.mainMenu();
                break;

        }



    }

    public static void addEmployee(){
        System.out.println("Enter id of employee: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter gender: (male/female)");
        String gender = scanner.nextLine();
        System.out.println("Enter name: (Firstname surname)");
        String name = scanner.nextLine();

        System.out.println("Enter startdate: (yyyy-mm-dd)");
        String date = scanner.nextLine();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate startDate = LocalDate.parse(date, dateFormatter);

        System.out.println("Enter salary: ");
        int salary = scanner.nextInt();

        Employee employee = new Employee(id, gender, name, startDate, salary);
        employeeList.add(employee);
        System.out.println(employee);



    }

    public static void removeEmployee() {


        System.out.println(employeeList);
        System.out.println("\n Please enter the id of the employee you would like to delete.");
        int id = scanner.nextInt();
      
      for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                employeeList.remove(employee);
                System.out.println("Employee: " + employee.getName() + " has been removed.");

                System.out.println(" \nPress Enter to return to the main menu...");
                scanner.nextLine();
                scanner.nextLine();
                MenuChoice.mainMenu();

                return;
            }

          System.out.println("Employee with ID " + id + " not found.");
          System.out.println(" \nPress Enter to return to the main menu...");
          scanner.nextLine();
          scanner.nextLine();
          MenuChoice.mainMenu();
        }

    }


    public static void calculateAverageWageForMen() {
        List<Employee> maleEmployees =
                employeeList.
                stream().filter(employee->"male".
                        equals(employee.getGender())).collect(Collectors.toList());


        double totalSalary = maleEmployees.stream().mapToDouble(Employee::getPaycheck).sum();
        double averageSalary = totalSalary / maleEmployees.size();
        System.out.println("Average salary for males: " + averageSalary);
    }

    public static void calculateAverageWageForWomen() {
        List<Employee> femaleEmployees =
                employeeList.
                        stream().filter(employee->"female".
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



}
