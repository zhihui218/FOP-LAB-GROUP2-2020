package lab7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author TING WEI JING
 */
public class Q3 {

    public static void main(String[] args) {
        // declare & initialize
        String content = "Hi! Im UM student.";
        StringBuilder reverseSB = new StringBuilder(content);

        // write into text
        try {
            PrintWriter output = new PrintWriter(new FileOutputStream("reverse.txt."));
            
//            for(int i = content.length() - 1; i > -1 ; i--) {
//                reverseSB.append(content.charAt(i));
//            }
            
            output.print(reverseSB.reverse().toString());
            output.close();
        }
        catch(IOException e) {
            System.out.println("Problem with file output.");
        }

    }

}
