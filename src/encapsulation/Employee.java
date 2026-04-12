package encapsulation;

public class Employee {
    private String name;
    private  double baseSalary;


    public  double getBaseSalary() {
        return baseSalary;
    }
    public void setName(String newName) {
        name = newName;

    }
    public  void  setBaseSalary(double newBaseSalary) {
        baseSalary = newBaseSalary;
    }

    public  double  calculateSalary() {
        return  baseSalary;
    }


    public  void  display() {
        System.out.println(name + ":" + calculateSalary());
    }
}
