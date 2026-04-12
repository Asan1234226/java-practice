public class Event {
    String name;
    String sum;
    String nameOrg;
    int sum1;
    String adRes;
    int price;

    void  display() {
        System.out.println("организация : " + name);
        System.out.println("во сколько : " + sum);
        System.out.println("организатор : " + nameOrg);
        System.out.println("сколько билетов : " + sum1);
        System.out.println("адрес : " + adRes);
        System.out.println("стоимость : " + price);
    }
}
