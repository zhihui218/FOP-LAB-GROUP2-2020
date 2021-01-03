package lab9;

/**
 *
 * @author TING WEI JING
 */
public class Circle extends Shape {

    private double diameter;

    public Circle() {
        super("Circle", 0, 0);
    }

    public void setDiameter() {
        System.out.print("Diameter of circle (m): ");
        diameter = sc.nextDouble();
    }

    public void calPerimeter() {
        setPerimeter(2 * Math.PI * diameter / 2);
    }

    public void calArea() {
        setArea(Math.PI * Math.pow(diameter / 2, 2));
    }

}
