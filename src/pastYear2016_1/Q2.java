package pastYear2016_1;

import java.util.Random;
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        // declare & initialize
        Scanner sc = new Scanner(System.in);
        Random rdm = new Random();
        int playerChoice = 0;
        int comChoice = 0;
        int playerScore = 0;
        int comScore = 0;

        // input
        // process
        while(playerScore < 3 && comScore < 3) { // condition
            System.out.print("Enter 1.Paper 2.Scissor 3.Rock: ");
            playerChoice = sc.nextInt();

            String temp = convertChoice(0); // method call.. // temp = ""

            comChoice = rdm.nextInt(3) + 1; // 1 to 3

            System.out.printf("Player : %s ----- Computer : %s %n",
                              convertChoice(playerChoice),
                              convertChoice(comChoice));

            int magicValue = playerChoice * 10 + comChoice; // 1, 2 = 12
            if(magicValue % 11 == 0) {
                System.out.println("Draw");
            }
            switch(magicValue) {
                // player wins cases
                case 13:
                case 21:
                case 32:
                    System.out.printf("Player win %d time(s) %n", ++playerScore);
                    break;

                // computer wins cases
                case 12:
                case 23:
                case 31:
                    System.out.printf("Computer win %d time(s) %n", ++comScore);
                    break;
            }
        }

        // output
        if(playerScore > comScore) {
            System.out.println("Player wins the game");
        }
        else{
            System.out.println("Computer wins the game");
        }
    }

    // return type is String
    public static String convertChoice(int choice) {
        switch(choice) {
            case 1:
                return "Paper";
            case 2:
                return "Scissor";
            case 3:
                return "Rock";

            default:
                return "";

        }
    }

}
