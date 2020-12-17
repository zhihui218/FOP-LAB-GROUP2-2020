package lab7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author TING WEI JING
 */
public class Qn6 {

    public static void main(String[] args) {
        try {
            Scanner product = new Scanner(new FileInputStream("product.txt"));
            Scanner order = new Scanner(new FileInputStream("order.txt"));
            System.out.printf("%20s%20s%20s%20s%20s", "ProductID", "ProductName", "Quantity", "PricePerUnit", "Total");
            System.out.println("");
            
            while(order.hasNextLine()) {
                String orderList = order.nextLine();
                String[] str = orderList.split(",");
                
                while(product.hasNextLine()) {
                    product = new Scanner(new FileInputStream("product.txt"));
                    String productList = product.nextLine();
                    String[] str2 = productList.split(",");
                    if(productList.contains(str[1])) {
                        double total = Integer.parseInt(str[2]) * Double.parseDouble(str2[2]);
                        System.out.printf("%20s%20s%20s%20s%20.2f", str2[0], str2[1], str[2], str2[2], total);
                    }
                }
                product.reset();
            }
            product.close();
            order.close();
        }
        catch(FileNotFoundException e) {

        }
    }

}
