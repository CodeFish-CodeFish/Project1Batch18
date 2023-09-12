package project_02;

import java.util.Scanner;

public class TimTask {
    public static void main(String[] args) {
        /*

using scanner
1. ask user input first name
2. asl user input last name
3. ask user input age
4. ask user input city

Print out :
1. first and last name
2. calculate what year user was born
3. print city of the user


         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first name ");
        String name = scanner.nextLine();
        System.out.println("PLease enter your last name ");
        String lastName = scanner.nextLine();
        System.out.println("Please enter your age");
        int age = scanner.nextInt();
        int currentYear = 2023;
        System.out.println("your first name is: " + name+"\nyour last name is: " + lastName+
                "\n you was born on " + (currentYear-age));

    }
}
