package lab10;

/**
 *
 * @author TING WEI JING
 */
public class PermanentEmp extends EmployeeSalarySystem {

    public PermanentEmp(String name, char cat) {
        this.name = name;
        this.type = "Permanent Employee";
        switch(cat) {
            case 'A':
                super.totalSalary = 4000;
                break;
            case 'B':
                super.totalSalary = 3000;
                break;
            case 'C':
                super.totalSalary = 2000;
                break;
        }

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
