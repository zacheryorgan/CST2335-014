package com.example.zachery.androidlabs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ListItemsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_items);
        final String ACTIVITY_NAME = "ListItemsActivity";
        Log.i(ACTIVITY_NAME, "In onCreate()");
    }
    @Override
    protected void onResume() {
        super.onResume();
        final String ACTIVITY_NAME = "ListItemsActivity";
        Log.i(ACTIVITY_NAME, "In onResume()");

    }
    @Override
    protected void onStart() {
        super.onStart();
        final String ACTIVITY_NAME = "ListItemsActivity";
        Log.i(ACTIVITY_NAME, "In onStart()");
    }
    @Override
    protected void onPause() {
        super.onPause();
        final String ACTIVITY_NAME = "ListItemsActivity";
        Log.i(ACTIVITY_NAME, "In onPause()");

    }
    @Override
    protected void onStop() {
        super.onStop();
        final String ACTIVITY_NAME = "ListItemsActivity";
        Log.i(ACTIVITY_NAME, "In onStop()");

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        final String ACTIVITY_NAME = "ListItemsActivity";
        Log.i(ACTIVITY_NAME, "In onDestroy()");

    }

}
