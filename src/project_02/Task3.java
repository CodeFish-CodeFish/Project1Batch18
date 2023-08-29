package project_02;

public class Task3 {

    public static void main(String[] args) {
        /*Given two numbers x and y, we need to swap their values. In this article, we will
learn the Swapping of two numbers in Java
Input : x = 10, y = 20;
Output : x = 20, y = 10
Input : x = 213, y = 109
Output : x = 109, y = 213
Description*/
        int x = 10;
        int y = 20;
        int temp = x;
        x = y;
        y = temp;
        System.out.println(x + " x");
        System.out.println(y + " y");
        int a =3;
        int b =1;

        b = b+a;//4
        a = b-a;//3
        b = b-a;//1


        System.out.println(a + " a");
        System.out.println(b + " b");

        System.out.println();


    }
}
