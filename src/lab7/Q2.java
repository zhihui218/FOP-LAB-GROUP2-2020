package lab7;

import java.util.*;
import java.net.*;
import java.io.*;

/**
 *
 * @author TING WEI JING
 */
public class Q2 {

    public static void main(String[] args) {
        // declare & initialize
        StringBuilder contentSB = new StringBuilder();
        String a = "A";
        
        // read web
        try {
            URL u = new URL("https://fsktm.um.edu.my");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            Scanner in = new Scanner(stream);
            
            do {
                contentSB.append(in.nextLine());
            }
            while(in.hasNextLine());

            PrintWriter output = new PrintWriter(new FileOutputStream("index.htm"));
            output.println(contentSB.toString());

            output.close();

        }
        catch(IOException e) {
            System.out.println("IO Error:" + e.getMessage());
        }
    }

}
