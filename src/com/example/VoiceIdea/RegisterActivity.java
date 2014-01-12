package com.example.VoiceIdea;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Eduard on 1/10/14.
 */
public class RegisterActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register); //set this activity to register.xml view

        TextView loginScreen = (TextView) findViewById(R.id.link_to_login);
        Button buttonRegister = (Button) findViewById(R.id.btnRegister);
        loginScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View arg0){ //Closing registration screen
                finish(); //Switching to Login Screen by closing this one
            }
        });

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), RegistrationSuccessActivity.class);
                startActivity(i);
            }
        });


    }
}