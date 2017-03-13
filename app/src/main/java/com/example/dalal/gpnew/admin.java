package com.example.dalal.gpnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class admin extends AppCompatActivity {

    Button useresButton ;
    Button resturantsButton ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        resturantsButton = (Button) findViewById(R.id.button19);
        useresButton     = (Button) findViewById(R.id.button18);
    }


    public void useres (View view)
    {
        Intent intent = new Intent(admin.this,users.class);
        startActivity(intent);
    }

    public void restaurants (View view)
    {
        Intent intent2 = new Intent(admin.this,restaurants.class);
        startActivity(intent2);
    }


    public  void Back (View view)
    {

        Intent intent = new Intent(admin.this,login.class);
        startActivity(intent);

    }


    public void GoProfilePage  (View view)
    {
        Intent intent = new Intent(admin.this,admienprofile.class);
        startActivity(intent);
    }


}
