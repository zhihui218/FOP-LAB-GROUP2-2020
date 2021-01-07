package lab10;

/**
 *
 * @author TING WEI JING
 */
public class ContractStaff extends EmployeeSalarySystem {

    public ContractStaff(String name, double totalSales) {
        this.name = name;
        this.type = "Contract Staff";
        this.totalSalary = 500 + totalSales * 0.5;
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
