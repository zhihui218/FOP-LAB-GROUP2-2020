package lab4;

import static java.lang.System.out;
import java.util.Random;

/**
 *
 * @author TING WEI JING
 */
public class Q5 {

    public static void main(String[] args) {
        // declare & initialize
        Random rdm = new Random();
        int diceP1 = 0;
        int diceP2 = 0;
        int scoreP1 = 0;
        int scoreP2 = 0;
        int round = 1;

        // process + output
        outer:
        do {
            out.println("====================== ROUND " + round + " =============================");
            // Player 1
            do {
                diceP1 = rdm.nextInt(6) + 1;
                out.println("Player 1 rolls -> " + diceP1);
                scoreP1 += diceP1;
                if(scoreP1 > 100) {
                    break outer;
                }
            }
            while(diceP1 == 6);

            // Player 2
            do {
                diceP2 = rdm.nextInt(6) + 1;
                out.println("Player 2 rolls -> " + diceP2);
                scoreP2 += diceP2;
                if(scoreP2 > 100) {
                    break outer;
                }
            }
            while(diceP2 == 6);

            out.println("Player 1's score = " + scoreP1 + "\nPlayer 2's score = " + scoreP2);
            round++;
        }
        while(true);

        // result
        out.println("Player 1's score = " + scoreP1 + "\nPlayer 2's score = " + scoreP2);
        if(scoreP1 > scoreP2) {
            out.println("Player 1 wins!");
        }
        else {
            out.println("Player 2 wins!");
        }
    }

}
