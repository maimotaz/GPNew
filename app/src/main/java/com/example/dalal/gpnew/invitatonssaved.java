package com.example.dalal.gpnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class invitatonssaved extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invitatonssaved);
    }

    public  void Back (View view)
    {

        Intent intent = new Intent(invitatonssaved.this,invitationpage.class);
        startActivity(intent);

    }


    public  void frindslist (View view)
    {

        Intent intent = new Intent(invitatonssaved.this,friendslist.class);
        startActivity(intent);

    }
}
