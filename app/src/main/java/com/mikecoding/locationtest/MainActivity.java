package com.mikecoding.locationtest;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Use the LocationManager class to obtain GPS locations */

        LocationManager mlocManager =

                (LocationManager)getSystemService(Context.LOCATION_SERVICE);

        LocationListener mlocListener = new MyLocationListener();

        mlocManager.requestLocationUpdates( LocationManager.GPS_PROVIDER, 0, 0, mlocListener);

    }
    /* Class My Location Listener */

    public class MyLocationListener implements LocationListener

    {

        @Override
        public void onLocationChanged(Location loc)

        {

            loc.getLatitude();

            loc.getLongitude();

            String Text = "My current location is: " +
                    "Latitud = " + loc.getLatitude() +
                    "Longitud = " + loc.getLongitude();

            Toast.makeText( getApplicationContext(),

                    Text,

                    Toast.LENGTH_SHORT).show();

        }
        @Override

        public void onProviderDisabled(String provider)

        {

            Toast.makeText( getApplicationContext(),

                    "Gps Disabled",

                    Toast.LENGTH_SHORT ).show();

        }

        @Override

        public void onProviderEnabled(String provider)

        {

            Toast.makeText( getApplicationContext(),

                    "Gps Enabled",

                    Toast.LENGTH_SHORT).show();

        }

        @Override

        public void onStatusChanged(String provider, int status, Bundle extras)

        {

        }

    }/* End of Class MyLocationListener */

}/* End of UseGps Activity */

