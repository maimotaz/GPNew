package com.example.dalal.gpnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class sug extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sug);
    }


    public  void Back (View view)
    {

        Intent intent = new Intent(sug.this,resevedinvitation.class);
        startActivity(intent);

    }

    public  void profile(View view)
    {

        Intent intent = new Intent(sug.this,profileuser.class);
        startActivity(intent);

    }
}
