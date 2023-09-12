package org.example;

import java.util.Scanner;

public class MenuChoice {
    static Scanner scanner = new Scanner(System.in);
    static boolean programActive = true;

    public static void mainMenu() {
        if (programActive) {
            //System.out.println("\nP E R F E K T A  P R O D U K T E R  A B\n̅̅ ̅ ̅ ̅̅ ̅ ̅ ̅̅ ̅ ̅ ̅̅ ̅ ̅ ̅̅ ̅ ̅ ̅̅ ̅ ̅ ̅̅ ̅ ̅ ̅̅ ̅ ̅ ̅̅ ̅ ̅ ̅̅ ̅ ̅ ̅̅ ̅ ̅ ̅̅ ̅ ̅ ̅̅ ̅ ̅ ");
            System.out.println("╔ — — — — — — — — — — — — — — — — — — — — ╗");
            System.out.println("    P E R F E C T  P R O D U C T S  A B");
            System.out.println("╚ — — — — — — — — — — — — — — — — — — — — ╝");
            programActive = false;
        }

        System.out.println("\nWelcome!\nWhat do you want to handle information about.\n" +
                "\n1. Amount of staff in the system | " +
                "2. Employees | " +
                "3. Interns | " +
                "4. Exit ");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        MenuOption.menuOption(choice);
    }
}


/*
    public static void mainMenu() {
     System.out.println("------------------------------------------------------- \n" +
                "Welcome!\nDo you want to handle information about\n" +
                "\n1. Amount of staff in the system | " +
                "2. Employees | " +
                "3. Interns | " +
                "4. Exit ");
        System.out.print("Choose and option: ");
        int choice = scanner.nextInt();
        MenuOption.menuOption(choice);
    }
   }
*/