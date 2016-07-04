package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class MuseumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.name_pergamon, R.string.description_pergamon, R.drawable.pergamon));
        locations.add(new Location(R.string.name_neuesmuseum, R.string.description_neuesmuseum, R.drawable.neuesmuseum));

        LocationAdapter locationAdapter = new LocationAdapter(this, locations);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(locationAdapter);
    }
}
