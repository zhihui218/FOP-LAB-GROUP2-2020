package lab8;

import java.text.DecimalFormat;

/**
 *
 * @author TING WEI JING
 */
public class Money {

    static DecimalFormat df = new DecimalFormat("#.00");
    private double amount;
    static final int[] NOTE_ARR = {100, 50, 10, 5, 1};
    static final int[] COIN_ARR = {50, 20, 10, 5};
    int[] noteCount = new int[NOTE_ARR.length];
    int[] coinCount = new int[COIN_ARR.length];

    public Money(double amount) {
        this.amount = Double.parseDouble(df.format(amount));
        this.amount *= 100; // 10.51 -> 1051
        if(this.amount % 10 < 3) {
            this.amount = (double) (((int) (this.amount / 10)) / 10);
        }
        else if(this.amount % 10 < 8) {
            this.amount = (double) (((int) (this.amount / 10)) / 10) + 0.05;
        }
        else {
            this.amount = (double) (((int) (this.amount / 10)) / 10) + 0.1;
        }

    }

    public void calNoteAndCoin() {
        double tempAmount = amount;
        for(int i = 0; i < NOTE_ARR.length; i++) {
            if(tempAmount > NOTE_ARR[i]) {
                noteCount[i] = (int) tempAmount / NOTE_ARR[i]; //2
                tempAmount -= noteCount[i] * NOTE_ARR[i];
            }
        }
        // RM 200.00
        if((tempAmount * 100) % 100 > COIN_ARR[COIN_ARR.length - 1]) {
            tempAmount *= 100;
            for(int i = 0; i < COIN_ARR.length; i++) {
                if(tempAmount > COIN_ARR[i]) {
                    coinCount[i] = (int) tempAmount / COIN_ARR[i]; //2
                    tempAmount -= coinCount[i] * COIN_ARR[i];
                }
            }
        }
    }

    public void displayNoteAndCoin() {
        calNoteAndCoin();
        for(int i = 0; i < NOTE_ARR.length; i++) {
            if(noteCount[i] != 0) {
                System.out.printf("RM %3d : %d\n", NOTE_ARR[i], noteCount[i]);
            }
        }
        for(int i = 0; i < COIN_ARR.length; i++) {
            if(coinCount[i] != 0) {
                System.out.printf("%2d cent : %d\n", COIN_ARR[i], coinCount[i]);
            }
        }
    }

    public void displayAmount() {
        System.out.println("RM " + df.format(amount));
    }

    public void subtraction(Money obj) {
        this.amount -= obj.amount;
    }

    public void addition(Money obj) {
        this.amount += obj.amount;
    }

}
