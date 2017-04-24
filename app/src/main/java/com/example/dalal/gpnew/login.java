package com.example.dalal.gpnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class login extends AppCompatActivity {

    public EditText usernameEditText;
    public EditText passworedEditText;
    public Button   loginbutton ;
    public TextView registerTextViw;
    public TextView changePassTextViw;
    private String[] arraySpinner;
    Spinner s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        this.arraySpinner = new String[] {
                "Admin", "User", "Restaurant agent"
        };
         s = (Spinner) findViewById(R.id.spinner6);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        s.setAdapter(adapter);


        loginbutton       = (Button) findViewById(R.id.button2);
        usernameEditText  = (EditText) findViewById(R.id.editText5);
        passworedEditText = (EditText) findViewById(R.id.editText9);
        registerTextViw   = (TextView) findViewById(R.id.textView2);
        changePassTextViw = (TextView) findViewById(R.id.textView);

        registerTextViw.setOnClickListener (new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login.this,register.class);
                startActivity(intent);
            }

        });


    }
    public void forgetPass(View view) {

        Intent intent = new Intent(login.this,forgetpasswored.class);
        startActivity(intent);

    }

    public  void  login (View view)
    {
         if(s.getSelectedItem().toString().equals("Admin")){
        Intent intent = new Intent(login.this,admin.class);
            startActivity(intent);}

        if(s.getSelectedItem().toString().equals("User")){
            Intent intent2 = new Intent(login.this,homeuser.class);
        startActivity(intent2);}

        if(s.getSelectedItem().toString().equals("Restaurant agent")){
         Intent intent3 = new Intent(login.this,homeagent.class);
            startActivity(intent3);}
    }




}
