package com.example.dalal.gpnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class restorantlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restorantlist);
    }

    public void table(View view)
    {
        Intent intent = new Intent(restorantlist.this,makereservation.class);
        startActivity(intent);
    }

}
