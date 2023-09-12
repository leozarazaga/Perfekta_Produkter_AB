package org.example.Employee;
import org.example.MenuChoice;

import java.util.*;


public class EmployeeMenu {

    static Scanner scanner = new Scanner(System.in);

    public static void employeeMenu() {

        System.out.println("\nEmployees");
        System.out.println("‾‾‾‾‾‾‾‾‾");
        System.out.println("1. View all employees | " + " 2. Add new employee | " + "3. Delete employee | " +
                "4. Modify employee | " + "5. Average wage (men/women) | " + "6. List of all employees ordered by latest hired | " + "7. Back to main menu");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                EmployeeMethods.viewAllEmployees();
                break;
            case 2:
                EmployeeMethods.addEmployee();
                break;
            case 3:
                EmployeeMethods.removeEmployee();
                break;
            case 4:
                EmployeeMethods.modifyEmployee();
                break;
            case 5:
                EmployeeMethods.calculateAverageWage();
                EmployeeMethods.calculateAverageWageForWomen();
                EmployeeMethods.calculateAverageWageForMen();
                EmployeeMethods.returnToEmployeeMenu();
                break;
            case 6:
                EmployeeMethods.orderEmployeesByHireDate();
                EmployeeMethods.returnToMainMenu();
                break;
            case 7:
                MenuChoice.mainMenu();
                break;
        }
    }
}
