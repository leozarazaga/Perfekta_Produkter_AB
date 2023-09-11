package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Objects;
import java.util.Scanner;
import java.util.UUID;

import static org.example.Employee.employeeList;
import static org.example.Intern.internList;

public class InternMenu {
    static Scanner scanner = new Scanner(System.in);

    public static void internMenu() {

        System.out.println("\nInterns");
        System.out.println("‾‾‾‾‾‾‾");
        System.out.println("1. View all interns | 2. Add intern | 3. Remove intern | 4. Modify intern | 5. Back to main menu");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                viewAllInterns();
                break;
            case 2:
                addIntern();

                break;
            case 3:
                removeIntern();
                break;
            case 4:
                modifyIntern();
                break;
            case 5:
                MenuChoice.mainMenu();
                returnToMainMenu();
                break;
        }

    }

    public static void viewAllInterns() {
        System.out.println("\nAll interns in the system: " + internList.size());
        for (Intern intern : internList) {
            System.out.print(intern);
        }
        returnToInternMenu();
    }


    public static void modifyIntern() {

        System.out.println("\nModify intern");
        System.out.println("‾ ‾ ‾ ‾ ‾ ‾ ‾");

        scanner.nextLine();

        for (Intern intern : internList) {
            System.out.print(intern);
        }

        boolean foundIntern = false;
        do {
            System.out.print("\nEnter the intern ID you would like to modify: ");
            String modifyInternID = scanner.nextLine();

            for (Intern intern : internList) {
                if (Objects.equals(intern.getId(), modifyInternID)) {
                    foundIntern = true;
                    System.out.println("Modifying: " + intern);

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
                            System.out.println("Invalid input. Enter 'male', 'female', or 'other'\n");
                        }
                    }
                    intern.setGender(newGender);

                    // New name
                    System.out.print("Enter a new name: ");
                    String newName = scanner.nextLine();
                    intern.setName(newName);

                    // End date
                    LocalDate internEndDate = null;
                    boolean validEndDate = false;
                    while (!validEndDate) {
                        try {
                            System.out.print("Enter a new end date (yyyy-mm-dd): ");
                            String endDateInput = scanner.next();
                            scanner.nextLine();
                            internEndDate = LocalDate.parse(endDateInput, DateTimeFormatter.ISO_LOCAL_DATE);
                            validEndDate = true;
                        } catch (DateTimeParseException e) {
                            System.out.println("Invalid date format. Use yyyy-mm-dd format (example 1998-01-05).\n");
                        }
                    }
                    intern.setEndDate(internEndDate);

                    // Quit message
                    System.out.print("Enter a new message: ");
                    String quitMessage = scanner.nextLine();
                    intern.setQuitMessage(quitMessage);

                    System.out.println("Updated intern: " + intern);
                    returnToInternMenu();
                    break;
                }
            }
            System.out.print("Intern with ID " + modifyInternID + " not found. Try again.");

        } while (!foundIntern);
    }


    public static void addIntern() {
        System.out.println("\nAdd a new intern ");
        System.out.println("‾ ‾ ‾ ‾ ‾ ‾ ‾ ‾");

        String id = UUID.randomUUID().toString();

        System.out.print("Enter gender of the intern (male/female): ");
        String gender = scanner.nextLine();
        System.out.print("Enter name of the intern (Firstname Surname): ");
        String name = scanner.nextLine();
        System.out.print("Enter the end date of the internship: (yyyy-mm-dd) ");
        String date = scanner.nextLine();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate endDate = LocalDate.parse(date, dateFormatter);
        System.out.print("Enter a quit message for the intern: ");
        String quitMessage = scanner.nextLine();

        Intern intern = new Intern(id, gender, name, endDate, quitMessage);
        Intern.internList.add(intern);
        System.out.println("\nNew intern added: " + intern);
        returnToInternMenu();
    }


    public static void removeIntern() {

        scanner.nextLine();
        System.out.println("\nRemove intern");
        System.out.println("‾ ‾ ‾ ‾ ‾ ‾ ‾");
        for (Intern intern : internList) {
            System.out.print(intern);
        }
        System.out.println("\nPlease enter the ID of the intern you would like to delete:");
        String id = scanner.nextLine();


        for (Intern intern : internList) {
            if (Objects.equals(intern.getId(), id)) {
                internList.remove(intern);
                System.out.println("Intern: " + intern.getName() + " has been removed.");
                returnToInternMenu();
                return;
            }
        }
        System.out.println("Intern with ID " + id + " not found.");
        internMenu();
    }

    public static void returnToMainMenu() {
        System.out.println(" \nPress Enter to return to the main menu...");
        scanner.nextLine();
        MenuChoice.mainMenu();
    }

    public static void returnToInternMenu() {
        System.out.print("\n↩ Press Enter to go back");
        scanner.nextLine();
        internMenu();
    }
}

