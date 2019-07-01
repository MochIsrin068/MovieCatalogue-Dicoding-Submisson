package com.technos.mochisrin.moviecatalogue;

import android.content.Intent;
import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private String[] dataName;
    private String[] dataDate;
    private String[] dataDescription;
    private TypedArray actor1;
    private TypedArray actor2;
    private TypedArray actor3;
    private TypedArray dataPhoto;
    private MovieAdapter adapter;

    private String[] nameActor1;
    private String[] nameActor2;
    private String[] nameActor3;

    private String[] director1;
    private String[] director2;

    private String[] screenplay1;
    private String[] screenplay2;

    private ArrayList<Movie> movies;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new MovieAdapter(this);

        ListView listView = findViewById(R.id.lv);
        listView.setAdapter(adapter);

        prepare();
        addItem();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Movie movie =  movies.get(i);

                Intent intent = new Intent(MainActivity.this, MovieDetail.class);
                intent.putExtra(MovieDetail.MYMOVIE, movie);

                startActivity(intent);
            }
        });
    }

    private void prepare() {
        dataName = getResources().getStringArray(R.array.data_name);
        dataDate = getResources().getStringArray(R.array.data_date);
        dataDescription = getResources().getStringArray(R.array.data_description);
        dataPhoto = getResources().obtainTypedArray(R.array.data_photo);
        actor1 = getResources().obtainTypedArray(R.array.actor1);
        actor2 = getResources().obtainTypedArray(R.array.actor2);
        actor3 = getResources().obtainTypedArray(R.array.actor3);

        nameActor1 = getResources().getStringArray(R.array.data_name_actor1);
        nameActor2 = getResources().getStringArray(R.array.data_name_actor2);
        nameActor3 = getResources().getStringArray(R.array.data_name_actor3);

        director1 = getResources().getStringArray(R.array.data_dir1);
        director2 = getResources().getStringArray(R.array.data_dir2);

        screenplay1 = getResources().getStringArray(R.array.data_sc1);
        screenplay2 = getResources().getStringArray(R.array.data_sc2);
    }

    private void addItem() {
        movies = new ArrayList<>();

        for (int i = 0; i < dataName.length; i++) {
            Movie movie = new Movie();
            movie.setPhoto(dataPhoto.getResourceId(i, -1));
            movie.setDate(dataDate[i]);
            movie.setName(dataName[i]);
            movie.setDescription(dataDescription[i]);
            movie.setActor1(actor1.getResourceId(i, -1));
            movie.setActor2(actor2.getResourceId(i, -1));
            movie.setActor3(actor3.getResourceId(i, -1));

            movie.setNameActor1(nameActor1[i]);
            movie.setNameActor2(nameActor2[i]);
            movie.setNameActor3(nameActor3[i]);

            movie.setDirector1(director1[i]);
            movie.setDirector2(director2[i]);

            movie.setScreenplay1(screenplay1[i]);
            movie.setScreenplay2(screenplay2[i]);

            movies.add(movie);
        }

        adapter.setMovies(movies);
    }
}
