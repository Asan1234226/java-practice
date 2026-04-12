package lists;

import java.util.ArrayList;
import java.util.HashMap;

public class students {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Double>> studentScores = new HashMap<>();
        studentScores.put("Bob", new ArrayList<>() {{
            add(87.3);
            add(91.3);
            add(88.0);
        }});
        studentScores.put("Tom", new ArrayList<>() {{
            add(89.3);
            add(79.1);
            add(90.5);
        }});
        studentScores.put("Sam", new ArrayList<>() {{
            add(90.1);
            add(96.1);
            add(90.5);
        }});
        studentScores.put("jack", new ArrayList<>() {{
            add(90.1);
            add(96.1);
            add(90.5);
        }});

        double sumofall = 0;
        int totalCount = 0;
        for (String name : studentScores.keySet()) {
            double sumofstudents = 0;
            ArrayList<Double> quantity = studentScores.get(name);
            for (Double sum : studentScores.get(name)) {
                sumofstudents += sum;
                sumofall += sum;
                totalCount++;
            }
            System.out.println( name + ": " + sumofstudents / quantity.size());
        }
        System.out.println("Общая оценка всез студентов " + sumofall / totalCount );
    }
}


