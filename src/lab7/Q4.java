package lab7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author TING WEI JING
 */
public class Q4 {

    public static void main(String[] args) {
        // declare & initialize
        int charNum = 0;
        int wordNum = 0;
        int lineNum = 0;
        
        // read text
        try {
            Scanner input = new Scanner(new FileInputStream("message.txt"));

            while(input.hasNextLine()) { //check end of text file
                String sentence = input.nextLine();
                lineNum++;
                for(int i = 0; i < sentence.length(); i++) {
                    if(Character.isLetter(sentence.charAt(i)) || Character.isDigit(sentence.charAt(i))) {
                        charNum++;
                    }
                }
                
                wordNum += sentence.split(" ").length;
            }
            
            input.close();
        }
        catch(FileNotFoundException e) {
            System.out.println("File was not found");
        }

        // output
        System.out.println(charNum);
        System.out.println(wordNum);
        System.out.println(lineNum);
        
    }

}
