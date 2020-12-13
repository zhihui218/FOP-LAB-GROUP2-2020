package lab6;

/**
 *
 * @author TING WEI JING
 */
public class Q2 {

    public static void main(String[] args) {
        // initialize & declare
        int height = 4;
        int upper;
        int lower;
        
        // process & output
        // triangle
        for(int i = 0; i < height; i++) {
            multiPrint(height - 1 - i, ' ');
            multiPrint(1 + i * 2, '*');
            System.out.println("");
        }

        // diamond
        height = 7; // assume odd
        upper = (int) height / 2 + 1;
        lower = (int) height / 2;
        
        for(int i = 0; i < upper; i++) {
            multiPrint(upper - 1 - i, ' ');
            multiPrint(1 + i * 2, '*');
            System.out.println("");
        }
        
        for(int i = 0; i < lower; i++) {
            multiPrint(i + 1, ' ');
            multiPrint(((lower - i) * 2) - 1, '*');
            System.out.println("");
        }

    }

    public static void multiPrint(int n, char c) {
        // JDK 11
        String str = c + " "; // 1
//        str = Character.toString(c);// 2
//        str = String.valueOf(c); // 3

        str = str.repeat(n);
        System.out.print(str);

//        StringBuilder sb = new StringBuilder();
//        
//        for(int i = 0; i < n; i++) {
//            sb.append(c); // string += ""+c;
//        }
//        System.out.println(sb.toString());
    }

}
