package com.example.prepa.hackathonenergyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity {

    //List of questions and answers
    public final String[] questions = {"The amount of energy Americans use doubles every ____ years.",
            "The world's biggest blackout occurred across northeastern US and through Ontario and affected ______.",
            "The United States produces half of its electricity from ______.",
            "The United States produces more _________ energy than any other country.",
            "American _______ are some of the most energy-intense buildings on the planet.",
            "The biggest energy consumer is ______.",
            "The solar energy market has produced _________ jobs in the United States.",
            "Approximately __ of United States electricity comes from nuclear reactors.",
            "The United States uses about ___ of the world's energy but holds ___ of the world's population.",
            "A new solar device is installed in an American home every ______."};
    public final String[] A = {"5", "5 People", "Coal", "Nuclear", "Schools", "United States", "100,000", "20%", "5%, 5%", "3.2 minutes"};
    public final String[] B = {"10", "5 Million People", "Oil", "Geothermal", "Power Plants", "China", "175,000", "30%", "15%, 30%", "4.2 minutes"};
    public final String[] C = {"20", "20 Million People", "Natural Gas", "Solar", "Public Restrooms", "India", "250,000", "10%", "23%, 5%", "5.2 minutes"};
    public final String[] D = {"40", "50 Million People", "Manure", "Manure-powered", "Hospitals", "France", "325,000", "(log(52)*3.1415*100)/(3^e)%", "18%, 7%", "6.0 minutes"};
    public final char[] answerKey = {'C', 'D', 'A', 'A', 'D', 'B', 'B', 'A', 'C', 'E'};
    //initialize variables
    int position = 0;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button nextQuestion;
    TextView a1;
    TextView a2;
    TextView a3;
    TextView a4;
    TextView q;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        //initialize question and answer buttons
        q = (TextView) findViewById(R.id.Question);
        a1 = (TextView) findViewById(R.id.a1);
        a2 = (TextView) findViewById(R.id.a2);
        a3 = (TextView) findViewById(R.id.a3);
        a4 = (TextView) findViewById(R.id.a4);
        nextQuestion = (Button) findViewById(R.id.nextQ);

        //set them to first question
        q.setText(questions[position]);
        a1.setText(A[position]);
        a2.setText(B[position]);
        a3.setText(C[position]);
        a4.setText(D[position]);

        //next question button, goes to next question
        nextQuestion.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                position++;
                if(position >= q.length())
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

        //answer button 1
        b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(answerKey[position] == 'A'){
                    q.setText("CORRECT");
                }
                else{
                    q.setText("INCORRECT");
                }
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
        //answer button 2
        b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(answerKey[position] == 'B'){
                    q.setText("CORRECT");
                }
                else{
                    q.setText("INCORRECT");
                }
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
        //answer button 3
        b3 = (Button) findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(answerKey[position] == 'C'){
                    q.setText("CORRECT");
                }
                else{
                    q.setText("INCORRECT");
                }
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
        //answer button 4
        b4 = (Button) findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(answerKey[position] == 'D'){
                    q.setText("CORRECT");
                }
                else{
                    q.setText("INCORRECT");
                }
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
