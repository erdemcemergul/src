package day31_Constructors.tasks.Movie;

import java.util.ArrayList;
import java.util.Arrays;

public class movie {
    String   country , title , Genre , releaseDate , director ;
    ArrayList<String> casts =new ArrayList<>();

public  void addCast(String cast){
    casts.add(cast);
}
public void addCasts(String[] castss){
    casts.addAll(Arrays.asList(castss));
}

    public movie(String country, String title,String Genre, String releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.Genre=Genre;
        this.releaseDate = releaseDate;
        this.director = director;

        casts = new ArrayList<>();
    }


    public String toString() {
        return "movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", Genre='" + Genre+ '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", casts=" + casts.size() +
                '}';
    }
}
