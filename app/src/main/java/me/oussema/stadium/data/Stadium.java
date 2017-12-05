package me.oussema.stadium.data;

/**
 * Created by root on 05/12/17.
 */

public class Stadium {


    private int mId;
    private String stadiumName;
    private String stadiumLocation;


    public Stadium(int id) {
        mId = id;
        setDataToStadium();
    }


    private void setDataToStadium() {
        // here we will fetch the data
        stadiumName = "Stadium_" + ( Math.random() + 5 )* 20;
        stadiumLocation = "Location_" + ( Math.random() + 5) * 20;
    }

    public String getName() {
        return stadiumName;
    }

    public String getLocation() {
        return stadiumLocation;
    }

}
