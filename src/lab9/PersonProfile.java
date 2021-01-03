package lab9;

import java.util.Calendar;

/**
 *
 * @author TING WEI JING
 */
public class PersonProfile {

    private String name;
    private char gender;
    private Calendar birthDate;

    public PersonProfile(String name, char gender, int year, int month, int date) {
        this.birthDate = Calendar.getInstance(); // new Calender(); [singleton]
        this.name = name;
        this.gender = gender;
        birthDate.set(year, month - 1, date); // (0 - 11)
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println((Character.toUpperCase(gender) == 'M') ? "Gender: Male" : "Gender: Female");
        System.out.printf("Date of Birth: %1$td/%1$tm/%1$tY\n", birthDate);
    }
    
    // all the objects will inherit java.lang.object class
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String temp = "Name: " + name + "\n";
        sb.append(temp);
        sb.append((Character.toUpperCase(gender) == 'M') ? "Gender: Male\n" : "Gender: Female\n");
        sb.append(String.format("Date of Birth: %1$td/%1$tm/%1$tY\n", birthDate));
        return sb.toString();
    }

}
