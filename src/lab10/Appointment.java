package lab10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author TING WEI JING
 */
public class Appointment implements Searchable {

    private int year;
    private int month;
    private int day;
    private int startHour;
    private int endHour;
    LocalDateTime start;
    LocalDateTime end;
    static LocalDateTime[] startAppointmentArr;
    static LocalDateTime[] endAppointmentArr;
    static DateTimeFormatter dtf = DateTimeFormatter.ofPattern​("yyyy-MM-dd-HH");

    public Appointment(int year, int month, int day, int startHour, int endHour) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.startHour = startHour;
        this.endHour = endHour;

        start = LocalDateTime.of(this.year, this.month, this.day, this.startHour, 0);
        end = LocalDateTime.of(this.year, this.month, this.day, this.endHour, 0);
    }

    public static void readAppointmentFile(String filePath) {
        try {
            Scanner sc = new Scanner(new FileInputStream(filePath));
            String hold;
            String[] record;
            int arrSize = sc.nextInt();
            
            startAppointmentArr = new LocalDateTime[arrSize];
            endAppointmentArr = new LocalDateTime[arrSize];
            
            if(arrSize == 0) {
                sc.close();
                return;
            }
            sc.nextLine();


            for(int i = 0; i < arrSize; i++) {
                hold = sc.nextLine();
                record = hold.split("-", 2);
                startAppointmentArr[i] = LocalDateTime.parse(record[1], dtf); // Integer.parseInt(String)
                hold = sc.nextLine();
                record = hold.split("-", 2);
                endAppointmentArr[i] = LocalDateTime.parse(record[1], dtf);
            }
        }
        catch(FileNotFoundException ex) {
            System.out.println(ex);
        }
    }
    
    public void makeAppointment(String filePath) {
        if(startAppointmentArr != null && endAppointmentArr != null && search(start, end)) {
            try {
                PrintWriter out = new PrintWriter(new FileWriter(filePath));
                LocalDateTime[] newStartArr = new LocalDateTime[startAppointmentArr.length + 1];
                LocalDateTime[] newEndArr = new LocalDateTime[endAppointmentArr.length + 1];

                // copy back the elements of array
                System.arraycopy(startAppointmentArr, 0, newStartArr, 0, startAppointmentArr.length);
                System.arraycopy(endAppointmentArr, 0, newEndArr, 0, endAppointmentArr.length);
                // arraycopy(<oriArr>, <oriStartIndex>, <newArr>, <newStartIndex>, <maxLength>)
                startAppointmentArr = newStartArr;
                endAppointmentArr = newEndArr;
                
                
                startAppointmentArr[startAppointmentArr.length - 1] = start;
                endAppointmentArr[endAppointmentArr.length - 1] = end;
                
                // write to file
                out.println(startAppointmentArr.length);
                for(int i = 0; i < startAppointmentArr.length; i++) {
                    out.println("Start-" + startAppointmentArr[i].format(dtf));
                    out.println("End-" + endAppointmentArr[i].format(dtf));
                }
                out.close();
            }
            catch(IOException ex) {
                System.out.println(ex);
            }
        }
    }

    @Override
    public boolean search(LocalDateTime dateStartTime, LocalDateTime dateEndTime) {
        if(startAppointmentArr == null && endAppointmentArr == null) {
            return false;
        }

        for(int i = 0; i < startAppointmentArr.length; i++) {
            if(startAppointmentArr[i].equals(dateStartTime)) {
                System.out.println("Start time crushes with another appointment.");
                return false;
            }
            if(endAppointmentArr[i].equals(dateEndTime)) {
                System.out.println("End time crushes with another appointment");
                return false;
            }
            if(startAppointmentArr[i].isBefore(dateEndTime) && endAppointmentArr[i].isAfter(dateEndTime)) {
                System.out.println("Another appointment haven't end at that time");
                return false;
            }
            if(startAppointmentArr[i].isBefore(dateStartTime) && endAppointmentArr[i].isAfter(dateStartTime)) {
                System.out.println("Another appointment will start at that time");
                return false;
            }
        }
        System.out.println("Success");
        return true;
    }

}
