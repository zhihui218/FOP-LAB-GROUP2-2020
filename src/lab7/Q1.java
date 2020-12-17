package lab7;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author TING WEI JING
 */
public class Q1 {

    public static void main(String[] args) {
        // declare & initialize
        String[][] data = new String[4][2];
        String filePath = "coursename.dat";
        ObjectOutputStream output;
        Scanner sc = new Scanner(System.in);
        String targetCourse;
        
        
        // write into binary
        try {
            FileOutputStream fileOut = new FileOutputStream(filePath);
            output = new ObjectOutputStream(fileOut);
            output.writeUTF("WXES1116,Programming I");
            output.writeUTF("WXES1115,Data Structure");
            output.writeUTF("WXES1110,Operating System");
            output.writeUTF("WXES1112,Computing Mathematics I");

            output.close();
        }
        catch(IOException e) {
            System.out.println("Problem with file output.");
        }
        
        // read from binary
        try {

            ObjectInputStream input = new ObjectInputStream(new FileInputStream(filePath));
            
            try {
                for(int i = 0; i < data.length; i++) {
                    String rawStr = input.readUTF();
                    data[i] = rawStr.split(",", 2);
                }
            }
            catch(EOFException e) {
            }

            input.close();
        }
        catch(FileNotFoundException e) {
            System.out.println("File was not found");
        }
        catch(IOException e) {
            System.out.println("Error reading from file");
        }
        
        // input
        targetCourse = sc.nextLine();
        
        // search
        for(int i = 0; i < data.length; i++) {
            if(data[i][0].equals(targetCourse)) {
                System.out.println(data[i][1]);
                System.exit(0);
            }
        }
        System.out.println("Not found");
    }

}
