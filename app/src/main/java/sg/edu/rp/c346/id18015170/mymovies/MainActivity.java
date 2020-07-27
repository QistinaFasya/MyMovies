package sg.edu.rp.c346.id18015170.mymovies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    ListView lvMovie;
    ArrayList<Movie> alMovieList;
    CustomAdapter caMovie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = findViewById(R.id.listViewMovies);
        alMovieList = new ArrayList<>();
        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();
        date1.set(2014,11,15);
        date2.set(2025,5,15);

        Movie movie1 = new Movie("The Avengers", 2012, "pg13", "Action | Sci-Fi",
                date1, "Golden Village - Bishan",
                "Nick Fury of S.H.I.E.L.D. assembles a team of superheroes to save the planet from Loki and his army.", 4);

        Movie movie2 = new Movie("Planes", 2013, "pg", "Animation | Comedy",
                date2, "Cathay - AMK Hub", "A crop-dusting plane with a fear of heights lives his dream of competing in a famous around-the-world aerial race.", 2);

        alMovieList.add(movie1);
        alMovieList.add(movie2);

        caMovie = new CustomAdapter(this, R.layout.row, alMovieList);
        lvMovie.setAdapter(caMovie);

        lvMovie.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Movie movieSelected = alMovieList.get(position);

                String title = movieSelected.getTitle();
                int year = movieSelected.getYear();
                String genre = movieSelected.getGenre();
                String rated = movieSelected.getRated();
                Calendar watchOn = movieSelected.getWatched_on();
                String inTheatre = movieSelected.getIn_theatre();
                String desc = movieSelected.getDescription();
                int rating = movieSelected.getRating();
                String date = watchOn.get(Calendar.DAY_OF_MONTH) + "/" + watchOn.get(Calendar.MONTH) + "/" + watchOn.get(Calendar.YEAR);

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("title", title);
                intent.putExtra("year", year);
                intent.putExtra("genre", genre);
                intent.putExtra("rated", rated);
                intent.putExtra("rating", rating);
                //String created = watchedOn.get(Calendar.DATE) +

                intent.putExtra("watchOn", date);
                intent.putExtra("inTheatre", inTheatre);
                intent.putExtra("desc", desc);

                startActivity(intent);

            }
        });

    }
}
