package pastYear2017_1;

/**
 *
 * @author TING WEI JING
 */
public class Q4Main {

    public static void main(String[] args) {
        Complex complexA = new Complex(10, 2);
        Complex complexB = new Complex(8, 9);
        
        System.out.println(complexA.toString());
        System.out.println(complexB.toString());
        
        complexA.addComplexNumber(complexB);
        System.out.println(complexA);
    }

}
