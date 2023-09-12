package project_03;

import java.util.Scanner;

public class TestSolution {

    public static void main(String[] args) {
        System.out.println("Hello This is music box application");
        Scanner scanner = new Scanner(System.in);
//        String musicType;
        do {
            System.out.println("Please enter the music type (or 'exit' to quit): ");
            System.out.println("Available music types are Classical, Pop, and Country.");
//            Scanner scanner = new Scanner(System.in);
            String musicType = scanner.nextLine();
            if (musicType.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the application. Goodbye!");
                break;
            }
            switch (musicType.toLowerCase()) {
                case "classical":
                    System.out.println("Available songs under Classical music:");
                    System.out.println("Four Seasons, Fur Elise, Finlandia, Vocalize, The Planets");
                    break;
                case "pop":
                    System.out.println("Available songs under Pop music:");
                    System.out.println("Bad guy, Talk, Please Me, 7 Rings, Without Me");
                    break;
                case "country":
                    System.out.println("Available songs under Country music:");
                    System.out.println("Meant to Be, Heaven, Simple, One Number Away, Get Along");
                    break;
                default:
                    System.out.println(musicType + " music category is not available.");
                    continue;
            }
            System.out.print("Which one do you want to listen? ");
            String chosenSong = scanner.nextLine();
            switch (musicType.toLowerCase()) {
                case "classical":
                    switch (chosenSong.toLowerCase()) {
                        case "four seasons":
                        case "fur elise":
                        case "finlandia":
                        case "focalise":
                        case "the planets":
                            System.out.println("Please enter $2 for this song: ");
                            break;
                        default:
                            System.out.println(chosenSong + " is not available song.");
                            continue;
                    }
                    break;
                case "pop":
                    switch (chosenSong.toLowerCase()) {
                        case "bad guy":
                        case "talk":
                        case "please me":
                        case "7 rings":
                        case "without me":
                            System.out.println("Please enter $4 for this song: ");
                            break;
                        default:
                            System.out.println(chosenSong + " is not available song.");
                            continue;
                    }
                    break;
                case "country":
                    switch (chosenSong.toLowerCase()) {
                        case "meant to be":
                        case "heaven":
                        case "simple":
                        case "one number away":
                        case "get along":
                            System.out.println("Please enter $3 for this song: ");
                            break;
                        default:
                            System.out.println(chosenSong + " is not available song.");
                            continue;
                    }
                    break;
            }
            int songPrice = scanner.nextInt();
            int expectedPrice;
            switch (musicType.toLowerCase()) {
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
            if (songPrice < expectedPrice) {
                System.out.println("ENTERED PRICE IS NOT ENOUGH, PLEASE TRY IT LATER.");
            } else if (songPrice == expectedPrice) {
                System.out.println(chosenSong + " is playing. Enjoy the song!");
            } else {
                int change = songPrice - expectedPrice;
                System.out.println("YOU HAVE ENTERED $" + change + " EXTRA. PLEASE WAIT FOR CHANGE.");
                System.out.println(chosenSong + " is playing. Enjoy the song!");
            }
            scanner.nextLine(); //
        } while (true);
        scanner.close();
    }
}
