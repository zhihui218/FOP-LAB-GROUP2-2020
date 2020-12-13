package lab6;

import java.util.Arrays;

/**
 *
 * @author TING WEI JING
 */
public class Q3 {

    public static void main(String[] args) {
        // declare & initialize
        int[] intArr = {1234, 00000, 10000, 10, 456456, 3423, 4545, 234234, 11112, 99};
        
        
        // process
        reverseIntInArr(intArr);
        
        // output
        System.out.println(Arrays.toString(intArr));
    }
    
    public static void reverseIntInArr(int[] intArr) {
        for(int i = 0; i < intArr.length; i++) {
            int result = 0;
            do{
                result *= 10;
                result += intArr[i] % 10;
                intArr[i] = intArr[i] / 10;
            }while(intArr[i] != 0);
            
            intArr[i] = result;
        }
    }
    

}
