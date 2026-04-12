package lists;

import java.util.HashMap;
import java.util.ArrayList;

public class Phone5 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> phoneCalls = new HashMap<>();
        phoneCalls.put("Коля", new ArrayList<>() {{
            add("2026-01-02 15:30");
            add("2026-01-02 16:57");
            add("2026-01-02 18:23");
            add("2026-01-03 09:56");
        }});

        phoneCalls.put("Аня", new ArrayList<>() {{
            add("2026-01-01 12:15");
            add("2026-01-02 14:40");
            add("2026-01-03 10:20");
        }});

        phoneCalls.put("Марина", new ArrayList<>() {{
            add("2026-01-01 08:30");
            add("2026-01-02 17:50");
        }});

        phoneCalls.put("Дмитрий", new ArrayList<>() {{
            add("2026-01-03 13:15");
            add("2026-01-03 16:40");
            add("2026-01-04 09:25");
        }});

        phoneCalls.put("Ольга", new ArrayList<>() {{
            add("2026-01-02 10:10");
            add("2026-01-03 12:45");
            add("2026-01-04 14:00");
        }});

        phoneCalls.put("Влад", new ArrayList<>() {{
            add("2026-01-01 07:45");
            add("2026-01-02 08:30");
            add("2026-01-03 10:00");
            add("2026-01-02 09:50");
            add("2026-01-03 11:30");
            add("2026-01-03 14:10");
            add("2026-01-03 13:20");
            add("2026-01-04 15:45");
        }});
        int sum = 0;
        int max = 0;
        String maxName = "";
        System.out.println("Ожидаемый результат:");
        for (String name : phoneCalls.keySet()) {
            int size = phoneCalls.get(name).size();
            System.out.println(name + ":" + size);
            sum += size;
            if (size > max) {
                max = size;
                maxName = name;
            }
        }
        System.out.println("Больше всего звонков получал:" + maxName + "(" + max +")");
            System.out.println("Общее кол-во звонков: " + sum);

    }
}
