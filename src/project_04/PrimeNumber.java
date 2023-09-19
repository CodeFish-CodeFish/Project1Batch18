package project_04;

import java.util.Scanner;

public class PrimeNumber {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        boolean flag = true;

        if (num <=1){
            flag = false;
        }else {

            for (int i = 2; i * i <=num ; i++) {

                if (num % i == 0){
                    flag = false;
                    break;
                }

            }

        }

        if (flag){
            System.out.println(num + " is a Prime Number");
        }else {
            System.out.println(num + " is not a Prime Number");
        }

    }
}
