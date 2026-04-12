package polymorphism.task;

abstract class Instrument {
    String name;
    int volume;

    Instrument(String newName, int newVolume) {
        name = newName;
        volume = newVolume;
    }

    abstract void play(String melody);


    void tune() {
        System.out.println("Настраиваем " + name);
    }
}


