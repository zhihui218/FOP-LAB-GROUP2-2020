package lab1;

import static java.lang.System.out;

public class Q4_Advance {

    public static void main(String args[]) {
        out.println("^");

        int[] hit
              = {
                    2500, 1600, 2000, 2700, 3200, 800
                };
        for(int i = 21; i > 0; i--) {
            out.print("|\t");
            checkHori(i, hit);

            out.println("");
        }
        out.print("+");
        for(int i = 0; i < hit.length; i++) {
            out.print("----------------");
        }
        out.println(">");
        out.println("\t JAN\t\t FEB\t\t MAR\t\t APR\t\t MAY\t\t JUN");
    }

    static void checkHori(int x, int[] hit) {
        for(int y = 0; y < hit.length; y++) {
            if(x - 2 == hit[y] / 200) {
                out.print("  " + hit[y] + "\t\t");
            }
            else if(x - 1 == hit[y] / 200) {
                out.print(" _______ \t");
            }
            else if(x <= hit[y] / 200) {
                out.print("|\t|\t");
            }
            else {
                out.print("\t\t");
            }
        }
    }

}
