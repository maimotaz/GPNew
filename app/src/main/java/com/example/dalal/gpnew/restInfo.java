package com.example.dalal.gpnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class restInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rest_info);
    }


    public  void Back (View view)
    {

        Intent intent = new Intent(restInfo.this,restaurants.class);
        startActivity(intent);

    }


    public void GoProfilePage  (View view)
    {
        Intent intent = new Intent(restInfo.this,admin.class);
        startActivity(intent);
    }

}
