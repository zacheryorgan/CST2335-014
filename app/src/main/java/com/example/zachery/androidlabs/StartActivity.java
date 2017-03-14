package com.example.zachery.androidlabs;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class StartActivity extends AppCompatActivity {

    public Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        final String ACTIVITY_NAME = "StartActivity";
        Log.i(ACTIVITY_NAME, "In onCreate()");


        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartActivity.this, ListItemsActivity.class);
                startActivityForResult(intent, 5);
            }
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 5 && resultCode == Activity.RESULT_OK){
            final String ACTIVITY_NAME = "StartActivity";
            Log.i(ACTIVITY_NAME, "Returned to StartActivity.onActivityResult");
            String messagePassed = data.getStringExtra("Response");

            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(StartActivity.this, messagePassed, duration);
            toast.show();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        final String ACTIVITY_NAME = "StartActivity";
        Log.i(ACTIVITY_NAME, "In onResume()");



    }
    @Override
    protected void onStart() {
        super.onStart();
        final String ACTIVITY_NAME = "StartActivity";
        Log.i(ACTIVITY_NAME, "In onStart()");
    }
    @Override
    protected void onPause() {
        super.onPause();
        final String ACTIVITY_NAME = "StartActivity";
        Log.i(ACTIVITY_NAME, "In onPause()");

    }
    @Override
    protected void onStop() {
        super.onStop();
        final String ACTIVITY_NAME = "StartActivity";
        Log.i(ACTIVITY_NAME, "In onStop()");

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        final String ACTIVITY_NAME = "StartActivity";
        Log.i(ACTIVITY_NAME, "In onDestroy()");

    }
}
