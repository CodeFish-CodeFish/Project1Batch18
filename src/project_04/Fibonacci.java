package project_04;

public class Fibonacci {

    public static void main(String[] args) {

        // Fibonacci sequence
        int number = 10;
        int first = 0;
        int second = 1;

        for (int i = 0; i < number; i++) {

            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
