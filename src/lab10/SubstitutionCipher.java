package lab10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author TING WEI JING
 */
public class SubstitutionCipher implements MessageEncoder {

    private String inputFileName;
    private String outputFileName;
    private int shift;

    public SubstitutionCipher(String inputFileName, String outputFileName, int shift) {
        this.inputFileName = inputFileName;
        this.outputFileName = outputFileName;
        this.shift = shift;
    }

    public void encode() {
        try {
            Scanner sc = new Scanner(new FileInputStream(inputFileName));
            PrintWriter output = new PrintWriter(new FileOutputStream(outputFileName));
            while(sc.hasNext()) {
                String hold = sc.nextLine();
                output.println(encode(hold));
            }
            sc.close();
            output.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }

    }

    public void decode() {
        try {
            Scanner sc = new Scanner(new FileInputStream(inputFileName));
            PrintWriter output = new PrintWriter(new FileOutputStream(outputFileName));
            while(sc.hasNext()) {
                String hold = sc.nextLine();
                output.println(decode(hold));
            }
            sc.close();
            output.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }

    // convert string into char[]
    @Override
    public String encode(String plainText) {
        StringBuilder chiperTextSb = new StringBuilder();
        for(char x : plainText.toCharArray()) {
            chiperTextSb.append((char) (x + shift));
        }
        return chiperTextSb.toString();
    }

    @Override
    public String decode(String chiperText) {
        StringBuilder plainTextSb = new StringBuilder();
        for(char x : chiperText.toCharArray()) {
            plainTextSb.append((char) (x - shift));
            // plainText += (char) (x - shift)
        }
        return plainTextSb.toString();
    }

}
