package org.example;

import java.util.Scanner;

import static org.example.Employee.employeeList;
import static org.example.Intern.internList;

public class InternMenu {
    static Scanner scanner = new Scanner(System.in);
    public static void internMenu() {

        System.out.println("1. View all interns | 2. Add intern | 3. Remove intern | 4. Modify intern | 5. Back to main menu");
        int choice = scanner.nextInt();

    switch (choice) {
        case 1:
            System.out.println(internList);
            break;
        case 2:
            //addIntern();
            break;
        case 3:
            removeIntern();
            break;
        case 4:
            //modifyIntern();
            break;
        case 5:
            MenuChoice.mainMenu();
            break;
    }

    }

    public static void removeIntern() {
        //System.out.println(allEmployees);

        System.out.println(internList);
        System.out.println("\n Please enter the id of the intern you would like to delete.");
        int id = scanner.nextInt();

        for (Intern intern : internList) {
            if (intern.getId() == id) {
                internList.remove(intern);
                System.out.println("Intern: " + intern.getName() + " has been removed.");

                System.out.println(" \nPress Enter to return to the main menu...");
                scanner.nextLine();
                scanner.nextLine();
                MenuChoice.mainMenu();

                return;
            }
        }


        System.out.println("Intern with ID " + id + " not found.");
        System.out.println(" \nPress Enter to return to the main menu...");
        scanner.nextLine();
        scanner.nextLine();
        MenuChoice.mainMenu();


    }
    }
