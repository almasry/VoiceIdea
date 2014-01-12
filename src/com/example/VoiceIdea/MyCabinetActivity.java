package com.example.VoiceIdea;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Eduard on 1/12/14.
 */
public class MyCabinetActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cabinet); //set this activity to cabinet.xml view

        ImageButton homeButton = (ImageButton) findViewById(R.id.home_button);
        ImageButton worldButton = (ImageButton) findViewById(R.id.world_button);

        homeButton.setOnClickListener(new View.OnClickListener() { // Listening to register new account link
            public void onClick(View v) {  // Switching to Register screen
                Intent i = new Intent(getApplicationContext(), MyCabinetActivity.class);
                startActivity(i);
            }
        });

        worldButton.setOnClickListener(new View.OnClickListener() { // Listening to register new account link
            public void onClick(View v) {  // Switching to Register screen
                Intent i = new Intent(getApplicationContext(), WorldActivity.class);
                startActivity(i);
            }
        });
    }
}