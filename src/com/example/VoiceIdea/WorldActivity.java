package com.example.VoiceIdea;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Eduard on 1/14/14.
 */
public class WorldActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cabinet); //set this activity to cabinet.xml view

        ImageButton homeButton = (ImageButton) findViewById(R.id.home_button);
        ImageButton configurationButton = (ImageButton) findViewById(R.id.configuration_button);

        homeButton.setOnClickListener(new View.OnClickListener() { // Listening to register new account link
            public void onClick(View v) {  // Switching to Register screen
                Intent i = new Intent(getApplicationContext(), MyCabinetActivity.class);
                startActivity(i);
            }
        });

        configurationButton.setOnClickListener(new View.OnClickListener() { // Listening to register new account link
            public void onClick(View v) {  // Switching to Register screen
                Intent i = new Intent(getApplicationContext(), WorldActivity.class);
                startActivity(i);
            }
        });
    }
}