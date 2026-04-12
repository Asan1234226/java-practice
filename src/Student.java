public class Student {
    String name;
    int group;
    int grade;
    String call;




    void display() {
        System.out.println("Студент: " + name);
        System.out.println("Группа: " + group);
        System.out.println("Оценка: " + grade);
    }
    void study() {
        System.out.println("Студент " + name + " учится в группе " + group);

    }
    public  String getResult(int n) {
        if (n == 2){
            return n + " Студент Дима получил неудовлетворительную оценку";
        } else if (n == 3) {
            return  "Студент Дима получил удовлетворительную оценку";
        } else if (n == 4) {
            return  "Студент Дима получил хорошую оценку";
        } else if (n == 5) {
            return "Студент Дима получил отличную оценку!";
        }
        return "";
    }
}



