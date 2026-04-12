package строки;

import java.net.DatagramSocket;
import java.util.ArrayList;
import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        System.out.println(fixString("Java"));
        System.out.println(fixString("     Java       "));
        System.out.println(fixString(""));
        System.out.println(fixString("  "));

        TextEditor textEditor = new TextEditor();
        textEditor.print("Java");


        String fruitsStr = "яблоко, апельсин, банан, грейпфрут";
        String[] str = fruitsStr.split(", ");

        System.out.println(Arrays.toString(str));
        for (String s : str) {
            System.out.println(s.length());
        }


        String monthStr = "ЯНВАРЬ-ФЕВРАЛЬ-МАРТ-АПРЕЛЬ-МАЙ-ИЮНЬ-ИЮЛЬ-АВГУСТ-СЕНТЯБРЬ-НОЯБРЬ-ДЕКАБРЬ";
        String[] str1 = monthStr.split("-");


//        for (String arr : str1) {

        for (int i = 0; i < str1.length ; i++) {
            String string = str1[i].substring(0, 1);
            String string1 = str1[i].substring(1, str1[i].length());
            System.out.println(i + 1 + ". " + string.toUpperCase() + string1.toLowerCase());

        }
            String[] cities = {"Астана", "Алматы", "Актобе", "Шымкент", "Туркестан"};
            String result = String.join(", ",cities);
            System.out.println("Мои друзья в городах: " + result);





// Мои друзья в городах: Астана, Алматы, Актобе, Шымкент, Туркестан
        }
// 1. Январь
// 2. Февраль
// 3. Март
// ...
// 12. Декабрь

        public static String fixString(String str) {
            if (str.isBlank()) {
                return ("Вы ничего не вели");
            }
            return (str.trim());
        }
}
