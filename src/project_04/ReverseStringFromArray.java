package project_04;

import java.util.Arrays;

public class ReverseStringFromArray {

    public static void main(String[] args) {

        String sentence = "We love Java a lot";
        String [] eachWord = sentence.split(" ");
        // current array = [We, love, Java, a, lot]

        for (int i = 0; i < eachWord.length; i++) {

            String reversed = "";

            if (i % 2 == 0){

                for (int j = eachWord[i].length()-1; j >=0 ; j--) {
                    reversed+=eachWord[i].charAt(j);
                }

            }else {
                reversed = eachWord[i];
            }
            System.out.println(reversed);

        }

    }
}
