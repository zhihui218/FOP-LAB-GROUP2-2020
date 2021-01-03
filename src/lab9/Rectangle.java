package lab9;

/**
 *
 * @author TING WEI JING
 */
public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle() {
        super("Rectangle", 0, 0);
    }

    public void setLengthAndWidth() {
        System.out.print("Length of rectangle (m): ");
        length = sc.nextDouble();
        System.out.print("Width of rectangle (m: ");
        width = sc.nextDouble();
    }

    public void calPerimeter() {
        setPerimeter(2 * length + 2 * width);
//        perimeter = 2 * length + 2 * width;
    }

    public void calArea() {
        setArea(length * width);
    }

}
