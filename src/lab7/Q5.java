package lab7;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/**
 *
 * @author TING WEI JING
 */
public class Q5 {

    public static void main(String[] args) {
        // declare & initialize
        int size;
        String[] nameArr;
        int[] ageArr;
        char[] genderArr;
        int[] indexArr;
        boolean sortable = true;

        // read binary^
        try {

            ObjectInputStream input = new ObjectInputStream(new FileInputStream("D:\\User\\Documents/3. Second Year Sem 1/Demo\\Lab Question\\person.dat"));

            try {
                size = input.readInt();
                nameArr = new String[size];
                ageArr = new int[size];
                genderArr = new char[size];
                indexArr = new int[size];
                
                for(int i = 0; i < size; i++) {
                    nameArr[i] = input.readUTF();
                    ageArr[i] = input.readInt();
                    genderArr[i] = input.readChar();
                }

                // sort
                for(int i = 0; i < indexArr.length; i++) {
                    indexArr[i] = i; //{0, 1, 2, 3...}
                }

                while(sortable) {
                    sortable = false;

                    for(int i = 0; i < indexArr.length - 1; i++) {
                        if(nameArr[indexArr[i]].compareTo(nameArr[indexArr[i + 1]]) > 0) {
                            int temp = indexArr[i];
                            indexArr[i] = indexArr[i + 1];
                            indexArr[i + 1] = temp;
                            sortable = true;
                        }
                    }

                }

                // output
                for(int i = 0; i < indexArr.length; i++) {
                    System.out.printf("%-20s %5d %s\n", nameArr[indexArr[i]], ageArr[indexArr[i]], (genderArr[indexArr[i]] == 'M') ? "Male" : "Female");
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

    }

}
