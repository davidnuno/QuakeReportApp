package com.example.android.quakereport;

/**
 * Created by David on 1/3/2017.
 */

public class Earthquake {

    /** The magnitude of earthquake, of type {@link String}. */
    private String mMagnitude;

    /** The location of the earthquake, of type {@link String}. */
    private String mLocation;

    /** The date of the earthquake}, of type {@link String}. */
    private String mDate;

    public Earthquake(String magnitude, String location, String date){

        mMagnitude  = magnitude;
        mLocation   = location;
        mDate       = date;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getDate() {
        return mDate;
    }
}
