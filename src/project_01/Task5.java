package project_01;

public class Task5 {
    public static void main(String[] args) {

        int quarters = 5;
        int dimes = 4;
        int nickels = 3;
        int pennies = 2;

        double total = (quarters * 25) + (dimes * 10) + (nickels * 5) + (pennies * 1);
        System.out.println("The total will be " + total/100);
    }
}
