package com.example.android.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView parks = (TextView) findViewById(R.id.parks_button);
        parks.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(MainActivity.this, ParksActivity.class));
            }
        });

        TextView monumentsButton = (TextView) findViewById(R.id.monuments_button);
        monumentsButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(MainActivity.this, MonumentsActivity.class));
            }
        });

        TextView museumsButton = (TextView) findViewById(R.id.museums_button);
        museumsButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(MainActivity.this, MuseumsActivity.class));
            }
        });

        TextView sightsButton = (TextView) findViewById(R.id.sights_button);
        sightsButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity( new Intent(MainActivity.this, SightsActivity.class));
            }
        });    }
}
