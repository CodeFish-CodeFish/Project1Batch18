package project_04;

public class SwapStrings {

    public static void main(String[] args) {

        //swap strings

        String str1 = "London";
        String str2 = "UK";

        str1 = str1 + str2; // LondonUK
        str2 = str1.substring(0, str1.length() - str2.length() );
        str1 = str1.substring(str2.length());

        System.out.println(str1);
        System.out.println(str2);



    }
}
