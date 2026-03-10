package Question_3;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee emp1 = new FullTimeEmployee("Joel Webs", 3000, 5000);
        PartTimeEmployee emp2 = new PartTimeEmployee("Marc Leanard", 0, 100.25, 10.5);

        System.out.println(emp1.name + " Annual Salary: " + emp1.calculateAnnualSalary());
        System.out.println(emp2.name + " Annual Salary: " + emp2.calculateAnnualSalary());
    }
    
}
