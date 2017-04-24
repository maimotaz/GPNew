package com.example.dalal.gpnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class coming extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coming);
    }

    public  void profile (View view)
    {

        Intent intent = new Intent(coming.this,profileuser.class);
        startActivity(intent);

    }


    public  void Back(View view)
    {

        Intent intent = new Intent(coming.this,homeuser.class);
        startActivity(intent);

    }
}
