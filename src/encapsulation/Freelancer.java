package encapsulation;

public class Freelancer extends Employee {
    int hoursWorked;

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int newHoursWorked) {
        hoursWorked = newHoursWorked;
    }

    public double calculateSalary() {
        return (getBaseSalary() * hoursWorked);
    }
}
