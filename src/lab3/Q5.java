package lab3;

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        // declare & initialize
        Scanner sc = new Scanner(System.in);
        double a, b, c, d, e, f;
        char[] variables = {'a', 'b', 'c', 'd', 'e', 'f'};
        double[] values = new double[6];
        a = b = c = d = e = f = 0;
        double x, y;
        
        x = y = 0;

        // input
//        System.out.print("a = ");
//        a = sc.nextInt();
//        System.out.print("b = ");
//        b = sc.nextInt();
//        System.out.print("c = ");
//        c = sc.nextInt();
//        System.out.print("d = ");
//        d = sc.nextInt();
//        System.out.print("e = ");
//        e = sc.nextInt();
//        System.out.print("f = ");
//        f = sc.nextInt();
        for(int i = 0; i < variables.length; i++) { // 0, 1, 2, 3, 4, 5, 6
            System.out.print(variables[i]+" = ");
            values[i] = sc.nextInt();
        }
        a = values[0];
        b = values[1];
        c = values[2];
        d = values[3];
        e = values[4];
        f = values[5];
        
        
        // process
        if((a * d - b * c) == 0) {
            System.out.println("The equation has no solution");
            System.exit(0);
        }
        
        x = (e * d - b * f) / (a * d - b * c);
        y = (a * f - e * c) / (a * d - b * c);
        
        
        // output
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

}
