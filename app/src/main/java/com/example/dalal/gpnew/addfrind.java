package com.example.dalal.gpnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class addfrind extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addfrind);
    }

    public  void profile (View view)
    {
        Intent intent = new Intent(addfrind.this,profileuser.class);
        startActivity(intent);
    }

}
