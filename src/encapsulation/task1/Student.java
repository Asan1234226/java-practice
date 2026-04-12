package encapsulation.task1;

public class Student {
    private String name;
    private int age;
    private double grade;


    public Student(String newName, int newAge, double newGrade) {
        name = newName;
        age = newAge;
        grade = newGrade;
    }

    public void setName(String str) {
        if (str.equals("")) {
            System.out.println("Имя не может быть пустым.");
        } else {
            name = str;
        }
    }

    public void setAge(int str) {
        if (str > 0 && str < 150) {
            age = str;
        } else {
            System.out.println("Возраст должен быть в диапазоне от 0 до 150.");
        }
    }


    public void printStudentInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст : " + age);
        System.out.println("Балл : " + grade);
    }

    public void setGrade(double str) {
        if (str > 0 && str <= 10) {
            grade = str;
        } else {
            System.out.println("Средний балл должен быть в диапазоне от 0.0 до 10.0.");
        }
    }
}
