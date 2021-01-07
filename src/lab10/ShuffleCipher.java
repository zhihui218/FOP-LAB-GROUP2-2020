package lab10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author TING WEI JING
 */
public class ShuffleCipher implements MessageEncoder {

    private String inputFileName;
    private String outputFileName;
    private int shuffleNumber;

    public ShuffleCipher(String inputFileName, String outputFileName, int shuffleNumber) {
        this.inputFileName = inputFileName;
        this.outputFileName = outputFileName;
        this.shuffleNumber = shuffleNumber;
    }

    public void encode() {
        try {
            Scanner sc = new Scanner(new FileInputStream(inputFileName));
            PrintWriter output = new PrintWriter(new FileOutputStream(outputFileName));
            while(sc.hasNext()) {
                String hold = sc.nextLine();
                for(int i = 0; i < shuffleNumber; i++) {
                    hold = encode(hold);
                }
                output.println(hold);
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
                for(int i = 0; i < shuffleNumber; i++) {
                    hold = decode(hold);
                }
                output.println(hold);
            }
            sc.close();
            output.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }

    // Math ceil 2.5 => 3, 3.8 => 4
    @Override
    public String encode(String plainText) {
        StringBuilder chiperTextSb = new StringBuilder();
        String upperHalf = plainText.substring(0, (int) Math.floor(plainText.length() / 2));
        String lowerHalf = plainText.substring((int) Math.floor(plainText.length() / 2));

        for(int i = 0; i < Math.min(upperHalf.length(), lowerHalf.length()); i++) {
            chiperTextSb.append(upperHalf.charAt(i));
            chiperTextSb.append(lowerHalf.charAt(i));
        }

        if(lowerHalf.length() > upperHalf.length()) {
            chiperTextSb.append(lowerHalf.charAt(lowerHalf.length() - 1));
        }
        return chiperTextSb.toString();
    }

    @Override
    public String decode(String chiperText) {
        StringBuilder upperHalf = new StringBuilder();
        StringBuilder lowerHalf = new StringBuilder();

        for(int i = 0; i < (chiperText.length() / 2) * 2; i += 2) {
            upperHalf.append(chiperText.charAt(i));
            lowerHalf.append(chiperText.charAt(i + 1));
        }

        if(chiperText.length() % 2 == 1) {
            lowerHalf.append(chiperText.charAt(chiperText.length() - 1));
        }

        return upperHalf.append(lowerHalf).toString();
    }

}
