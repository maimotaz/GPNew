package com.example.dalal.gpnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class homeagent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeagent);
    }


    public  void profile (View view)
    {

        Intent intent = new Intent(homeagent.this,profileagent.class);
        startActivity(intent);

    }

    public  void Back (View view)
    {

        Intent intent = new Intent(homeagent.this,login.class);
        startActivity(intent);

    }

    public  void book (View view)
    {

        Intent intent = new Intent(homeagent.this,bookedtables.class);
        startActivity(intent);

    }


    public  void unbook (View view)
    {

        Intent intent = new Intent(homeagent.this,unbookedtable.class);
        startActivity(intent);

    }
}
