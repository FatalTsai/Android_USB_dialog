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
        });


        hdmi.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_DOWN){

                    Log.d("down","down");
                    hdmi.setBackgroundResource(R.drawable.hdmi_press);
                }

                if (event.getAction() == MotionEvent.ACTION_UP) {

                    Log.d("up","up");
                    hdmi_actived = !hdmi_actived;
                    if(hdmi_actived){
                        hdmi.setBackgroundResource(R.drawable.hdmi_active);
                    }
                    else {
                        hdmi.setBackgroundResource(R.drawable.hdmi);
                    }

                }
                return false;
            }
        });

        usb_files.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_DOWN){

                    Log.d("down","down");
                    usb_files.setBackgroundResource(R.drawable.usb_files_press);
                }

                if (event.getAction() == MotionEvent.ACTION_UP) {

                    Log.d("up","up");
                    usb_files_actived = !usb_files_actived;
                    if(hdmi_actived){
                        usb_files.setBackgroundResource(R.drawable.usb_files);
                    }
                    else {
                        usb_files.setBackgroundResource(R.drawable.usb_files);
                    }

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
                return false;
            }
        });

        cross_link.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_DOWN){

                    Log.d("down","down");
                    cross_link.setBackgroundResource(R.drawable.cross_link_press);
                }

                if (event.getAction() == MotionEvent.ACTION_UP) {

                    Log.d("up","up");
                    cross_link_actived = !cross_link_actived;
                    if(cross_link_actived){
                        cross_link.setBackgroundResource(R.drawable.cross_link_active);
                    }
                    else {
                        cross_link.setBackgroundResource(R.drawable.cross_link);
                    }

                }
                return false;
            }
        });


        audio_to_car.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_DOWN){

                    Log.d("down","down");
                    audio_to_car.setBackgroundResource(R.drawable.audio_to_car_press);
                }

                if (event.getAction() == MotionEvent.ACTION_UP) {

                    Log.d("up","up");
                    audio_to_car_actived = !audio_to_car_actived;
                    if(audio_to_car_actived){
                        audio_to_car.setBackgroundResource(R.drawable.audio_to_car_active);
                    }
                    else {
                        audio_to_car.setBackgroundResource(R.drawable.audio_to_car);
                    }

                }
                return false;
            }
        });

        volume.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_DOWN){

                    Log.d("down","down");
                    volume.setBackgroundResource(R.drawable.volume_press);
                }

                if (event.getAction() == MotionEvent.ACTION_UP) {

                    Log.d("up","up");
                    volume_actived = !volume_actived;
                    if(volume_actived){
                        volume.setBackgroundResource(R.drawable.volume_active);
                    }
                    else {
                        volume.setBackgroundResource(R.drawable.volume);
                    }

                }
                return false;
            }
        });

        brightness.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_DOWN){

                    Log.d("down","down");
                    brightness.setBackgroundResource(R.drawable.brightness_press);
                }

                if (event.getAction() == MotionEvent.ACTION_UP) {

                    Log.d("up","up");
                    brightness_actived = !brightness_actived;
                    if(brightness_actived){
                        brightness.setBackgroundResource(R.drawable.brightness_active);
                    }
                    else {
                        brightness.setBackgroundResource(R.drawable.brightness);
                    }

                }
                return false;
            }
        });

        chlid_lock.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_DOWN){

                    Log.d("down","down");
                    chlid_lock.setBackgroundResource(R.drawable.child_lock_press);
                }

                if (event.getAction() == MotionEvent.ACTION_UP) {

                    Log.d("up","up");
                    chlid_lock_actived = !chlid_lock_actived;
                    if(chlid_lock_actived){
                        chlid_lock.setBackgroundResource(R.drawable.child_lock_active);
                    }
                    else {
                        chlid_lock.setBackgroundResource(R.drawable.child_lock);
                    }

                }
                return false;
            }
        });



    }
}
