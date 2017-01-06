package com.example.android.quakereport;

import static com.example.android.quakereport.R.id.date;

/**
 * Created by David on 1/3/2017.
 */

public class Earthquake {

    private String locationOffset;

    private String primaryLocation;

    /** The magnitude of earthquake, of type {@link String}. */
    private String mMagnitude;

    /** The location of the earthquake, of type {@link String}. */
    private String mLocation;

    /** The date of the earthquake}, of type {@link String}. */
    private long mTimeInMilliseconds;

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude          is the magnitude (size) of the earthquake
     * @param location           is the city location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *                           earthquake happened
     */
    public Earthquake(String magnitude, String location, long timeInMilliseconds) {

        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    public void locationParser(String parse) {

        parse.contains("of");
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
