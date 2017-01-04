package com.skooltchdev.multiplechoicequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuestionChooserActivity extends AppCompatActivity {

    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;
    private Button mButtonChoice5;
    private Button mButtonChoice6;
    private Button mButtonChoice7;
    private Button mButtonChoice8;
    private Button mButtonChoice9;
    private Button mButtonChoice10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_chooser);

        mButtonChoice1 = (Button)findViewById(R.id.button2);
        mButtonChoice2 = (Button)findViewById(R.id.button3);
        mButtonChoice3 = (Button)findViewById(R.id.button4);
        mButtonChoice4 = (Button)findViewById(R.id.button5);
        mButtonChoice5 = (Button)findViewById(R.id.button6);
        mButtonChoice6 = (Button)findViewById(R.id.button7);
        mButtonChoice7 = (Button)findViewById(R.id.button8);
        mButtonChoice8 = (Button)findViewById(R.id.button9);
        mButtonChoice9 = (Button)findViewById(R.id.button10);
        mButtonChoice10 = (Button)findViewById(R.id.button11);

        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QuestionChooserActivity.this, QuizActivity.class);
                i.putExtra("Question No.", 0);
                //startActivity(i);
                startActivity(i);

            }
        });

        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QuestionChooserActivity.this, QuizActivity.class);
                i.putExtra("Question No.", 1);
                //startActivity(i);
                startActivity(i);

            }
        });

        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QuestionChooserActivity.this, QuizActivity.class);
                i.putExtra("Question No.", 2);
                //startActivity(i);
                startActivity(i);

            }
        });

        mButtonChoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QuestionChooserActivity.this, QuizActivity.class);
                i.putExtra("Question No.", 3);
                //startActivity(i);
                startActivity(i);

            }
        });

        mButtonChoice5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QuestionChooserActivity.this, QuizActivity.class);
                i.putExtra("Question No.", 4);
                //startActivity(i);
                startActivity(i);

            }
        });

        mButtonChoice6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QuestionChooserActivity.this, QuizActivity.class);
                i.putExtra("Question No.", 5);
                //startActivity(i);
                startActivity(i);

            }
        });

        mButtonChoice7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QuestionChooserActivity.this, QuizActivity.class);
                i.putExtra("Question No.", 6);
                //startActivity(i);
                startActivity(i);

            }
        });

        mButtonChoice8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QuestionChooserActivity.this, QuizActivity.class);
                i.putExtra("Question No.", 7);
                //startActivity(i);
                startActivity(i);

            }
        });

        mButtonChoice9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QuestionChooserActivity.this, QuizActivity.class);
                i.putExtra("Question No.", 8);
                //startActivity(i);
                startActivity(i);

            }
        });

        mButtonChoice10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QuestionChooserActivity.this, QuizActivity.class);
                i.putExtra("Question No.", 9);
                //startActivity(i);
                startActivity(i);

            }
        });

    }
}
