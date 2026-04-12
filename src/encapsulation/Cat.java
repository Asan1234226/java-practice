package encapsulation;

public class Cat extends Animal {

    public Cat(String newName) {
        super(newName);
    }

    public void makeSound() {
        System.out.println("Meow!");
    }

        void scratch() {
            System.out.println("\nCat is scratching the sofa!");
        }
    }

