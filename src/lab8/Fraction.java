package lab8;

import java.util.Scanner;

/**
 *
 * @author TING WEI JING
 */
public class Fraction {

    private int numerator;
    private int dinominator;

    public Fraction(int x, int y) {
        numerator = x;
        dinominator = y;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDinominator() {
        return dinominator;
    }

    public void setDinominator(int dinominator) {
        this.dinominator = dinominator;
    }

    public void displayLowestTerm() {
        int GCD = 1;
        for(int i = Math.max(numerator, dinominator); i > 0; i--) {
            if(numerator % i == 0 && dinominator % i == 0) {
                GCD = i;
                break;
            }
        }
        System.out.println("Original: " + numerator + " / " + dinominator);
        System.out.println("Lowest Term: " + (numerator / GCD) + " / " + (dinominator / GCD));

    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        numerator = sc.nextInt();
        dinominator = sc.nextInt();
    }
    
}
