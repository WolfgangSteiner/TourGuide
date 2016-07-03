package com.example.android.tourguide;

import android.content.Context;

import org.json.JSONObject;

/**
 * Created by wolfgang on 04.07.16.
 */
public class Location
{
    private String mName;
    private String mDescription;
    private int mImageId;

    public Location(Context aContext, int aNameId, int aDescriptionId, int aImageId)
    {
        mName = aContext.getString(aNameId);
        mDescription = aContext.getString(aDescriptionId);
        mImageId = aImageId;
    }

    public Location(String aName, String aDescription)
    {
        mName = aName;
        mDescription = aDescription;
    }

    public String getName()
    {
        return mName;
    }

    public String getDescription()
    {
        return mDescription;
    }

    public int getImageId()
    {
        return mImageId;
    }
}
