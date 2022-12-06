package day31_Constructors.tasks.Movie;

import java.util.Arrays;

public class movieObjects {
    public static void main(String[] args) {
        String gene = "Adventure, Comedy, Thriller";
        String title = "Journey to SDET: Cydeo Batch 25";
        String[] casts = {"Asiya", "Adam", "Muhtar", "Akbar", "Gurhan", "Saim", "Murodil", "Nadir", "Guljannet"};

       movie movie1 = new movie("USA", title, gene,"10/25/2021", "Kuzzat Altay" );

        movie1.addCast(Arrays.toString(casts));
        System.out.println(movie1);
    }
}
