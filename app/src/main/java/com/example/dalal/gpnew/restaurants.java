package com.example.dalal.gpnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class restaurants extends AppCompatActivity {
    TextView restaurant ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        restaurant = (EditText) findViewById(R.id.editText10);
    }






    public  void Back (View view)
    {

        Intent intent = new Intent(restaurants.this,admin.class);
        startActivity(intent);

    }


    public void GoProfilePage  (View view)
    {
        Intent intent = new Intent(restaurants.this,admienprofile.class);
        startActivity(intent);
    }



    public void viewInfo (View view)
    {

        Intent intent = new Intent(restaurants.this,regestration.class);
        startActivity(intent);

    }

}
