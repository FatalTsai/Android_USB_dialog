package com.example.android_byoc_index_ui;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    boolean mirror_actived,hdmi_actived,usb_files_actived,cross_link_actived,audio_to_car_actived,volume_actived,brightness_actived,chlid_lock_actived;
    Button mirror,hdmi,usb_files,cross_link,volume,audio_to_car,brightness,chlid_lock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mirror = findViewById(R.id.mirror);
        hdmi = findViewById(R.id.hdmi);
        usb_files = findViewById(R.id.usb_files);
        cross_link = findViewById(R.id.cross_link);
        audio_to_car = findViewById(R.id.audio_to_car);
        brightness = findViewById(R.id.brightness);
        volume = findViewById(R.id.volume);
        chlid_lock = findViewById(R.id.child_lock);


/*
        mirror.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_DOWN){

                    Log.d("down","down");
                    mirror.setBackgroundResource(R.drawable.mirror_press);
                }

                if (event.getAction() == MotionEvent.ACTION_UP) {

                    Log.d("up","up");
                    mirror_actived = !mirror_actived;
                    if(mirror_actived){
                        mirror.setBackgroundResource(R.drawable.mirror_active);
                    }
                    else {
                        mirror.setBackgroundResource(R.drawable.mirror);
                    }

                }
                return false;
            }
        });*/

//set the click listener
//https://stackoverflow.com/questions/2604599/android-imagebutton-with-a-selected-state
//https://xnfood.com.tw/android-selector/
        mirror.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                button.setActivated(!button.isActivated());

                if (button.isActivated()) {
                    //Handle selected state change
                } else {
                    //Handle de-select state change
                }

            }

        });
        hdmi.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                button.setActivated(!button.isActivated());

                if (button.isActivated()) {
                    //Handle selected state change
                } else {
                    //Handle de-select state change
                }

            }
        });



        //dialog ref :https://code-android-example.blogspot.com/2019/12/how-to-custom-layout-alertdialog-android.html
        //https://xnfood.com.tw/android-selector/
        usb_files.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View button) {
                button.setPressed(!button.isPressed());



                // Build an AlertDialog
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                LayoutInflater inflater = getLayoutInflater();
                View dialogView = inflater.inflate(R.layout.alertdialog_custom_view,null);


                // Set the custom layout as alert dialog view
                builder.setView(dialogView);
                // Get the custom alert dialog view widgets reference
                Button btn_positive = (Button) dialogView.findViewById(R.id.dialog_ok);
                Button btn_negative = (Button) dialogView.findViewById(R.id.dialog_small_close);

                // Create the alert dialog
                final AlertDialog dialog = builder.create();
                // Set positive/yes button click listener
                btn_positive.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Dismiss the alert dialog
                        dialog.cancel();
                    }
                });
                btn_negative.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Dismiss the alert dialog
                        dialog.cancel();
                    }
                });
                // Display the custom alert dialog on interface
                dialog.show();
            }
        });
        cross_link.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                button.setActivated(!button.isActivated());

                if (button.isActivated()) {
                    //Handle selected state change
                } else {
                    //Handle de-select state change
                }

            }
        });

        audio_to_car.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                button.setActivated(!button.isActivated());

                if (button.isActivated()) {
                    //Handle selected state change
                } else {
                    //Handle de-select state change
                }

            }
        });

        volume.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                button.setActivated(!button.isActivated());

                if (button.isActivated()) {
                    //Handle selected state change
                } else {
                    //Handle de-select state change
                }

            }
        });

        brightness.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                button.setActivated(!button.isActivated());

                if (button.isActivated()) {
                    //Handle selected state change
                } else {
                    //Handle de-select state change
                }

            }
        });

        chlid_lock.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                button.setActivated(!button.isActivated());

                if (button.isActivated()) {
                    //Handle selected state change
                } else {
                    //Handle de-select state change
                }

            }
        });


    }
}
