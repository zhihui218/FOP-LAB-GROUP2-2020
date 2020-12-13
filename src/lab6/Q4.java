package lab6;

/**
 *
 * @author TING WEI JING
 */
public class Q4 {

    public static void main(String[] args) {
        
        // process
        System.out.println(findEuclidean(24, 8));
        System.out.println(findGCD(24, 8));
        System.out.println(findEuclidean(200, 625));
        System.out.println(findGCD(200, 625));
        // output
    }

    public static int findEuclidean(int x, int y) {
        int big = Math.max(x, y);
        int small = Math.min(x, y);
        x = big;
        y = small;
        int remainder;
        
        do {
            remainder = x % y;
            x = y;
            y = remainder;
        }
        while(remainder != 0);

        return x;
    }
    
    public static int findGCD(int x, int y) {
        for(int i = Math.min(x, y); i > 0; i--) {
            if(x % i == 0 && y % i == 0) {
                return i;
            } // i = 1
        }
        
        return 1;
    }

}
