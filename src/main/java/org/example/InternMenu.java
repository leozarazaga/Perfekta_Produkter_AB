package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
            addIntern();
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

    public static void addIntern() {
        System.out.println("Please enter ID of the new intern:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter gender of the intern (male/female):");
        String gender = scanner.nextLine();
        System.out.println("Please enter name of the intern (Firstname Surname):");
        String name = scanner.nextLine();
        System.out.println("Please enter the date when the intern will end their internship: (yyyy-mm-dd)");
        String date = scanner.nextLine();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate endDate = LocalDate.parse(date, dateFormatter);
        System.out.println("Please enter quitmessage for the intern: ");
        String quitMessage = scanner.nextLine();

        Intern intern = new Intern(id, gender, name, endDate, quitMessage);
        Intern.internList.add(intern);

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

