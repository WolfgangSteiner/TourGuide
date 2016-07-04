package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class MonumentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.name_mauer, R.string.description_mauer, R.drawable.mauer));
        locations.add(new Location(R.string.name_siegessaeule, R.string.description_siegessaeule, R.drawable.siegessaeule));

        LocationAdapter locationAdapter = new LocationAdapter(this, locations);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(locationAdapter);
    }
}
