package com.technos.mochisrin.moviecatalogue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

public class MovieDetail extends AppCompatActivity {
    public  static  final String  MYMOVIE = "movie";

    ImageView photo, actor1, actor2, actor3;
    TextView title, date, desc, actorName1, actorName2, actorName3, dir1, dir2, sc1,sc2;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        photo = findViewById(R.id.photo);
        title = findViewById(R.id.title);
        date = findViewById(R.id.date);
        desc  = findViewById(R.id.desc);
        actor1 = findViewById(R.id.actor1);
        actor2 = findViewById(R.id.actor2);
        actor3 = findViewById(R.id.actor3);

        actorName1 = findViewById(R.id.nameActor1);
        actorName2 = findViewById(R.id.nameActor2);
        actorName3 = findViewById(R.id.nameActor3);

        dir1 = findViewById(R.id.dir1);
        dir2 = findViewById(R.id.dir2);

        sc1 = findViewById(R.id.sp1);
        sc2 = findViewById(R.id.sp2);

        toolbar  = findViewById(R.id.mytollbar);

        Movie movie = getIntent().getParcelableExtra(MYMOVIE);

        toolbar.setTitle(movie.getName());
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        title.setText(movie.getName());
        date.setText(movie.getDate());
        desc.setText(movie.getDescription());
        photo.setImageResource(movie.getPhoto());
        actor1.setImageResource(movie.getActor1());
        actor2.setImageResource(movie.getActor2());
        actor3.setImageResource(movie.getActor3());

        actorName1.setText(movie.getNameActor1());
        actorName2.setText(movie.getNameActor2());
        actorName3.setText(movie.getNameActor3());

        dir1.setText(movie.getDirector1());
        dir2.setText(movie.getDirector2());

        sc1.setText(movie.getScreenplay1());
        sc2.setText(movie.getScreenplay2());

    }
}
