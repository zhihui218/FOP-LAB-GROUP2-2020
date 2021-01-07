package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author TING WEI JING
 */
public class Tester {

    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        while(true) {

            System.out.print("Enter your regex: ");
            String regex = sc.nextLine();
            Pattern pattern = Pattern.compile(regex); // "[zyx]"
            // [\\d]+
            // cnt use this Pattern p = new Patter();
            System.out.print("Enter input string to search: ");
            String target = sc.nextLine();
            Matcher matcher = pattern.matcher(target);

            boolean found = false;
            while(matcher.find()) {
                System.out.printf("I found the text \"%s\" starting at index %d and ending at index %d.%n",
                                  matcher.group(),
                                  matcher.start(),
                                  matcher.end());
                found = true;
            }
            if(!found) {
                System.out.println("No match found.");
            }
        }
    }

}
