package polymorphism.task;

class Piano extends Instrument {
    int keys;

     void play(String melody) {
        System.out.println("Играем мелодию " + melody  + " на пианино " + name + " с громкостью "  + volume  + " используем " + keys +  " клавиш");
    }

    Piano(String newName, int newVolume, int newKeys) {
        super(newName,newVolume);
        keys = 88;

        }
    }

