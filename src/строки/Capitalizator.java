package строки;

public class Capitalizator {
    public static void main(String[] args) {
        Capitalizator check = new Capitalizator();
        System.out.println(check.capitalize("я не волшебник, я только учусь!"));
    }

    public String capitalize(String str) {
        String num = str.substring(0, 1);
        String num1 = str.substring(1,str.length());
        return (num.toUpperCase() + num1);
    }
}
