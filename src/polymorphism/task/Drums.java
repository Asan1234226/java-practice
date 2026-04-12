package polymorphism.task;

public class Drums extends Instrument {
    int pieces;

    void play(String melody) {
        System.out.println("Барабаним ритм " + melody  + "на установке "  + name + "с громкостью "  + volume  + " используем " + pieces +  " Элементов");

    }

    Drums(String newName, int newVolume, int newPieces) {
        super(newName, newVolume);
        pieces = newPieces;
    }
}
