package lab8;

/**
 *
 * @author TING WEI JING
 */
public class Tester {

    public static void main(String[] args) {
//        Q1();
//        Q2();
//        Q3();
//        Q4();
//        Q5();
//        Q6();
        Q7();
    }

    static void Q1() {
        Number a = new Number();
        Number b = new Number(5);
        Number c = new Number(4, 50);

        a.displayNumber();
        a.displayEven();
        a.displayPrime();
        a.displayMax();
        a.displayMin();
        a.displayAverage();
        a.displaySquare();
    }

    static void Q2() {
        BankAccount acc = new BankAccount("TING", "01234506012345", "111111", 1000);
        acc.deposit(100);
        acc.displayBalance();
        acc.withdraw(500);
        acc.displayBalance();
    }

    static void Q3() {
        WeightCalculator calculator = new WeightCalculator();
        calculator.displayAll();
    }

    static void Q4() {
        Fraction frac1 = new Fraction(10, 100);
        frac1.displayLowestTerm();
    }

    static void Q5() {
        Game ply1 = new Game("Player1");
        Game ply2 = new Game("Player2");
        do {
            ply1.rollDice();
            Game.displayDice();
            ply1.displayScore();
            if(ply1.getScore() >= 100) {
                System.out.println(ply1.getName() + " wins!");
                break;
            }
            ply2.rollDice();
            Game.displayDice();
            ply2.displayScore();
            if(ply2.getScore() >= 100) {
                System.out.println(ply2.getName() + " wins!");
                break;
            }

        }
        while(true);
    }

    static void Q6() {
        BurgerStall stall1 = new BurgerStall("000001", 10);
        BurgerStall stall2 = new BurgerStall("000002", 12);

        stall1.sell(5);
        stall2.sell(25);
        stall1.displaySold();
        stall2.displaySold();
        BurgerStall.displayTotalSold();

    }

    static void Q7() {
        Money wallet1 = new Money(173.11);
        Money wallet2 = new Money(155.17);
        wallet1.displayAmount();
        wallet2.displayAmount();
        
        wallet1.addition(wallet2);
        wallet1.displayAmount();
        
        wallet1.displayNoteAndCoin();
        wallet2.displayNoteAndCoin();
    }

}
