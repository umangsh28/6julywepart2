package com.example.a6julywepart2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity  {


    private Button mbtn;

    private EditText mname;
    private EditText mlast;
    private EditText memail;
    private EditText mnum;

    SharedPreferences sharedPreferences;

    private static final String Shared_name="mypref";
    private static final String KEY_Name="name";
    private static final String KEY_Last="last";
    private static final String KEY_email="email";
    private static final String KEY_num="num";





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mbtn=findViewById(R.id.btn1);
        mname=findViewById(R.id.tname);
        mlast=findViewById(R.id.tlast);
        memail=findViewById(R.id.tmail);
        mnum=findViewById(R.id.tnum);

        sharedPreferences =getSharedPreferences(Shared_name,MODE_PRIVATE);


        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.putString(KEY_Name,mname.getText().toString());
                editor.putString(KEY_Last,mlast.getText().toString());
                editor.putString(KEY_email,memail.getText().toString());
                editor.putString(KEY_num,mnum.getText().toString());
                editor.apply();

                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });


    }
}