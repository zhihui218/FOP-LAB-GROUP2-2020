package lab9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author TING WEI JING
 */
public class Lecturer extends PersonProfile {

    private String[] courseName;
    private String[] courseCode;
    private int[] sem;
    private int[] session;
    private double[] creditHour;
    private int[] numStud;
    private int numOfRecord;

    // "D:/User/Documents/3. Second Year Sem 1/Demo/Lab Question/lecturer.txt"
    public Lecturer(String name, char gender, int year, int month, int date, String filename) {
        super(name, gender, year, month, date);
        try {
            Scanner sc = new Scanner(new FileInputStream(filename));
            // get the number of record
            do {
                numOfRecord++;
                sc.nextLine();
            }
            while(sc.hasNextLine());
            sc.close();

            numOfRecord /= 6;

            // initialize
            courseName = new String[numOfRecord];
            courseCode = new String[numOfRecord];
            sem = new int[numOfRecord];
            session = new int[numOfRecord];
            creditHour = new double[numOfRecord];
            numStud = new int[numOfRecord];

            // read the contents
            sc = new Scanner(new FileInputStream(filename));
            for(int i = 0; i < numOfRecord; i++) {
                courseCode[i] = sc.nextLine();
                courseName[i] = sc.nextLine();
                sem[i] = Integer.valueOf(sc.nextLine());
                session[i] = Integer.valueOf(sc.nextLine());
                creditHour[i] = Double.valueOf(sc.nextLine());
                numStud[i] = Integer.valueOf(sc.nextLine());
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("File Not Found");
        }
    }

    public double calCreditHour(int numStud, int index) {
        if(numStud < 50) {
            return creditHour[index] * 1;
        }
        else if(numStud < 100) {
            return creditHour[index] * 1.5;
        }
        else if(numStud < 150) {
            return creditHour[index] * 2;
        }
        else {
            return creditHour[index] * 3;
        }
    }

    @Override
    public void display() {
        super.display();
        for(int i = 0; i < numOfRecord; i++) {
            System.out.println("--------------------------------");
            System.out.println("Course Code: \t" + courseCode[i]);
            System.out.println("Course Name: \t" + courseName[i]);
            System.out.println("Session: \t" + session[i]);
            System.out.println("Semester: \t" + sem[i]);
            System.out.println("Credit Hour: \t" + calCreditHour(numStud[i], i));
            System.out.println("Student number: " + numStud[i]);
        }
    }

}
