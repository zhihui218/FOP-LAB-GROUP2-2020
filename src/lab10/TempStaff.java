package lab10;

/**
 *
 * @author TING WEI JING
 */
public class TempStaff extends EmployeeSalarySystem {

    public TempStaff(String name, int hour) {
        this.name = name;
        this.type = "Temporary Staff";
        this.totalSalary = 15 * hour;
    }

    @Override
    public String toString() {
        return "Name:\t\t " + this.name
               + "\nType:\t\t " + this.type
               + "\nTotal Salary:\t " + dfRM.format(this.totalSalary);

    }

    @Override
    public void displayInfo() {
        System.out.println(this);
    }

}
