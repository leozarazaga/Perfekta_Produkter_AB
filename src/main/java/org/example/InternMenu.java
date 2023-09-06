package org.example;

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
            //modifyIntern();
            break;
        case 5:
            MenuChoice.mainMenu();
            break;
    }

    }
}
