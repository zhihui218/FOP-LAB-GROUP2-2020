package lab9;

/**
 *
 * @author TING WEI JING
 */
public class Tester {

    public static void main(String[] args) {
//        Q1();
        Q2();
//        Q3();
//        Q4();
    }

    public static void Q1() {
        Square sqr = new Square();
        Rectangle rect = new Rectangle();
        Circle crl = new Circle();
        
        sqr.setLength();
        sqr.calArea();
        sqr.calPerimeter();
        sqr.display();

        rect.setLengthAndWidth();
        rect.calArea();
        rect.calPerimeter();
        rect.display();

        crl.setDiameter();
        crl.calArea();
        crl.calPerimeter();
        crl.display();
    }

    public static void Q2() {
        Student stud1 = new Student("Leong Xin Tian", 'M', 2000, 8, 31, "D:/User/Documents/3. Second Year Sem 1/Demo/Lab Question/course.txt");
//        stud1.display();
        System.out.println(stud1.toString());
    }

    public static void Q3() {
        Lecturer lect1 = new Lecturer("Lam Xin Tian", 'M', 1977, 8, 31, "D:/User/Documents/3. Second Year Sem 1/Demo/Lab Question/lecturer.txt");
        lect1.display();
    }

    public static void Q4() {
        DiceGame dice = new DiceGame();
        dice.startGame();
    }

}
