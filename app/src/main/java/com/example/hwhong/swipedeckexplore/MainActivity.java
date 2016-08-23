package com.example.hwhong.swipedeckexplore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.daprlabs.cardstack.SwipeDeck;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private SwipeDeck swipeDeck;
    private ArrayList<String> name;
    private StackAdapter adapter;

    private int[] array = new int[]{R.drawable.beme, R.drawable.google,
            R.drawable.instagram, R.drawable.nyt, R.drawable.spotify};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = new ArrayList<>();
        name.add("Beme");
        name.add("Google");
        name.add("Instagram");
        name.add("New York Times");
        name.add("Spotify");

        adapter = new StackAdapter(name, array, getApplicationContext());
        swipeDeck = (SwipeDeck) findViewById(R.id.swipe_deck);
        swipeDeck.setAdapter(adapter);
    }
}
