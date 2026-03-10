package Question_3;
public class PartTimeEmployee extends Employee {
    double hoursWorked;
    double hourlyRate;
    

    public PartTimeEmployee(String name, double salary, double hoursWorked, double hourlyRate) {
        super(name, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }


    @Override
    public double calculateAnnualSalary(){
        // calculated per week
        double annualSalary = hoursWorked*hourlyRate*52;

        return annualSalary;
    }
}
