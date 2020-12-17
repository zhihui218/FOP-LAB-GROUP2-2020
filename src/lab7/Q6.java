package lab7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author TING WEI JING
 */
public class Q6 {

    public static void main(String[] args) {
        // declare & initialize
        String[][] productArr = new String[7][3];
        String[][] orderArr = new String[5][3];

        // read text
        try {
            Scanner input = new Scanner(new FileInputStream("D:\\User\\Documents/3. Second Year Sem 1/Demo\\Lab Question\\product.txt"));
            
            String rawStr;
            
            for(int i = 0; i < productArr.length; i++) {            
                rawStr = input.nextLine();
                productArr[i] = rawStr.split(",");
            }

            input = new Scanner(new FileInputStream("D:\\User\\Documents/3. Second Year Sem 1/Demo\\Lab Question\\order.txt"));

            for(int i = 0; i < orderArr.length; i++) {            
                rawStr = input.nextLine();
                orderArr[i] = rawStr.split(",");
            }
//            System.out.println(Arrays.deepToString(orderArr));
            input.close();
        }
        catch(FileNotFoundException e) {
            System.out.println("File was not found");
        }

        // output
        for(int i = 0; i < orderArr.length; i++) {
            int linkIndex = getLinkIndex(orderArr[i][1], productArr);
            
            if(linkIndex > 0) {
                double total = Integer.parseInt(orderArr[i][2]) * Double.parseDouble(productArr[linkIndex][2]);
                
                System.out.printf("%-10s %-20s %8s %8s %8.2f %n", productArr[linkIndex][0],
                                        productArr[linkIndex][1],
                                        orderArr[i][2],
                                        productArr[linkIndex][2],
                                        total);
            }
            
        }
        
    }

    public static int getLinkIndex(String productID, String[][] productArr) {
        for(int i = 0; i < productArr.length; i++) {
            if(productArr[i][0].equals(productID)) {
                return i;
            }
        }
        
        return -1; // if there is not link found
    }
    
}
