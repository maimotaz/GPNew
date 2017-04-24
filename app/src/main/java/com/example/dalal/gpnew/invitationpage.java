package com.example.dalal.gpnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class invitationpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invitationpage);
    }

    public void saved(View view)
    {
        Intent intent = new Intent(invitationpage.this,invitatonssaved.class);
        startActivity(intent);
    }


    public void create(View view)
    {
        Intent intent = new Intent(invitationpage.this,invititioncretion.class);
        startActivity(intent);
    }

    public void resev(View view)
    {
        Intent intent = new Intent(invitationpage.this,resevedinvitations.class);
        startActivity(intent);
    }


    public void send(View view)
    {
        Intent intent = new Intent(invitationpage.this,sentreservation.class);
        startActivity(intent);
    }

    public  void profile (View view)
    {

        Intent intent = new Intent(invitationpage.this,profileuser.class);
        startActivity(intent);

    }

    public  void Back (View view)
    {

        Intent intent = new Intent(invitationpage.this,login.class);
        startActivity(intent);

    }
}
