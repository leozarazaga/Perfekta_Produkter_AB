package org.example.Intern;

import org.example.MenuChoice;

import java.util.Scanner;

public class InternMenu {
    static Scanner scanner = new Scanner(System.in);

    public static void internMenu() {

        System.out.println("\nInterns\n‾‾‾‾‾‾‾");
        System.out.println("1. View all interns | 2. Add intern | 3. Remove intern | 4. Modify intern | 5. Back to main menu");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                InternMethods.viewAllInterns();
                break;
            case 2:
                InternMethods.addIntern();
                break;
            case 3:
                InternMethods.removeIntern();
                break;
            case 4:
                InternMethods.modifyIntern();
                break;
            case 5:
                MenuChoice.mainMenu();
                InternMethods.returnToMainMenu();
                break;
        }
    }
}

