package com.example.dalal.gpnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class login extends AppCompatActivity {

    public EditText usernameEditText;
    public EditText passworedEditText;
    public Button   loginbutton ;
    public TextView registerTextViw;
    public TextView changePassTextViw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginbutton       = (Button) findViewById(R.id.button2);
        usernameEditText  = (EditText) findViewById(R.id.editText5);
        passworedEditText = (EditText) findViewById(R.id.editText9);
        registerTextViw   = (TextView) findViewById(R.id.textView2);
        changePassTextViw = (TextView) findViewById(R.id.textView);

        registerTextViw.setOnClickListener (new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login.this,register.class);
                startActivity(intent);
            }

        });
    }


    public void forgetPass(View view) {

        Intent intent = new Intent(login.this,forgetpasswored.class);
        startActivity(intent);

    }

    public  void  login (View view)
    {

        Intent intent = new Intent(login.this,homeuser.class);
            startActivity(intent);
    }

    public  void  restaurants (View view)
    {

        Intent intent = new Intent(login.this,restorantlist.class);
        startActivity(intent);
    }



}
