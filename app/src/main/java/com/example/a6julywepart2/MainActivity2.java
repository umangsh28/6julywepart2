package com.example.a6julywepart2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private Button mbtn1;

    private TextView mname1;
    private TextView mlast1;
    private TextView memail1;
    private TextView mnum1;
    private TextView mseat;
    private TextView mdate;


    SharedPreferences sharedPreferences;

    private static final String Shared_name="mypref";
    private static final String KEY_Name="name";
    private static final String KEY_Last="last";
    private static final String KEY_email="email";
    private static final String KEY_num="num";
    private static final String KEY_seat="seat";
    private static final String KEY_date="date";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mbtn1=findViewById(R.id.button);
        mname1=findViewById(R.id.tnamew);
        mlast1=findViewById(R.id.tlastw);
        memail1=findViewById(R.id.tmailw);
        mnum1=findViewById(R.id.tnumw);
        mseat=findViewById(R.id.tseat);
        mdate=findViewById(R.id.tdate);

        sharedPreferences=getSharedPreferences(Shared_name,MODE_PRIVATE);

        String name=sharedPreferences.getString(KEY_Name,"");
        mname1.setText(name);
        String email=sharedPreferences.getString(KEY_email,"");
        memail1.setText(email);
        String last=sharedPreferences.getString(KEY_Last,"");
        mlast1.setText(last);
        String num=sharedPreferences.getString(KEY_num,"");
        mnum1.setText(num);




        mbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.putString(KEY_Name,mname1.getText().toString());
                editor.putString(KEY_Last,mlast1.getText().toString());
                editor.putString(KEY_email,memail1.getText().toString());
                editor.putString(KEY_num,mnum1.getText().toString());
                editor.putString(KEY_seat,mseat.getText().toString());
                editor.putString(KEY_date,mdate.getText().toString());
                editor.apply();
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);
            }
        });

    }
}