package lab8;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author TING WEI JING
 */
public class BankAccount {

    static DecimalFormat df = new DecimalFormat("######.00");
    Scanner sc = new Scanner(System.in);
    private String name;
    private String IC;
    private String passportNum;
    private double depoAmount;

    public BankAccount(String name, String IC, String passportNum, int depoAmount) {
        this.name = name;
        this.IC = IC;
        this.passportNum = passportNum;
        this.depoAmount = depoAmount;
    }

    public void deposit(double x) {
        depoAmount += x;
    }

    public void withdraw(double x) {
        depoAmount -= x;
    }

    public void displayBalance() {
        System.out.println("Current balance: " + df.format(depoAmount));
    }

}
