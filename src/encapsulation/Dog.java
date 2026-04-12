package encapsulation;

public class Dog extends Animal {
    public Dog(String newName) {
        super(newName);
    }

    public void makeSound() {
        System.out.println("Woof!");
    }

    void fetch() {
        System.out.println("\nDog is fetching the ball!");
    }
}
