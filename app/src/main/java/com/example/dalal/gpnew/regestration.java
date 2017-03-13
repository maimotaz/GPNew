package com.example.dalal.gpnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class regestration extends AppCompatActivity {

    TextView back ;
    TextView profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regestration);

                back = (TextView)  findViewById(R.id.textView30);
                profile = (TextView) findViewById(R.id.textView29);
    }

    public  void Back (View view)
    {

        Intent intent = new Intent(regestration.this,users.class);
        startActivity(intent);

    }


    public void     GoProfilePage  (View view)
    {
        Intent intent = new Intent(regestration.this,admienprofile.class);
        startActivity(intent);
    }
}
