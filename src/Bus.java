import java.util.Arrays;

public class Bus {
    int number;
    int soidTickets = 0;

    String[] seats = new String[20];


    void sellTicket(String name, int place) {


        if (place < 1 || place > seats.length) {
            System.out.println("Место должно быть от  1 до " + seats.length);
            return;
        }
        if (seats[place - 1] != null) {
            System.out.println("Место " + place + " уже занято ");
            return;
        }
        seats[place - 1] = name;
        soidTickets++;
        System.out.println("Билет продан: " + name + " место  " + place);
    }


    void showSeating() {

        System.out.println("Автобус " + number + " || Продано: " + soidTickets + " из " + seats.length);
        for (int i = 0; i < seats.length; i++) {
            if (seats[i]   ==  null) {
                System.out.println(i + 1 + ":" + " Свободно");
            } else {
            System.out.println(i + 1 + ": " + seats[i]);

                }
            }
        }
    }












