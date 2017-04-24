package com.example.dalal.gpnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class homeuser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeuser);

    }


    public  void profile(View view)
    {

        Intent intent = new Intent(homeuser.this,profileuser.class);
        startActivity(intent);

    }


    public  void Back (View view)
    {

        Intent intent = new Intent(homeuser.this,login.class);
        startActivity(intent);

    }

    public  void friends (View view)
    {

        Intent intent = new Intent(homeuser.this,frind.class);
        startActivity(intent);
    }

    public  void invitation (View view)
    {

        Intent intent = new Intent(homeuser.this,invitationpage.class);
        startActivity(intent);
    }


    public  void notifications (View view)
    {

        Intent intent = new Intent(homeuser.this,notifocations.class);
        startActivity(intent);
    }


    public  void rest (View view)
    {

        Intent intent = new Intent(homeuser.this,restorantlist.class);
        startActivity(intent);
    }

}
