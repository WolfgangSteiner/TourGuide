package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class ParksActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.name_mauerpark, R.string.description_mauerpark, R.drawable.mauerpark));
        locations.add(new Location(R.string.name_tiergarten, R.string.description_tiergarten, R.drawable.tiergarten));

        LocationAdapter locationAdapter = new LocationAdapter(this, locations);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(locationAdapter);
    }
}
