package lab6;

/**
 *
 * @author TING WEI JING
 */
public class Q6 {

    public static void main(String[] args) {
        // initialize & declare
        int palinPrimCount = 0;
        int emirpCount = 0;

        // process & output
        // palin prime
        int i = 2;
        while(palinPrimCount < 20) {
            if(checkPalinPrim(i)) {
                System.out.print(i + " ");
                palinPrimCount++;
            }
            i++;
        }

        System.out.println("");

        i = 2;
        while(emirpCount < 20) {
            if(checkEmirp(i)) {
                System.out.print(i + " ");
                emirpCount++;
            }
            i++;
        }
    }

    public static boolean checkPalinPrim(int num) {

        // check prime
        if(!checkPrime(num)) {
            return false;
        }

        // reverse
        int reverse = getReverse(num);

        // check palindromic
        return num == reverse;
    }

    public static boolean checkEmirp(int num) {

        if(!checkPrime(num)) {
            return false;
        }

        int reverse = getReverse(num);

        if(!checkPrime(reverse)) {
            return false;
        }

        return reverse != num;
    }

    static boolean checkPrime(int num) {
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int getReverse(int num) {
        int reverse = 0;
        do {
            reverse *= 10;
            reverse += num % 10;
            num = num / 10;
        }
        while(num != 0);
        return reverse;
    }

}
