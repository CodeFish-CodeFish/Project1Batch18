package project_04;

public class PrintEvenLetter {

    public static void main(String[] args) {

        // print letters from the string that their index are on even number
        String name = "Kubanych";

        for (int i = 0; i < name.length(); i++) {

            if (i % 2 == 0){
                System.out.println(name.charAt(i));
            }

        }



    }
}
