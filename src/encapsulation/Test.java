package encapsulation;

public class Test {
    public static void main(String[] args) {
        Movie movie = new Movie("Нет пути домой",120,"Фантастика", 9);
        System.out.println(movie.rating);
        System.out.println(movie.duration);
        System.out.println(movie.name);
        System.out.println(movie.genre);
        movie.display();
//        movie.name = "Нет пути домой";
//        movie.duration = 120;
//        movie.genre = "Фантастика";
//        movie.rating = 9;
//        movie.display();

        Song song = new Song("Джек", 2, "Вокал","Миша");
        System.out.println(song.name);
        System.out.println(song.performer);
        System.out.println(song.duration);
        System.out.println(song.genre);
        song.display();


    }
//        song.name = "Джек";
//            song.duration = 2;
//            song.genre = "вокал";
//            song.performer = "Миша";
//            song.display();
//
    }


