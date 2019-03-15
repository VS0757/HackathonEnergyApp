package com.example.prepa.hackathonenergyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Other activities to be selected
    Button quiz;
    Button info;
    Button impact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //go to trivia quiz
        quiz = (Button) findViewById(R.id.quiz);

        quiz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, QuizActivity.class));
            }
        });

        //go to user's impact
        impact = (Button) findViewById(R.id.impact);

        impact.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ImpactActivity.class));
            }
        });

        //go to general info page
        info = (Button) findViewById(R.id.info);
        info.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, InfoActivity.class));
            }
        });
    }
}
