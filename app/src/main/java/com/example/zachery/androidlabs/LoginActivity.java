package com.example.zachery.androidlabs;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    Button button1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final String ACTIVITY_NAME = "LoginActivity";
        Log.i(ACTIVITY_NAME, "In onCreate()");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


    }
    @Override
    protected void onResume() {
        super.onResume();
        final String ACTIVITY_NAME = "LoginActivity";
        Log.i(ACTIVITY_NAME, "In onResume()");

    }
    @Override
    protected void onStart() {
        super.onStart();
        final String ACTIVITY_NAME = "LoginActivity";
        Log.i(ACTIVITY_NAME, "In onStart()");





        final SharedPreferences sharedPref = this.getPreferences(Context.MODE_PRIVATE);
        final EditText edit = (EditText)findViewById(R.id.edit);
        edit.setText(sharedPref.getString("DefaultEmail", "email@domain.com"));



        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String email = edit.getText().toString();
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString("DefaultEmail",email).commit();
                Intent intent = new Intent(LoginActivity.this, StartActivity.class);
                startActivity(intent);
            }
        });




    }
    @Override
    protected void onPause() {
        super.onPause();
        final String ACTIVITY_NAME = "LoginActivity";
        Log.i(ACTIVITY_NAME, "In onPause()");

    }
    @Override
    protected void onStop() {
        super.onStop();
        final String ACTIVITY_NAME = "LoginActivity";
        Log.i(ACTIVITY_NAME, "In onStop()");

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        final String ACTIVITY_NAME = "LoginActivity";
        Log.i(ACTIVITY_NAME, "In onDestroy()");

    }

     }