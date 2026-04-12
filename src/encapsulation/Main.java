package encapsulation;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee employee = new FullTimeEmployee();
        employee.setName("FullTimeEmployee salary");
        employee.setBaseSalary(200000);
        employee.display();


        Freelancer freelancer = new Freelancer();
        freelancer.setName("Freelancer salary");
        freelancer.setBaseSalary(40000);
        freelancer.setHoursWorked(2);
        freelancer.display();
    }
}


