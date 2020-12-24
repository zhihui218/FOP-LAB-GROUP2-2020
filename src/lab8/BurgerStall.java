package lab8;

/**
 *
 * @author TING WEI JING
 */
public class BurgerStall {

    private String ID;
    private int burgerSold;
    private static int totalBurger;

    public BurgerStall(String str, int burgerSold) {
        ID = str;
        this.burgerSold = burgerSold;
        totalBurger += burgerSold;
    }

    public void sell(int a) {
        burgerSold += a;
        totalBurger += a;
    }

    public int getBurgerSold() {
        return burgerSold;
    }

    public static int getTotalBurger() {
        return totalBurger;
    }

    public String getID() {
        return ID;
    }

    public void displaySold() {
        System.out.println(ID + " has sold " + burgerSold + " burger.");
    }

    public static void displayTotalSold() {
        System.out.println("Total selling is " + totalBurger);
    }

}
