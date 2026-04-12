public class Lift {
    public static void main(String[] args) {
        Elevator lift = new Elevator();
        lift.currentFloor = 1;
        lift.totalFloors = 10;
        lift.doorsOpen = "открыт";

        lift.status();
        lift.closeDoors();
        lift.goUp();
        lift.goUp();
        lift.openDoors();
        lift.status();
        lift.goUp();        // не поедет!
        lift.closeDoors();
        lift.goUp();
        lift.status();
    }

}
