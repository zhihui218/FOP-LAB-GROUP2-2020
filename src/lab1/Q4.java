package lab1;


public class Q4 {

    public static void main(String[] args) {
        String[] month = {"January", // 0
                          "Febraury", // 1
                          "March", // 2 
                          "April", // 3
                          "May", // 4
                          "Jun"};       // 5
        int[] amount = {2500,
                        1600,
                        2000,
                        2700,
                        3200,
                        800};
        System.out.print(month[0] + "\t:\t");
        for(int i = 0; i < (amount[0] / 100); i++) {
            System.out.print("*"); // * = 100
        }
        System.out.println("");

        System.out.print(month[1] + ":\t");
        for(int i = 0; i < (amount[1] / 100); i++) {
            System.out.print("*");
        }
        System.out.println("");

        System.out.print(month[2] + "\t:\t");
        for(int i = 0; i < (amount[2] / 100); i++) {
            System.out.print("*");
        }
        System.out.println("");

        System.out.print(month[3] + "\t:\t");
        for(int i = 0; i < (amount[3] / 100); i++) {
            System.out.print("*");
        }
        System.out.println("");

        System.out.print(month[4] + "\t:\t");
        for(int i = 0; i < (amount[4] / 100); i++) {
            System.out.print("*");
        }
        System.out.println("");

        System.out.print(month[5] + "\t:\t");
        for(int i = 0; i < (amount[5]  / 100); i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

}
