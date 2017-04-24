package com.example.dalal.gpnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class users extends AppCompatActivity {

    TextView user ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);

        user = (EditText) findViewById(R.id.editText10);


    }

    public void viewInfo (View view)
    {

        Intent intent = new Intent(users.this,regestration.class);
        startActivity(intent);

    }

    public  void Back (View view)
    {

        Intent intent = new Intent(users.this,admin.class);
        startActivity(intent);

    }


    public void profile  (View view)
    {
        Intent intent = new Intent(users.this,admienprofile.class);
        startActivity(intent);
    }




}
