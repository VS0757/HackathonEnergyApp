package com.example.prepa.hackathonenergyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ImpactActivity extends AppCompatActivity {

    //question goals and possible answers
    public final String[] questions = {"How often do you buy new clothes?", "What is your diet?", "How do you get around?", "How often do you recycle?", "How often do you use biodegradable objects?", "What do you do with leftover food?", "Do you get involved with environmental conservation groups?", "Do you purchase energy-efficient light bulbs in your house?"};
    public final String[] A = {"I only really buy second hand clothes", "I\'m vegan", "I bike and walk as much as possible", "As much as I can", "As much as I can", "I eat all my food and I compost scraps", "I always do", "All of my light bulbs are energy-efficient"};
    public final String[] B = {"Around once a year", "I\'m vegetarian", "I use public transportation", "Sometimes", "As much as I can", "I eat my food and save leftovers for later", "Once in a while", "I sometimes purchase energy-efficient light bulbs"};
    public final String[] C = {"Around once a month", "I try to limit the meat I eat", "I try to carpool", "Very Rarely", "Very Rarely", "I eat all my food but throw away scraps", "Only when I have to", "I do not have any energy-efficient light bulbs in my home"};
    public final String[] D = {"Around once a week", "I eat meat all the time", "I usually drive alone", "Never", "Never", "I throw everything away in the trash", "Never", "I do not have any energy-efficient light bulbs in my home"};
    public final String[] goal = {"Donate some clothes to the thrift store and buy some items second hand.", "Try to incorporate substitutes for meat and dairy.", "Try to bike to closer places and carpool as much as possible.", "Designate some bins in your home as recycling bins. If you’re not sure about what is recyclable, you can always do a quick google search!", "Try to buy more biodegradable objects from the store, so you can safely dispose of them without harming the environment.", "Whenever you finish your food, make sure you don’t waste any leftovers. Eat them the next day or put any scraps in a compost bin.", "Look up local conservational efforts and join them to help contribute to your community and preserve the environment.", "If you can afford them, purchase some energy-efficient light bulbs for the next time you need to replace your lights."};
    //initialize variables
    int position = 0;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button nextGoal;
    TextView goalText;
    TextView a1;
    TextView a2;
    TextView a3;
    TextView a4;
    TextView q;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_impact);
        //intialize buttons and text to be set
        goalText = (TextView) findViewById(R.id.goal);
        q = (TextView) findViewById(R.id.Question);
        a1 = (TextView) findViewById(R.id.a1);
        a2 = (TextView) findViewById(R.id.a2);
        a3 = (TextView) findViewById(R.id.a3);
        a4 = (TextView) findViewById(R.id.a4);
        nextGoal = (Button) findViewById(R.id.nextGoal);

        //set textviews to first goal question
        q.setText(questions[position]);
        a1.setText(A[position]);
        a2.setText(B[position]);
        a3.setText(C[position]);
        a4.setText(D[position]);

        //sets text and buttons to next question if nextGoal clicked
        nextGoal.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                position++;
                if(position == q.length())
                    position = 0;
                q.setText(questions[position]);
                a1.setText(A[position]);
                a2.setText(B[position]);
                a3.setText(C[position]);
                a4.setText(D[position]);
                q.setVisibility(View.VISIBLE);
                a1.setVisibility(View.VISIBLE);
                a2.setVisibility(View.VISIBLE);
                a3.setVisibility(View.VISIBLE);
                a4.setVisibility(View.VISIBLE);
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.VISIBLE);
                b4.setVisibility(View.VISIBLE);
                goalText.setText("");
            }
        });

        //First option button (best)
        b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                position++;
                if(position == q.length())
                    position = 0;
                q.setText(questions[position]);
                a1.setText(A[position]);
                a2.setText(B[position]);
                a3.setText(C[position]);
                a4.setText(D[position]);
                q.setVisibility(View.VISIBLE);
                a1.setVisibility(View.VISIBLE);
                a2.setVisibility(View.VISIBLE);
                a3.setVisibility(View.VISIBLE);
                a4.setVisibility(View.VISIBLE);
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.VISIBLE);
                b4.setVisibility(View.VISIBLE);
            }
        });

        //Second option button (second best)
        b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goalText.setText(goal[position]);
                q.setVisibility(View.INVISIBLE);
                a1.setVisibility(View.INVISIBLE);
                a2.setVisibility(View.INVISIBLE);
                a3.setVisibility(View.INVISIBLE);
                a4.setVisibility(View.INVISIBLE);
                b1.setVisibility(View.INVISIBLE);
                b2.setVisibility(View.INVISIBLE);
                b3.setVisibility(View.INVISIBLE);
                b4.setVisibility(View.INVISIBLE);
            }
        });

        //Third option button (third best)
        b3 = (Button) findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goalText.setText(goal[position]);
                q.setVisibility(View.INVISIBLE);
                a1.setVisibility(View.INVISIBLE);
                a2.setVisibility(View.INVISIBLE);
                a3.setVisibility(View.INVISIBLE);
                a4.setVisibility(View.INVISIBLE);
                b1.setVisibility(View.INVISIBLE);
                b2.setVisibility(View.INVISIBLE);
                b3.setVisibility(View.INVISIBLE);
                b4.setVisibility(View.INVISIBLE);
            }
        });

        //Fourth option button (worst)
        b4 = (Button) findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goalText.setText(goal[position]);
                q.setVisibility(View.INVISIBLE);
                a1.setVisibility(View.INVISIBLE);
                a2.setVisibility(View.INVISIBLE);
                a3.setVisibility(View.INVISIBLE);
                a4.setVisibility(View.INVISIBLE);
                b1.setVisibility(View.INVISIBLE);
                b2.setVisibility(View.INVISIBLE);
                b3.setVisibility(View.INVISIBLE);
                b4.setVisibility(View.INVISIBLE);
            }
        });
    }
}