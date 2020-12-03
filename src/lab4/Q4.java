package lab4;

import java.util.Scanner;

/**
 *
 * @author TING WEI JING
 */
public class Q4 {

    public static void main(String[] args) {
        // declare & initialize
        Scanner sc = new Scanner(System.in);
        int year;
        int firstDayOfYear;
        int dayOfMay;
        int dayOfAugust;
        boolean isLeapYear;

        // input
        year = sc.nextInt();
        firstDayOfYear = sc.nextInt();

        // process & output
        isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

        if(isLeapYear) {
            dayOfMay = firstDayOfYear + 1 + 1;
        }
        else {
            dayOfMay = firstDayOfYear + 1; // 3 (Wed)

        }

        dayOfMay = dayOfMay % 7; // 7 % 7 = 0 (Mon)  ;   9 % 7 = 2 (Wed)

        // empty space
        for(int offset = 0; offset < dayOfMay; offset++) { // loop 3 times
            System.out.print("\t"); // \t\t\t
        }

        // calendar MAY
        int offsetDay = dayOfMay + 1;
        for(int dayCount = 1; dayCount <= 31; dayCount++) {

            System.out.print(dayCount + "\t");
            if(offsetDay % 7 == 0) {
                System.out.println("");
            }
            offsetDay++;
        }

        // ----
        System.out.println("\n\n");
        // ----

        dayOfAugust = dayOfMay + 1;
        dayOfAugust = dayOfAugust % 7;
        // empty space
        for(int offset = 0; offset < dayOfAugust; offset++) {
            System.out.print("\t");
        }

        // calendar AUGUST
        offsetDay = dayOfAugust + 1;
        for(int dayCount = 1; dayCount <= 31; dayCount++) {

            System.out.print(dayCount + "\t");
            if(offsetDay % 7 == 0) {
                System.out.println("");
            }
            offsetDay++;
        }
    }

}
