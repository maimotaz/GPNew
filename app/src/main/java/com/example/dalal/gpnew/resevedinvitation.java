package com.example.dalal.gpnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class resevedinvitation extends AppCompatActivity {

    Button regester;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resevedinvitation);

        regester = (Button) findViewById(R.id.button15);


        regester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String msg = "Added successfully ";
                Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
                //do things

            }
        });
    }
    public  void profile(View view)
    {

        Intent intent = new Intent(resevedinvitation.this,profileuser.class);
        startActivity(intent);

    }

    public  void Back (View view)
    {

        Intent intent = new Intent(resevedinvitation.this,resevedinvitation.class);
        startActivity(intent);

    }

    public  void apo (View view)
    {

        Intent intent = new Intent(resevedinvitation.this,apologization.class);
        startActivity(intent);

    }

    public  void sug (View view)
    {

        Intent intent = new Intent(resevedinvitation.this,sug.class);
        startActivity(intent);

    }

}
