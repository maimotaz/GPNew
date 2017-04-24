package com.example.dalal.gpnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class resevedinvitations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resevedinvitations);
    }

    public  void profile(View view)
    {

        Intent intent = new Intent(resevedinvitations.this,profileuser.class);
        startActivity(intent);

    }


    public void resev1(View view)
    {
        Intent intent = new Intent(resevedinvitations.this,resevedinvitation.class);
        startActivity(intent);
    }


    public  void Back (View view)
    {

        Intent intent = new Intent(resevedinvitations.this,invitationpage.class);
        startActivity(intent);

    }
}
