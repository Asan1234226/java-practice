public class Phone {
    String name;
    String model;
    int battery;

     void showInfo() {
         System.out.println("Телефон: " + name + " " + model);
         System.out.println("Заряд: " + battery);
     }
    void charge() {
        battery += 20;
        if (battery > 100) {
            battery = 100;
        }
        System.out.println("Телефон  заряжается... Заряд: " + battery);
    }
     void  call() {
         if (battery >= 10) {
             battery -= 10;
             System.out.println(name + " " + model + " звонит... Заряд:" + battery);
         } else {
             System.out.println("Недостатачно заряда для звонка!");
         }
     }
}






