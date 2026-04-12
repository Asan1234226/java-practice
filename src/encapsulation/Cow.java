package encapsulation;

public class Cow extends Animal {

    public Cow(String newName) {
        super(newName);
    }
    public void makeSound() {
        System.out.println("Moo!");
    }

}
