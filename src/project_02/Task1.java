package project_02;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please insert 6 digits number: ");
        int number = input.nextInt();

//        int num = 578432;

        int digit1 = number / 100000;
        int digit2 = (number / 10000) % 10;
        int digit3 = (number / 1000) % 10; // 578 and % 10 is 8
        int digit4 = (number / 100) % 10;
        int digit5 = (number / 10) % 10;
        int digit6 = number % 10;

        int total = digit1 * digit2 * digit3 * digit4 * digit5 * digit6;
        System.out.println("The multiplication of 5 digits are " + total);
        int sum = digit1 + digit2 + digit3 + digit4 + digit5 + digit6;
        System.out.println("The sum of 5 digits are " + sum);


        // sum will be updated all the time as well as num


//        System.out.println("addition of all numbers is : " + sum);
        input.close();

    }
}
