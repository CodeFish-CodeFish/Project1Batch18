package project_03;

import java.util.Scanner;

public class MusicBox {

    public static void main(String[] args) {

        /*
        Requirements:
            Task: Create an app that will provide music service based below given music genres.
                  Ask the user using scanner to choose genre, from there ask the user to choose song from
                  one of those songs. Greet the user with a proper message

            1. We are given 3 musical genres, they're: Classical, Pop and Country
               Each genre consist of five (5) songs they're: Classical -> Four Seasons, Fur Elis, Finlandia, Voalize, The Planets
                                                             Pop -> Bad Guy, Talk, Please Me, 7 Rings, Without Me
                                                             Country -> Meant To Be, Heaven, Simple One Number Away, Get Along

            2. Application should run until user types "exit" with a proper message "Exiting application, Goodbye!"
            3. Classical song costs = $2, Pop = $4, Country = $3
            4. If user provides enough money, application prompt a message saying "Thanks for your payment, 'name of the song' is playing. Enjoy"
            5. If user provides not enough money, application should prompt a message saying "sorry your funds are not enough to play this song" application should not shut down
            6. If user provides more money, application should say "you entered money[count that money] please wait for your change" "'name of the song' is playing. Enjoy"
            7. In all cases, application should not shut down until user types "exit", it should always keep running
            8.


         */


        System.out.println("Hello this is music box application");
        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("Please enter the music type(or type exit to exit the application) : ");
            System.out.println("Available music genres are Classical, Pop, and Country");

            String musicType = scanner.nextLine();
            if (musicType.equalsIgnoreCase("exit")) {
                System.out.println("Application is closing, thank you. Goodbye!");
                break;
            }

            switch (musicType.toLowerCase()) {

                case "classical":
                    System.out.println("Available songs under Classical music :");
                    System.out.println("Four Seasons, Fur Elis, Finlandia, Voalize, The Planets");
                    break;
                case "pop":
                    System.out.println("Available songs under Pop music :");
                    System.out.println("Bad Guy, Talk, Please Me, 7 Rings, Without Me");
                    break;
                case "country":
                    System.out.println("Available songs under Country music :");
                    System.out.println("Meant To Be, Heaven, Simple One Number Away, Get Along");
                    break;
                default:
                    System.out.println(musicType + " is not available" + "belong here");
            }


            System.out.println("Which one of these songs do you want to listen?");
            String chosenSong = scanner.nextLine();

            switch (musicType.toLowerCase()){

                case "classical":

                    switch (chosenSong.toLowerCase()){
                        case "four seasons":
                        case "fur elise":
                        case "finlandia":
                        case "vocalize":
                        case "the planets":
                            System.out.println("Please enter $2 for this song ");
                            break;
                        default:
                            System.out.println(chosenSong + " is not available" + "talk");
                            continue;
                    }
                    break;

                case "pop":
                    switch (chosenSong.toLowerCase()){
                        case "bad guy":
                        case "talk":
                        case "please me":
                        case "7 rings":
                        case "without me":
                            System.out.println("Please enter $4 for this song ");
                            break;
                        default:
                            System.out.println(chosenSong + " is not available");
                            continue;
                    }
                    break;

                case "country":
                    switch (chosenSong.toLowerCase()){
                        case "meant to be":
                        case "heaven":
                        case "simple":
                        case "one number away":
                        case "get along":
                            System.out.println("Please enter $3 for this song ");
                            break;
                        default:
                            System.out.println(chosenSong + " is not available" + "something");
                            continue;
                    }
                    break;

            }

            int priceSong = scanner.nextInt();
            int expectedPrice;

            switch (musicType.toLowerCase()){
                case "classical":
                    expectedPrice = 2;
                    break;
                case "pop":

                    expectedPrice = 4;
                    break;

                case "country":

                    expectedPrice = 3;
                    break;


                default:
                    continue;
            }

            if (priceSong < expectedPrice){
                System.out.println("You entered not enough money, try again later");
            } else if (priceSong == expectedPrice) {
                System.out.println(chosenSong + " is playing now, please enjoy");
            }else {
                int change = priceSong - expectedPrice;

                System.out.println("You entered $ " + change + " extra. Please wait for your change");

                System.out.println(chosenSong + " is playing now, please enjoy");
            }

            scanner.nextLine();

        } while (true);

        scanner.close();
    }
}
