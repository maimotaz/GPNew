package com.example.dalal.gpnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class tableinfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tableinfo);
    }

    public  void profile (View view)
    {

        Intent intent = new Intent(tableinfo.this,homeuser.class);
        startActivity(intent);

    }
}
