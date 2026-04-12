package polymorphism.task;

public class Main {
    public static void main(String[] args) {
        String song = "Happy Birthday";

        Instrument[] orchestra = {
                new Piano("Steinway", 7, 88),
                new Guitar("Fender", 5, 6),
                new Drums("Pearl", 8, 5)
        };

        // Сначала все настраиваются
        for (Instrument instrument : orchestra) {
            instrument.tune();
        }

        System.out.println("--- Начинаем концерт ---");

        // Затем играют мелодию
        for (Instrument instrument : orchestra) {
            instrument.play(song);
        }
    }
}
