package com.example.prepa.hackathonenergyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    TextView T3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);


        T3 = (TextView) findViewById(R.id.T3);
        TextView T3 = (TextView) findViewById(R.id.T3);
        T3.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
