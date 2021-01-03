package lab9;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author TING WEI JING
 */
public class DiceGame {

    private Random rdm = new Random();
    private static boolean win = false;
    
    protected int score;
    protected String name;
    
    private int holdRoll; // score of current dice
    private int numPlayer;

    protected void startGame() {
        // register players
        Scanner sc = new Scanner(System.in);
        System.out.print("How many players? -> ");
        numPlayer = sc.nextInt();
        sc.nextLine();
        PlayerProfile[] player = new PlayerProfile[numPlayer];
        
        // input name
        for(int i = 0; i < numPlayer; i++) {
            player[i] = new PlayerProfile();
            System.out.print("Please enter player " + (i + 1) + " name: ");
            String putName = sc.nextLine();
            player[i].setName(putName);
        }
        
        // 1st game
        System.out.println("FIRST DICE GAME!!!!");
        Outer:
        do {
            for(int i = 0; i < numPlayer; i++) {
                player[i].rollDiceOne();
                if(win) {
                    break Outer;
                }
            }
        }
        while(!win);
        win = false;
        
        for(int i = 0; i < numPlayer; i++) {
            player[i].clearScore();
        }
        
        // 2nd game
        System.out.println("SECOND DICE GAME!!!!");
        do {
            for(int i = 0; i < numPlayer; i++) {
                player[i].rollDiceTwo();
                if(win) {
                    break;
                }
            }
        }
        while(!win);
    }

    public void rollDiceOne() {
        int roll1 = rdm.nextInt(6) + 1; // 1 -6
        System.out.println(name + " 1st roll: " + roll1);
        int roll2 = rdm.nextInt(6) + 1;
        System.out.println(name + " 2nd roll: " + roll2);
        score += roll1 + roll2;
        System.out.println(name + " total score: " + score);
        win = score >= 100;
        if(win) {
            System.out.println(name + " wins!");
            return;
        }
        if(roll1 == roll2) {
            System.out.println("Roll again!!!");
            rollDiceOne(); // recursion
        }
    }

    public void rollDiceTwo() {
        int roll = rdm.nextInt(6) + 1;
        holdRoll += roll;
        System.out.println(name + " roll: " + roll);
        if(holdRoll == 12) { // guard condition
            System.out.println("You get another 6 again, sorry!");
            return;
        }

        score += roll;
        System.out.println(name + " total score: " + score);
        win = score == 100;
        if(score > 100) {
            System.out.println("Opps! Your score is more than 100.");
            score -= roll;
            System.out.println(name + " total score: " + score);
            return;
        }
        if(win) {
            System.out.println(name + " wins!");
            return;
        }
        if(roll == 6) {

            System.out.println("Roll again!!!");
            rollDiceTwo();

        }
        holdRoll = 0;
    }

}
