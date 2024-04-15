package chapter2;
class Movie {
    String title;
    String genre;
    int rating;

    void playlist() {
        System.out.println("Playing the movie");
    }
}

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Black Clover";
        one.genre = "Shonen";
        one.rating = 7;
        Movie two = new Movie();
        two.title = "Naruto";
        two.genre = "Shonen";
        one.rating = 9;
        Movie three = new Movie();
        three.title = "Boruto";
        three.genre = "Shonen";
        three.rating = 8;
    }
}
