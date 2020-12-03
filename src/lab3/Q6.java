package lab3;

import static java.lang.System.out;
import java.util.Scanner;

public class Q6 {

    public static void main(String args[]) {
        // declare & initialize
        Scanner sc = new Scanner(System.in);
        double radius;
        double x;
        double y;

        System.exit(0); // if value not equal to zero

        // input
        out.print("Enter the radius of circle (0,0): ");
        radius = sc.nextDouble();
        out.print("Enter coordinate-x: ");
        x = sc.nextInt();
        out.print("Enter coordinate-y: ");
        y = sc.nextInt();

        out.printf("");

//        double z = Double.valueOf("0.12"); // convert string into double
//        Double.parseDouble("0.12");
        // process
        // square root of x^2 + y^2
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        out.println("Distance = " + distance);

        // output
        if(distance <= radius) {
            out.println("The point is inside the circle");
        }
        else {
            out.println("The point is outside the circle");
        }

        String exp = "ABCDE"; // index: 0 to size - 1
        exp.charAt(0); // A
        exp.charAt(1); // B
        exp.charAt(2); // C
        exp.charAt(3); // D
        exp.charAt(4); // E
        exp.charAt(5); // error
    }

}
