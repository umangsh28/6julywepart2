package com.example.a6julywepart2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private TextView mname1;
    private TextView mlast1;
    private TextView memail1;
    private TextView mnum1;
    private TextView mseat;
    private TextView mdate;
    private Button mbtn1;
    private TextView mtext1;

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
        setContentView(R.layout.activity_main3);

        mbtn1=findViewById(R.id.button);
        mname1=findViewById(R.id.tnamew);
        mlast1=findViewById(R.id.tlastw);
        memail1=findViewById(R.id.tmailw);
        mnum1=findViewById(R.id.tnumw);
        mseat=findViewById(R.id.tseat);
        mdate=findViewById(R.id.tdate);
        mtext1=findViewById(R.id.textView);

        sharedPreferences=getSharedPreferences(Shared_name,MODE_PRIVATE);

        String name=sharedPreferences.getString(KEY_Name,"");
        mname1.setText(name);
        String email=sharedPreferences.getString(KEY_email,"");
        memail1.setText(email);
        String last=sharedPreferences.getString(KEY_Last,"");
        mlast1.setText(last);
        String num=sharedPreferences.getString(KEY_num,"");
        mnum1.setText(num);
        String seat=sharedPreferences.getString(KEY_seat,"");
        mseat.setText(seat);
        String date=sharedPreferences.getString(KEY_date,"");
        mdate.setText(date);

        mbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mtext1.setText("booking done");
            }
        });

    }
}