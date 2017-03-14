package com.example.zachery.androidlabs;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.Toast;

public class ListItemsActivity extends AppCompatActivity {

    private  ImageButton image1;
    private final int REQUEST_IMAGE_CAPTURE = 1;
    private Activity ListItemsActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_items);
        final String ACTIVITY_NAME = "ListItemsActivity";
        Log.i(ACTIVITY_NAME, "In onCreate()");

        image1 = (ImageButton) findViewById(R.id.image1);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, REQUEST_IMAGE_CAPTURE);






            }


        });



        final Switch switch1 = (Switch) findViewById(R.id.switch1);
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (switch1.isChecked())
                {
                    CharSequence text = "Switch is On";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(ListItemsActivity.this, text, duration);
                    toast.show();

                }
                else
                {
                    CharSequence text2 = "Switch is Off";
                    int duration2 = Toast.LENGTH_LONG;
                    Toast toast2 = Toast.makeText(ListItemsActivity.this, text2, duration2);
                    toast2.show();
                }
            }

        });


        final CheckBox check = (CheckBox) findViewById(R.id.check);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ListItemsActivity.this);
                builder.setMessage("Do you want to finish the activity");
                builder.setCancelable(true);
                builder.setTitle("Alert Dialog");

                builder.setPositiveButton("Yes",
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog, int id){

                                Intent resultIntent = new Intent(  );
                                resultIntent.putExtra("Response", "My information to share");
                                setResult(Activity.RESULT_OK, resultIntent);
                                finish();

                            }

                        });
                builder.setNegativeButton("No",
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog, int id){
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();





            }


        });


    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK){
            Bundle extras = data.getExtras();
            Bitmap bitmap = (Bitmap) extras.get("data");
            image1.setImageBitmap(bitmap);
        }
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
