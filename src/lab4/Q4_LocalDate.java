package lab4;

import java.util.Scanner;
import java.time.LocalDate;

/**
 *
 * @author TING WEI JING
 */
public class Q4_LocalDate {

    public static void main(String[] args) {
        // declare & initialize
        Scanner sc = new Scanner(System.in);
        LocalDate localDate;
        int year;
        int dayOfMay;
        int dayOfAugust;

        // input
        year = sc.nextInt();
        localDate = LocalDate.of(year, 5, 1); // get the first day of May

        // process & output
        dayOfMay = localDate.getDayOfWeek().getValue(); 
        dayOfAugust = localDate.withMonth(8).getDayOfWeek().getValue();

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
