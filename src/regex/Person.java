package regex;

/**
 *
 * @author TING WEI JING
 */
public class Person implements Comparable<Person> {

    private int grade;

    public Person(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public int compareTo(Person p) {
        if(grade == p.getGrade()) {
            return 1;
        }
        else {
            return 0;
        }
    }

}
