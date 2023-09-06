package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static org.example.Intern.internList;

public class InternMenu {
    static Scanner scanner = new Scanner(System.in);
    public static void InternMenu() {

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
            //removeIntern();
            break;
        case 4:
            modifyIntern();
            break;
        case 5:
            MenuChoice.mainMenu();
            break;
    }

    }

    public static void modifyIntern(){
        System.out.print("Employee ID: ");
        int modifyInternID = scanner.nextInt();

        for(Intern intern : internList){
            if(intern.getId() == modifyInternID){

                System.out.println("Modifying: " + intern);

                System.out.print("Enter a gender (male/female): ");
                String newGender = scanner.next();
                intern.setGender(newGender);

                System.out.print("Enter a new name: ");
                String newName = scanner.next();
                intern.setName(newName);

                System.out.print("Enter a new end date (yyyy-mm-dd): ");
                String endDateInput = scanner.next();
                LocalDate endDate =  LocalDate.parse(endDateInput, DateTimeFormatter.ISO_LOCAL_DATE);
                intern.setEndDate(endDate);

                System.out.print("Enter a new message: ");
                scanner.nextLine();
                String quitMessage = scanner.nextLine();
                intern.setQuitMessage(quitMessage);


                System.out.println("Updated intern: " + intern);
                return;
            }
        }

        System.out.println("Intern with ID " + modifyInternID + " not found.");

    }
}
