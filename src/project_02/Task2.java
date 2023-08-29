package project_02;

import java.util.Scanner;
import java.util.SortedMap;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter 5 digits number: ");

        int number = scanner.nextInt();
        int digit1 = number / 10000;
        int digit2 = (number / 1000) % 10;
        int digit3 = (number / 100) % 10;
        int digit4 = (number / 10) % 10;
        int digit5 = number % 10;

        String reverseNumber = "";
        reverseNumber =  reverseNumber + digit5 + digit4 + digit3 + digit2 + digit1;
        System.out.println(reverseNumber + " reverse string number");

        int result = digit5 * 10000;
        result = result + digit4 * 1000;
        result = result + digit3 * 100;
        result = result + digit2 * 10;
        result = result + digit1 * 1;


        System.out.println(result);

    }
}
