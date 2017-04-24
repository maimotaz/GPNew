package com.example.dalal.gpnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class sentreservation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sentreservation);
    }

    public void come(View view)
    {
        Intent intent = new Intent(sentreservation.this,coming.class);
        startActivity(intent);
    }
    public void notcome(View view)
    {
        Intent intent = new Intent(sentreservation.this,notcominglist.class);
        startActivity(intent);
    }
    public void sugg(View view)
    {
        Intent intent = new Intent(sentreservation.this,sugestion.class);
        startActivity(intent);
    }

    public void Back(View view)
    {
        Intent intent = new Intent(sentreservation.this,invitationpage.class);
        startActivity(intent);
    }

    public void profile(View view)
    {
        Intent intent = new Intent(sentreservation.this,profileuser.class);
        startActivity(intent);
    }
}
