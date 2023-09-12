package org.example;

import org.example.Employee.Employee;
import org.example.Employee.EmployeeMenu;
import org.example.Intern.Intern;
import org.example.Intern.InternMenu;

import static org.example.Employee.Employee.employeeList;
import static org.example.Intern.Intern.internList;
import static org.example.MenuChoice.scanner;

public class MenuOption {
    public static void menuOption(int choice) {

        switch (choice) {
            case 1:
                amountOfStaffInTheSystem();
                returnToMainMenu();
                break;
            case 2:
                EmployeeMenu.employeeMenu();
                break;
            case 3:
                InternMenu.internMenu();
                break;
            case 4:
                System.exit(0);
                break;
        }
    }
    public static void amountOfStaffInTheSystem() {
        System.out.println("\nList of all staffmembers: " + (employeeList.size() + internList.size()) + "\n");
        System.out.println("-Total employees: " + employeeList.size());

        for (Employee employee : employeeList) {
            System.out.print(employee);
        }

        System.out.println("\n-Total interns: " + internList.size());

        for (Intern intern : internList) {
            System.out.print(intern);
        }
    }

    public static void returnToMainMenu() {
        scanner.nextLine();
        System.out.print(" \n↩ Press Enter to return to the main menu ");
        scanner.nextLine();
        MenuChoice.mainMenu();
    }
}
