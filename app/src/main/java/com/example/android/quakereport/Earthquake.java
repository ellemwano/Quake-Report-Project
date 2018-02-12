package com.example.android.quakereport;

/**
 * Created by ElleMwa on 11/02/2018.
 */

public class Earthquake {

    /** Magnitude of teh earthquake **/
    private double mMagnitude;

    /** Location of the earthquake **/
    private String mLocation;

    /** Time of the earthquake **/
    private long mDate;

    /** Website URL of the earthquake */
    private String mUrl;


    /**
     * Construct a new {@link Earthquake} object
     * @param magnitude the magnitude of the earthquake
     * @param location the location where the earthquake happened
     * @param date the time in milliseconds (form the Epoch)
     *                           when the earthquake happened
     */
    public Earthquake(double magnitude, String location, long date, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
        mUrl = url;
    }

    /**
     * Return the magnitude of the earthquake
     */
    public double getMagnitude() {
        return mMagnitude;
    }

    /**
     * Return the location of the earthquake
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Return the time of the earthquake
     */
    public long getDate() {
        return mDate;
    }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }

}
