package lab9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author TING WEI JING
 */
public class Student extends PersonProfile {

    private String[] courseName;
    private String[] courseCode;
    private int[] sem;
    private int[] session;
    private int[] mark;
    private int numOfRecord;

    // "D:/User/Documents/3. Second Year Sem 1/Demo/Lab Question/course.txt"
    public Student(String name, char gender, int year, int month, int date, String fileName) {
        super(name, gender, year, month, date);
        try {
            Scanner sc = new Scanner(new FileInputStream(fileName));
            // get the number of record
            do {
                numOfRecord++;
                sc.nextLine();
            }
            while(sc.hasNextLine());
            sc.close();

            numOfRecord /= 5;

            // initialize
            courseName = new String[numOfRecord];
            courseCode = new String[numOfRecord];
            sem = new int[numOfRecord];
            session = new int[numOfRecord];
            mark = new int[numOfRecord];

            // read the contents
            sc = new Scanner(new FileInputStream(fileName));
            for(int i = 0; i < numOfRecord; i++) {
                courseCode[i] = sc.nextLine();
                courseName[i] = sc.nextLine();
                sem[i] = Integer.parseInt(sc.nextLine()); // sc.nextInt()
                session[i] = Integer.valueOf(sc.nextLine()); // sc.nextInt() 
                mark[i] = Integer.valueOf(sc.nextLine());
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("File Not Found");
        }
    }

    public String getGrade(int mark) {
        if(mark < 35) {
            return "F";
        }
        else if(mark < 45) {
            return "E";
        }
        else if(mark < 50) {
            return "D";
        }
        else if(mark < 55) {
            return "C";
        }
        else if(mark < 60) {
            return "C+";
        }
        else if(mark < 65) {
            return "B-";
        }
        else if(mark < 70) {
            return "B";
        }
        else if(mark < 75) {
            return "B+";
        }
        else if(mark < 85) {
            return "A-";
        }
        else {
            return "A";
        }
    }

    @Override // overwrite
    public void display() {
        super.display();

        for(int i = 0; i < numOfRecord; i++) {
            System.out.println("--------------------------------");
            System.out.println("Course Code: \t" + courseCode[i]);
            System.out.println("Course Name: \t" + courseName[i]);
            System.out.println("Session: \t" + session[i]);
            System.out.println("Semester: \t" + sem[i]);
            System.out.println("Grade: \t\t" + getGrade(mark[i]));
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        
        for(int i = 0; i < numOfRecord; i++) {
            sb.append("--------------------------------\n");
            sb.append("Course Code: \t" + courseCode[i] + "\n");
            sb.append("Course Name: \t" + courseName[i] + "\n");
            sb.append("Session: \t" + session[i] + "\n");
            sb.append("Semester: \t" + sem[i] + "\n");
            sb.append("Grade: \t\t" + getGrade(mark[i]) + "\n");
        }
        return sb.toString();
    }

}
