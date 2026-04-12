package encapsulation;

public class Song extends Media {
    String performer;


    public Song(String newName, int newDuration, String newGenre, String newPerformer) {
        super(newName, newDuration, newGenre);
        performer = newPerformer;
    }

    void display() {
        super.display();
        System.out.println("исполнитель : " + performer);
    }
}
