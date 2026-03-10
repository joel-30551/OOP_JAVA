package Question_3;
public class FullTimeEmployee extends Employee {
    double bonus;

    public FullTimeEmployee(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }
    
    @Override
    public double calculateAnnualSalary(){
        double annualSalary = (salary*12) + bonus;

        return annualSalary;
    }
}
