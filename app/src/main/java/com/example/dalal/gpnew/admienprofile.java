package com.example.dalal.gpnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class admienprofile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admienprofile);
    }


    public  void Back (View view)
    {

        Intent intent = new Intent(admienprofile.this,login.class);
        startActivity(intent);

    }
}
