package com.example.dalal.gpnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class invititioncretion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invititioncretion);
    }


    public  void Back (View view)
    {

        Intent intent = new Intent(invititioncretion.this,invitationpage.class);
        startActivity(intent);

    }

    public  void list (View view)
    {

        Intent intent = new Intent(invititioncretion.this,friendslist.class);
        startActivity(intent);

    }
}
