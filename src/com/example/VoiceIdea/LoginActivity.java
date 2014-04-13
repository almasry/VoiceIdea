package com.example.VoiceIdea;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);  //setting default screen to login.xml

        //EditText emailLogin = (EditText) findViewById(R.id.email_login);
        //EditText passwordLogin = (EditText) findViewById(R.id.password_login);
        Button buttonLogin = (Button) findViewById(R.id.button_login);
        TextView registerScreen = (TextView) findViewById(R.id.link_to_register);

        //emailLogin.setTextColor(getResources().getColor(R.color.textedit_text));
        //passwordLogin.setTextColor(getResources().getColor(R.color.textedit_text));
        // emailLogin.setBackgroundColor(getResources().getColor(R.color.textedit_bg));
        //passwordLogin.setBackgroundColor(getResources().getColor(R.color.textedit_bg));

        buttonLogin.setOnClickListener(new View.OnClickListener() { // Listening to register new account link
            public void onClick(View v) {  // Switching to Register screen
                Intent i = new Intent(getApplicationContext(), MyCabinetActivity.class);
                startActivity(i);
            }
        });

        registerScreen.setOnClickListener(new View.OnClickListener() { // Listening to register new account link
            public void onClick(View v) {  // Switching to Register screen
                Intent i = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(i);
            }
        });


    }
}
