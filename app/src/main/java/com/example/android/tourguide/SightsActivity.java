package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class SightsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.name_brandenburgertor, R.string.description_brandenburgertor, R.drawable.brandenburgertor));
        locations.add(new Location(R.string.name_fernsehturm, R.string.description_fernsehturm, R.drawable.fernsehturm));

        LocationAdapter locationAdapter = new LocationAdapter(this, locations);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(locationAdapter);
    }
}
