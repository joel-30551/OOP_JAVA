package Question_3;
public class Employee {

    String name;
    double salary;

    

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }



    public double calculateAnnualSalary(){
        double annualSalary = salary*12;

        return annualSalary;
    }

}


