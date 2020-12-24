package lab8;

import java.util.Scanner;

/**
 *
 * @author TING WEI JING
 */
public class WeightCalculator {
    private int age;
    private double height;

    public WeightCalculator() {
        this(0,0);
        input();
    }

    public WeightCalculator(int x, int y) {
        age = x;
        height = y;
    }

    public double recomWeight() {
        return (double) (height - 100 + age / 10) * 0.9;
    }

    public void displayAll() {
        System.out.println("Your age: " + age);
        System.out.println("Your height: " + height + "cm");
        System.out.println("Recommend weight: " + recomWeight() + "kg");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        height = sc.nextDouble();
    }
    
}
