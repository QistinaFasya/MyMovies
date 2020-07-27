package sg.edu.rp.c346.id18015170.mymovies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    ImageView ivRated;
    TextView tvTitle;
    TextView tvYrGenre;
    TextView tvDesc;
    TextView tvWatchOn;
    TextView tvInTheatre;
    RatingBar rbRated;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ivRated = findViewById(R.id.imageViewRating);
        tvTitle = findViewById(R.id.textViewTitle);
        tvYrGenre = findViewById(R.id.textViewYrGenre);
        tvDesc = findViewById(R.id.textViewDesc);
        tvWatchOn = findViewById(R.id.textViewWatchOn);
        tvInTheatre = findViewById(R.id.textViewInTheatre);
        rbRated= findViewById(R.id.ratingBar);

        Intent intentReceived = getIntent();
        String title = intentReceived.getStringExtra("title");
        int year = intentReceived.getIntExtra("year", -1);
        String genre = intentReceived.getStringExtra("genre");
        String rated = intentReceived.getStringExtra("rated");
        String watchOn = intentReceived.getStringExtra("watchOn");
        String inTheatre = intentReceived.getStringExtra("inTheatre");
        String desc = intentReceived.getStringExtra("desc");
        int rating = intentReceived.getIntExtra("rating", 1);

        if(rated.equals("g")){
            ivRated.setImageResource(R.drawable.rating_g);
        }
        else if(rated.equals("pg")){
            ivRated.setImageResource(R.drawable.rating_pg);
        }
        else if(rated.equals("pg13")){
            ivRated.setImageResource(R.drawable.rating_pg13);
        }
        else if(rated.equals("nc16")){
            ivRated.setImageResource(R.drawable.rating_nc16);
        }
        else if(rated.equals("m18")){
            ivRated.setImageResource(R.drawable.rating_m18);
        }
        else if(rated.equals("r21")){
            ivRated.setImageResource(R.drawable.rating_r21);
        }
        tvTitle.setText(title);
        tvYrGenre.setText(year + " - " + genre);
        tvDesc.setText(desc);
        tvInTheatre.setText(inTheatre);
        tvWatchOn.setText(watchOn);
        rbRated.setRating(rating);








    }
}
