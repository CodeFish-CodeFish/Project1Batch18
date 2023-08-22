package project_01;

public class Task6 {
    public static void main(String[] args) {

        int givenTotalCents = 536;

        int quarters = givenTotalCents / 25; //
        int remainTotalCents = givenTotalCents % 25;
        System.out.println("quarters " + quarters);
        System.out.println("remainTotalCents " + remainTotalCents);

        int dimes = remainTotalCents/10;
        System.out.println("dimes " + dimes);
        int remainAfterDime = remainTotalCents % 10;
        System.out.println(remainAfterDime + " after dime remains");

        int nickels = remainAfterDime / 5;
        System.out.println("nickels " + nickels);
        int remainAfterNickel = remainAfterDime % 5;

        System.out.println(remainAfterNickel + " remain after nickels");

        int pennies = remainAfterNickel / 1;
        System.out.println(" pennies " + pennies );

        double given = givenTotalCents;

        System.out.println("$"+(given/100) + " will make  "+ quarters + " quarters "+ dimes + " dimes "+ nickels + " nickels " + pennies + " pennies" );


    }
}
