package polymorphism.task;

public class Guitar extends Instrument {
    int strings;


    void play(String melody) {
        System.out.println("Исполняем " + melody  + " на гитаре " + name +  " с громкостью" + volume + " на " + strings + " струнах");
    }
    Guitar(String newName, int newVolume, int newStrings) {
        super(newName, newVolume);
        strings = 6;
    }
}
