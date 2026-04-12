public class Elevator {
    int currentFloor;
    int totalFloors;
    String doorsOpen;


    void status() {
        System.out.println("ЛИФТ");
        System.out.println("Этаж: " + currentFloor + " из " + totalFloors);
        System.out.println("Двери: " + doorsOpen);
    }

    void closeDoors() {
        doorsOpen = "Закрыты";
        System.out.println("Двери закрыты. Едем! ");
    }

    void openDoors() {
        doorsOpen = "Открыты";
        System.out.println("Двери открыты. Заходите!");
    }

    void goDown() {
        if (doorsOpen.equals("Закрыты")) {
            currentFloor -= 1;
            if (currentFloor < 1) {
                currentFloor = 1;
            }
            System.out.println("Лифт едет   вниз Прибыл  на " + currentFloor + " Этаж!");
        } else {
            System.out.println("Нельзя ехать двери лифта открыты");
        }
    }

    void goUp() {
        if (doorsOpen.equals("Закрыты")) {
            currentFloor += 1;
            if (currentFloor > totalFloors) {
                currentFloor = totalFloors;
            }
            System.out.println("Лифт едет на  вверх Прибыл  на " + currentFloor + " Этаж!");
        } else {
            System.out.println("Нельзя ехать двери лифта открыты");
        }
    }
}




