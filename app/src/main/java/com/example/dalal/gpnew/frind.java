package com.example.dalal.gpnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class frind extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frind);
    }


    public  void profile (View view)
    {

        Intent intent = new Intent(frind.this,profileuser.class);
        startActivity(intent);

    }


    public  void Back (View view)
    {

        Intent intent = new Intent(frind.this,homeuser.class);
        startActivity(intent);

    }
}
