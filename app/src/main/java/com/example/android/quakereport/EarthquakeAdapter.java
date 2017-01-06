package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by David on 1/3/2017.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(Context context, List<Earthquake> objects) {
        super(context, 0, objects);
    }

    /**
     * Return the formatted date string (i.e. "Mar 3, 1984") from a Date object.
     */
    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

    /**
     * Return the formatted date string (i.e. "4:30 PM") from a Date object.
     */
    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        /*
        * Check if there is an existing list item view (called convertView) that we can reuse,
        * otherwise, if convertView is null, then inflate a new list item layout.
        * */
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }

        //Find the earthquake at the given position in the list of earthquakes.
        Earthquake currentEarthquake = getItem(position);

        //Find the TextView with view ID magnitude.
        TextView magnitudeView = (TextView) listItemView.findViewById(R.id.magnitude);

        magnitudeView.setText(currentEarthquake.getMagnitude());

        //Find the TextView with view ID location.
        TextView locationView = (TextView) listItemView.findViewById(R.id.location);

        locationView.setText(currentEarthquake.getLocation());

        Date dateObject = new Date(currentEarthquake.getTimeInMilliseconds());

        //Find the TextView with view ID date.
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);

        String formattedDate = formatDate(dateObject);

        dateView.setText(formattedDate);

        TextView timeView = (TextView) listItemView.findViewById(R.id.time);

        String formattedTime = formatTime(dateObject);

        timeView.setText(formattedTime);

        // Return the list item view that is now showing the appropriate data.
        return listItemView;
    }
}
