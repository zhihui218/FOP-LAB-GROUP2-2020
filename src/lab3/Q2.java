package lab3;

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        // declare & initialize
        Random rdm = new Random();
        int rdmValue = 0;
        String numInWord = "";
        
        // process
        rdmValue = rdm.nextInt(6);
        switch(rdmValue) {
            case 0:
                numInWord = "zero";
                break;
                
            case 1:
                numInWord = "one";
                break;
                
            case 2:
                numInWord = "two";
                break;
                
            case 3:
                numInWord = "three";
                break;
                
            case 4:
                numInWord = "four";
                break;
                
            case 5:
                numInWord = "five";
                break;
        }
        
        // output
        System.out.printf("%d is %s. \n", rdmValue, numInWord);
        
    }
}
