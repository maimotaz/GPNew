package com.example.dalal.gpnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class userslist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userslist);
    }

    public  void profile (View view)
    {

        Intent intent = new Intent(userslist.this,homeuser.class);
        startActivity(intent);

    }
}
