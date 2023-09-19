package project_04;

import java.util.Arrays;

public class SeparateArrays {

    public static void main(String[] args) {

        // retrieve even and odds numbers from array and store them
        // separately
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        int countEven = 0; // 5
        int countOdd = 0;//5

        for (int n:array) {
            if (n % 2 == 0){
                countEven++;
            }else {
                countOdd++;
            }
        }

        int [] evenArray = new int[countEven];
        int [] oddArray = new int[countOdd];

        int indexEven = 0;
        int indexOdd = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                evenArray[indexEven++] = array[i];

            }else {
                oddArray[indexOdd++] = array[i];

            }
        }

        System.out.println(Arrays.toString(evenArray));
        System.out.println(Arrays.toString(oddArray));







    }
}
