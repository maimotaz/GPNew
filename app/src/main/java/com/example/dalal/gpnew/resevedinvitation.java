package com.example.dalal.gpnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class resevedinvitation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resevedinvitation);
    }
    public  void profile(View view)
    {

        Intent intent = new Intent(resevedinvitation.this,profileuser.class);
        startActivity(intent);

    }

    public  void Back (View view)
    {

        Intent intent = new Intent(resevedinvitation.this,resevedinvitation.class);
        startActivity(intent);

    }

    public  void apo (View view)
    {

        Intent intent = new Intent(resevedinvitation.this,apologization.class);
        startActivity(intent);

    }

    public  void sug (View view)
    {

        Intent intent = new Intent(resevedinvitation.this,sug.class);
        startActivity(intent);

    }

}
