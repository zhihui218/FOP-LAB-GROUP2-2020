package lab9;

/**
 *
 * @author TING WEI JING
 */
public class Square extends Shape {

    private double length;

    public Square() {
        super("Square", 0, 0);
    }

    public void setLength() {
        System.out.print("Length of square (m): ");
        length = sc.nextDouble();
    }

    public void calPerimeter() {
        setPerimeter(4 * length);
    }

    public void calArea() {
        setArea(length * length);
    }

}

