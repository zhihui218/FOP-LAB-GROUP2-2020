package lab8;

import java.util.Random;

/**
 *
 * @author TING WEI JING
 */
public class Game {
    private String name;
    private int score;
    private static int dice;
    static Random rdm = new Random();
    
    public Game(String str) {
        name = str;
    }
    
    public void rollDice() {
        dice = rdm.nextInt(6) + 1;
        score += dice;
    }
    
    public static void displayDice() {
        System.out.println("Dice:" + dice);
    }
    
    public void displayScore() {
        System.out.println(name+"'s score is " + score);
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

}
