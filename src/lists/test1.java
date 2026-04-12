package lists;

import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);


        int max = getMax(list);
        System.out.println(max);

        int min = getMin(list);
        System.out.println(min);


        ArrayList<Integer> evenNums = getEvenNums(list);
        System.out.println(evenNums);


        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Астана");
        list1.add("Алматы");
        list1.add("Шымкент");


        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Астана");
        list2.add("Алматы");
        list2.add("Тараз");
        list2.add("Актау");

        ArrayList<String> commonItems = getCommonItems(list1, list2);
        System.out.println(commonItems);


        ArrayList<Integer> oddNumsCount = getOddNums(list);
        System.out.println(oddNumsCount);


        int avg = getAverage(list);
        System.out.println(avg);


    }


    static ArrayList<String> getCommonItems(ArrayList<String> list, ArrayList<String> list2) {
        ArrayList<String> num = new ArrayList<>();
        for (String num1 : list2) {
            if (list.contains(num1)) {
                num.add(num1);

            }

        }
        return num;
    }


    static int getMax(ArrayList<Integer> list) {
        int max = 0;
        for (Integer num : list) {
            if (max < num) {
                max = num;
            }
        }
        return max;
    }


    static int getMin(ArrayList<Integer> list) {
        int min = list.get(0);
        for (Integer num : list) {
            if (min > num) {
                min = num;
            }
        }
        return min;
    }

    static ArrayList<Integer> getEvenNums(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer num : list) {
            if (num % 2 == 0) {
                result.add(num);
            }
        }
        return result;
    }


    static ArrayList<Integer> getOddNums(ArrayList<Integer> list) {
        ArrayList<Integer> result1 = new ArrayList<>();
        for (Integer num : list) {
            if (num % 2 != 0) {
                result1.add(num);
            }
        }
        return result1;
    }


    static int getAverage(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer sum1 : list) {
                sum = sum + sum1;

            }
            return sum / list.size();
        }
    }





