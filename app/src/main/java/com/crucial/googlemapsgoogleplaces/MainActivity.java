package com.crucial.googlemapsgoogleplaces;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static final String FINE_LOCATION = Manifest.permission.ACCESS_FINE_LOCATION;
    private static final String COARSE_LOCATION = Manifest.permission.ACCESS_COARSE_LOCATION;
    private static final int LOCATION_PERMISSION_CODE = 1234;

    private Boolean mLocationPermissionsGranted = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void getLocationPermission(){String[] permissions =
            {Manifest.permission.ACCESS_FINE_LOCATION,Manifest.permission.ACCESS_COARSE_LOCATION};

    if(ContextCompat.checkSelfPermission(this.getApplicationContext(),FINE_LOCATION)
            == PackageManager.PERMISSION_GRANTED){
        if (ContextCompat.checkSelfPermission(this.getApplicationContext(),COARSE_LOCATION)
                == PackageManager.PERMISSION_GRANTED){
            mLocationPermissionsGranted = true;

        }else{
            ActivityCompat.requestPermissions(this,permissions,LOCATION_PERMISSION_CODE);
        }
    }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }
}
