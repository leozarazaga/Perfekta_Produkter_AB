package org.example;

import static org.example.Employee.employeeList;
import static org.example.Intern.internList;
import static org.example.MenuChoice.scanner;

public class MenuOption {

    public static void menuOption(int choice) {

        switch (choice) {
            case 1:
                System.out.println("List of all staffmembers: ");
                System.out.println(employeeList);
                System.out.println(internList);
                System.out.println("Perfekta Produkter AB currently has " + (employeeList.size()+internList.size()) + " staff members.");
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

    public static void returnToMainMenu() {
        System.out.println(" \nPress Enter to return to the main menu...");
        scanner.nextLine();
        scanner.nextLine();
        MenuChoice.mainMenu();
    }
}
