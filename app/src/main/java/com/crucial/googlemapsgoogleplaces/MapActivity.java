package com.crucial.googlemapsgoogleplaces;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MapActivity extends AppCompatActivity {
    private static final String TAG ="MapActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
    }
}
