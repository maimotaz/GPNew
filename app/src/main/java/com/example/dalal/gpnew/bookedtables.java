package com.example.dalal.gpnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class bookedtables extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookedtables);
    }


    public  void Back (View view)
    {

        Intent intent = new Intent(bookedtables.this,homeagent.class);
        startActivity(intent);

    }


    public  void profile (View view)
    {

        Intent intent = new Intent(bookedtables.this,profileagent.class);
        startActivity(intent);

    }
}
