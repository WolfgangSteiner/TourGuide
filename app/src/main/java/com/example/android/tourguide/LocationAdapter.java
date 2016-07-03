package com.example.android.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by wolfgang on 03.07.16.
 */
public class LocationAdapter extends ArrayAdapter<Location>
{
    public LocationAdapter(Activity aContext, ArrayList<Location> aLocationList)
    {
        super(aContext, 0, aLocationList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        // Check if the existing view is being reused, otherwise inflate the view
        View locationView = convertView;

        if(locationView == null)
        {
            locationView = LayoutInflater.from(getContext()).inflate(
                    R.layout.location_list_item, parent, false);
        }
        Location currentLocation = getItem(position);

        TextView nameView = (TextView) locationView.findViewById(R.id.name_field);
        nameView.setText(currentLocation.getName());

        TextView descriptionView = (TextView) locationView.findViewById(R.id.description_field);
        descriptionView.setText(currentLocation.getDescription());

        ImageView imageView = (ImageView) locationView.findViewById(R.id.image_view);
        imageView.setImageResource(currentLocation.getImageId());

        return locationView;
    }
}
