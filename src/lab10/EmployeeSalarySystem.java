package lab10;

import java.text.DecimalFormat;

/**
 *
 * @author TING WEI JING
 */
public abstract class EmployeeSalarySystem {

    public static DecimalFormat dfRM = new DecimalFormat("RM#.00");
    protected String name;
    protected double totalSalary;
    protected String type;

    public abstract void displayInfo();

}
