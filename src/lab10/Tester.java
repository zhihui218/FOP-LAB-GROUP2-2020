package lab10;

/**
 *
 * @author TING WEI JING
 */
public class Tester {

    public static void main(String[] args) {
//        Q1();
//        Q2();
//        Q3();
        Q4();
    }

    public static void Q1() {
        EmployeeSalarySystem empA = new PermanentEmp("HAO", 'A');
        EmployeeSalarySystem staffB = new ContractStaff("Jun", 50);
        EmployeeSalarySystem staffC = new TempStaff("Leo", 100);

        empA.displayInfo();
        staffB.displayInfo();
        staffC.displayInfo();
    }

    public static void Q2() {
        SubstitutionCipher encoder = new SubstitutionCipher("D:/User/Documents/3. Second Year Sem 1/Demo/Lab Question/Text.txt",
                                                            "D:/User/Documents/3. Second Year Sem 1/Demo/Lab Question/Text(Encoded).txt",
                                                            5);
        encoder.encode();

        SubstitutionCipher decoder = new SubstitutionCipher("D:/User/Documents/3. Second Year Sem 1/Demo/Lab Question/Text(Encoded).txt",
                                                            "D:/User/Documents/3. Second Year Sem 1/Demo/Lab Question/Text(Decoded).txt",
                                                            5);
        decoder.decode();

    }

    public static void Q3() {
        ShuffleCipher encoder = new ShuffleCipher("D:/User/Documents/3. Second Year Sem 1/Demo/Lab Question/Text.txt",
                                                  "D:/User/Documents/3. Second Year Sem 1/Demo/Lab Question/Text(Encoded).txt",
                                                  1);
        encoder.encode();

        ShuffleCipher decoder = new ShuffleCipher("D:/User/Documents/3. Second Year Sem 1/Demo/Lab Question/Text(Encoded).txt",
                                                  "D:/User/Documents/3. Second Year Sem 1/Demo/Lab Question/Text(Decoded).txt",
                                                  1);
        decoder.decode();

    }

    public static void Q4() {
        String filePath = "D:/User/Documents/3. Second Year Sem 1/Demo/Lab Question/Appointment.txt";
        Appointment.readAppointmentFile(filePath);
        Appointment appoint1 = new Appointment(2021, 1, 11, 6, 7);
        appoint1.makeAppointment(filePath);
//            Appointment appoint1 = new Appointment(2021, 1, 11, 9, 11);
//        Appointment appoint2 = new Appointment(2021, 1, 11, 13, 15);
//        Appointment appoint3 = new Appointment(2021, 1, 11, 16, 17);
//        Appointment appoint4 = new Appointment(2021, 1, 12, 9, 11);
//        Appointment appoint5 = new Appointment(2021, 1, 12, 13, 15);
//        appoint1.makeAppointment(filePath);
//        appoint2.makeAppointment(filePath);
//        appoint3.makeAppointment(filePath);
//        appoint4.makeAppointment(filePath);
//        appoint5.makeAppointment(filePath);
    }
}
