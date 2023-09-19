package project_04;

public class SortString {

    public static void main(String[] args) {

        String unsorted = "BASDASDsadssdsaWZXZyazEedcbaA";
        String sorted = "";

        for(char c = 'a'; c <= 'z'; c++){

            for (int i = 0; i < unsorted.length(); i++) {


                if (unsorted.charAt(i) == c || unsorted.charAt(i) == c - 'a' + 'A'){
                    sorted += unsorted.charAt(i);
                }

            }

        }

        System.out.println(sorted);


    }
}
