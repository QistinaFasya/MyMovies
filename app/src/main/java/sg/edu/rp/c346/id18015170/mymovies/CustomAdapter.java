package sg.edu.rp.c346.id18015170.mymovies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Movie> movieList;

    public CustomAdapter(Context context, int resource, ArrayList<Movie> objects){
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        movieList = objects;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);
        ImageView ivRating = rowView.findViewById(R.id.imageViewRating);
        TextView tvTitle = rowView.findViewById(R.id.textViewTitle);
        TextView tvInfo = rowView.findViewById(R.id.textViewInfo);

        Movie currentItem =movieList.get(position);
        tvTitle.setText(currentItem.getTitle());
        tvInfo.setText(currentItem.getYear() + " - " + currentItem.getGenre());
        if(currentItem.getRated() == "g"){
            ivRating.setImageResource(R.drawable.rating_g);
        }
        else if(currentItem.getRated() == "pg"){
            ivRating.setImageResource(R.drawable.rating_pg);
        }
        else if(currentItem.getRated() == "pg13"){
            ivRating.setImageResource(R.drawable.rating_pg13);
        }
        else if(currentItem.getRated() == "nc16"){
            ivRating.setImageResource(R.drawable.rating_nc16);
        }
        else if(currentItem.getRated() == "m18"){
            ivRating.setImageResource(R.drawable.rating_m18);
        }
        else if(currentItem.getRated() == "r21"){
            ivRating.setImageResource(R.drawable.rating_r21);
        }

        return rowView;
    }
}
