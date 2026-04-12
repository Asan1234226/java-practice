import java.util.HashMap;


public class jjj {
    public static void main(String[] args) {
        HashMap<String, Integer> box1 = new HashMap<>();
        box1.put("товар 1", 250);
        box1.put("товар 2", 100);
        box1.put("товар 3", 5);

        HashMap<String, Integer> box2 = new HashMap<>();
        box2.put("товар 2", 6);
        box2.put("товар 3", 70);
        box2.put("товар 4", 90);
        box2.put("товар 5", 1500);


        HashMap<String, Integer> box3 = new HashMap<>();
        for (String box : box1.keySet()) {
            int a = box1.get(box);
            Integer b = box2.get(box);
            if (box2.containsKey(box)) {
                box3.put(box, a+b);
            } else {
                box3.put(box, box1.get(box));
            }
        }
        for (String box000 : box2.keySet()) {
            if (!box3.containsKey(box000)) {
                box3.put(box000, box2.get(box000));
            }
        }
        System.out.println(box3);


// товар 1=250
// товар 2=106
// товар 3=75
// товар 4=90
// товар 5=1500
    }
}
