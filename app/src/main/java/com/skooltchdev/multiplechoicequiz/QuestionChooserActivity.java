package com.skooltchdev.multiplechoicequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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
    private TextView mPlayerScore;
    private TextView mScoreView;
    private int mScore = 0;


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
        mPlayerScore = (TextView) findViewById(R.id.score_text);
        mScoreView = (TextView)findViewById(R.id.score);
        mScore = getIntent().getIntExtra("Score", 0);
        String Player = getIntent().getStringExtra("Username");
        mPlayerScore.setText(Player + "'s " +"Score:");
        mScoreView.setText(" " + mScore);


        //Try using the count of the number of times the button gets clicked and send it via intent to QuizActivity then send it back to disable the button

        Boolean AttemptedQn1 = getIntent().getBooleanExtra("Qn1", false);
        Boolean AttemptedQn2 = getIntent().getBooleanExtra("Qn2", false);
        Boolean AttemptedQn3 = getIntent().getBooleanExtra("Qn3", false);
        Boolean AttemptedQn4 = getIntent().getBooleanExtra("Qn4", false);
        Boolean AttemptedQn5 = getIntent().getBooleanExtra("Qn5", false);
        Boolean AttemptedQn6 = getIntent().getBooleanExtra("Qn6", false);
        Boolean AttemptedQn7 = getIntent().getBooleanExtra("Qn7", false);
        Boolean AttemptedQn8 = getIntent().getBooleanExtra("Qn8", false);
        Boolean AttemptedQn9 = getIntent().getBooleanExtra("Qn9", false);
        Boolean AttemptedQn10 = getIntent().getBooleanExtra("Qn10", false);

        if (AttemptedQn1 == true) {
            mButtonChoice1.setEnabled(false);
        }
        if(AttemptedQn2 == true) {
            mButtonChoice2.setEnabled(false);
        }
        if(AttemptedQn3 == true) {
            mButtonChoice3.setEnabled(false);
        }
        if(AttemptedQn4 == true) {
            mButtonChoice4.setEnabled(false);
        }
        if(AttemptedQn5 == true) {
            mButtonChoice5.setEnabled(false);
        }
        if(AttemptedQn6 == true) {
            mButtonChoice6.setEnabled(false);
        }
        if(AttemptedQn7 == true) {
            mButtonChoice7.setEnabled(false);
        }
        if(AttemptedQn8 == true) {
            mButtonChoice8.setEnabled(false);
        }
        if(AttemptedQn9 == true) {
            mButtonChoice9.setEnabled(false);
        }
        if(AttemptedQn10 == true) {
            mButtonChoice10.setEnabled(false);
        }

        if(AttemptedQn1 == true && AttemptedQn2 == true && AttemptedQn3 == true && AttemptedQn4 == true && AttemptedQn5 == true && AttemptedQn6 == true && AttemptedQn7 == true && AttemptedQn8 == true && AttemptedQn9 == true && AttemptedQn10 == true) {
            Intent i = new Intent(QuestionChooserActivity.this, ScoreboardActivity.class);
            i.putExtra("Get_Score", mScore);
            i.putExtra("Name", Player);
            startActivity(i);
        }
        //Try exec the intent for scoreboard after all boolean values have been fuffiled!
        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Player = getIntent().getStringExtra("Username");
                int mScore = getIntent().getIntExtra("Score", 0);
                Intent i = new Intent(QuestionChooserActivity.this, QuizActivity.class);
                i.putExtra("Question No.", 0);
                i.putExtra("Username", Player);
                i.putExtra("Score", mScore);
                //Boolean AttemptedQn1 = getIntent().getBooleanExtra("Qn1", false);
                Boolean AttemptedQn2 = getIntent().getBooleanExtra("Qn2", false);
                Boolean AttemptedQn3 = getIntent().getBooleanExtra("Qn3", false);
                Boolean AttemptedQn4 = getIntent().getBooleanExtra("Qn4", false);
                Boolean AttemptedQn5 = getIntent().getBooleanExtra("Qn5", false);
                Boolean AttemptedQn6 = getIntent().getBooleanExtra("Qn6", false);
                Boolean AttemptedQn7 = getIntent().getBooleanExtra("Qn7", false);
                Boolean AttemptedQn8 = getIntent().getBooleanExtra("Qn8", false);
                Boolean AttemptedQn9 = getIntent().getBooleanExtra("Qn9", false);
                Boolean AttemptedQn10 = getIntent().getBooleanExtra("Qn10", false);

                i.putExtra("Qn1", true);
                i.putExtra("Qn2", AttemptedQn2);
                i.putExtra("Qn3", AttemptedQn3);
                i.putExtra("Qn4", AttemptedQn4);
                i.putExtra("Qn5", AttemptedQn5);
                i.putExtra("Qn6", AttemptedQn6);
                i.putExtra("Qn7", AttemptedQn7);
                i.putExtra("Qn8", AttemptedQn8);
                i.putExtra("Qn9", AttemptedQn9);
                i.putExtra("Qn10", AttemptedQn10);

                //Boolean AttemptedQn1 = true;

                //startActivity(i);
                startActivity(i);

            }
        });

        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Player = getIntent().getStringExtra("Username");
                int mScore = getIntent().getIntExtra("Score", 0);
                Intent i = new Intent(QuestionChooserActivity.this, QuizActivity.class);
                i.putExtra("Question No.", 1);
                i.putExtra("Username", Player);
                i.putExtra("Score", mScore);
                Boolean AttemptedQn1 = getIntent().getBooleanExtra("Qn1", false);
                //Boolean AttemptedQn2 = getIntent().getBooleanExtra("Qn2", false);
                Boolean AttemptedQn3 = getIntent().getBooleanExtra("Qn3", false);
                Boolean AttemptedQn4 = getIntent().getBooleanExtra("Qn4", false);
                Boolean AttemptedQn5 = getIntent().getBooleanExtra("Qn5", false);
                Boolean AttemptedQn6 = getIntent().getBooleanExtra("Qn6", false);
                Boolean AttemptedQn7 = getIntent().getBooleanExtra("Qn7", false);
                Boolean AttemptedQn8 = getIntent().getBooleanExtra("Qn8", false);
                Boolean AttemptedQn9 = getIntent().getBooleanExtra("Qn9", false);
                Boolean AttemptedQn10 = getIntent().getBooleanExtra("Qn10", false);

                i.putExtra("Qn1", AttemptedQn1);
                i.putExtra("Qn2", true);
                i.putExtra("Qn3", AttemptedQn3);
                i.putExtra("Qn4", AttemptedQn4);
                i.putExtra("Qn5", AttemptedQn5);
                i.putExtra("Qn6", AttemptedQn6);
                i.putExtra("Qn7", AttemptedQn7);
                i.putExtra("Qn8", AttemptedQn8);
                i.putExtra("Qn9", AttemptedQn9);
                i.putExtra("Qn10", AttemptedQn10);
                //Boolean AttemptedQn2 = getIntent().getBooleanExtra("Qn2", false);
                //startActivity(i);
                startActivity(i);

            }
        });

        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Player = getIntent().getStringExtra("Username");
                int mScore = getIntent().getIntExtra("Score", 0);
                Intent i = new Intent(QuestionChooserActivity.this, QuizActivity.class);
                i.putExtra("Question No.", 2);
                i.putExtra("Username", Player);
                i.putExtra("Score", mScore);
                Boolean AttemptedQn1 = getIntent().getBooleanExtra("Qn1", false);
                Boolean AttemptedQn2 = getIntent().getBooleanExtra("Qn2", false);
                //Boolean AttemptedQn3 = getIntent().getBooleanExtra("Qn3", false);
                Boolean AttemptedQn4 = getIntent().getBooleanExtra("Qn4", false);
                Boolean AttemptedQn5 = getIntent().getBooleanExtra("Qn5", false);
                Boolean AttemptedQn6 = getIntent().getBooleanExtra("Qn6", false);
                Boolean AttemptedQn7 = getIntent().getBooleanExtra("Qn7", false);
                Boolean AttemptedQn8 = getIntent().getBooleanExtra("Qn8", false);
                Boolean AttemptedQn9 = getIntent().getBooleanExtra("Qn9", false);
                Boolean AttemptedQn10 = getIntent().getBooleanExtra("Qn10", false);

                i.putExtra("Qn1", AttemptedQn1);
                i.putExtra("Qn2", AttemptedQn2);
                i.putExtra("Qn3", true);
                i.putExtra("Qn4", AttemptedQn4);
                i.putExtra("Qn5", AttemptedQn5);
                i.putExtra("Qn6", AttemptedQn6);
                i.putExtra("Qn7", AttemptedQn7);
                i.putExtra("Qn8", AttemptedQn8);
                i.putExtra("Qn9", AttemptedQn9);
                i.putExtra("Qn10", AttemptedQn10);
                //Boolean AttemptedQn3 = getIntent().getBooleanExtra("Qn3", false);
                i.putExtra("Qn3", true);
                //startActivity(i);
                startActivity(i);

            }
        });

        mButtonChoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Player = getIntent().getStringExtra("Username");
                int mScore = getIntent().getIntExtra("Score", 0);
                Intent i = new Intent(QuestionChooserActivity.this, QuizActivity.class);
                i.putExtra("Question No.", 3);
                i.putExtra("Username", Player);
                i.putExtra("Score", mScore);
                Boolean AttemptedQn1 = getIntent().getBooleanExtra("Qn1", false);
                Boolean AttemptedQn2 = getIntent().getBooleanExtra("Qn2", false);
                Boolean AttemptedQn3 = getIntent().getBooleanExtra("Qn3", false);
                //Boolean AttemptedQn4 = getIntent().getBooleanExtra("Qn4", false);
                Boolean AttemptedQn5 = getIntent().getBooleanExtra("Qn5", false);
                Boolean AttemptedQn6 = getIntent().getBooleanExtra("Qn6", false);
                Boolean AttemptedQn7 = getIntent().getBooleanExtra("Qn7", false);
                Boolean AttemptedQn8 = getIntent().getBooleanExtra("Qn8", false);
                Boolean AttemptedQn9 = getIntent().getBooleanExtra("Qn9", false);
                Boolean AttemptedQn10 = getIntent().getBooleanExtra("Qn10", false);

                i.putExtra("Qn1", AttemptedQn1);
                i.putExtra("Qn2", AttemptedQn2);
                i.putExtra("Qn3", AttemptedQn3);
                i.putExtra("Qn4", true);
                i.putExtra("Qn5", AttemptedQn5);
                i.putExtra("Qn6", AttemptedQn6);
                i.putExtra("Qn7", AttemptedQn7);
                i.putExtra("Qn8", AttemptedQn8);
                i.putExtra("Qn9", AttemptedQn9);
                i.putExtra("Qn10", AttemptedQn10);
                //startActivity(i);
                startActivity(i);

            }
        });

        mButtonChoice5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Player = getIntent().getStringExtra("Username");
                int mScore = getIntent().getIntExtra("Score", 0);
                Intent i = new Intent(QuestionChooserActivity.this, QuizActivity.class);
                i.putExtra("Question No.", 4);
                i.putExtra("Username", Player);
                i.putExtra("Score", mScore);
                Boolean AttemptedQn1 = getIntent().getBooleanExtra("Qn1", false);
                Boolean AttemptedQn2 = getIntent().getBooleanExtra("Qn2", false);
                Boolean AttemptedQn3 = getIntent().getBooleanExtra("Qn3", false);
                Boolean AttemptedQn4 = getIntent().getBooleanExtra("Qn4", false);
                //Boolean AttemptedQn5 = getIntent().getBooleanExtra("Qn5", false);
                Boolean AttemptedQn6 = getIntent().getBooleanExtra("Qn6", false);
                Boolean AttemptedQn7 = getIntent().getBooleanExtra("Qn7", false);
                Boolean AttemptedQn8 = getIntent().getBooleanExtra("Qn8", false);
                Boolean AttemptedQn9 = getIntent().getBooleanExtra("Qn9", false);
                Boolean AttemptedQn10 = getIntent().getBooleanExtra("Qn10", false);

                i.putExtra("Qn1", AttemptedQn1);
                i.putExtra("Qn2", AttemptedQn2);
                i.putExtra("Qn3", AttemptedQn3);
                i.putExtra("Qn4", AttemptedQn4);
                i.putExtra("Qn5", true);
                i.putExtra("Qn6", AttemptedQn6);
                i.putExtra("Qn7", AttemptedQn7);
                i.putExtra("Qn8", AttemptedQn8);
                i.putExtra("Qn9", AttemptedQn9);
                i.putExtra("Qn10", AttemptedQn10);
                //startActivity(i);
                startActivity(i);

            }
        });

        mButtonChoice6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Player = getIntent().getStringExtra("Username");
                int mScore = getIntent().getIntExtra("Score", 0);
                Intent i = new Intent(QuestionChooserActivity.this, QuizActivity.class);
                i.putExtra("Question No.", 5);
                i.putExtra("Username", Player);
                i.putExtra("Score", mScore);
                Boolean AttemptedQn1 = getIntent().getBooleanExtra("Qn1", false);
                Boolean AttemptedQn2 = getIntent().getBooleanExtra("Qn2", false);
                Boolean AttemptedQn3 = getIntent().getBooleanExtra("Qn3", false);
                Boolean AttemptedQn4 = getIntent().getBooleanExtra("Qn4", false);
                Boolean AttemptedQn5 = getIntent().getBooleanExtra("Qn5", false);
                //Boolean AttemptedQn6 = getIntent().getBooleanExtra("Qn6", false);
                Boolean AttemptedQn7 = getIntent().getBooleanExtra("Qn7", false);
                Boolean AttemptedQn8 = getIntent().getBooleanExtra("Qn8", false);
                Boolean AttemptedQn9 = getIntent().getBooleanExtra("Qn9", false);
                Boolean AttemptedQn10 = getIntent().getBooleanExtra("Qn10", false);

                i.putExtra("Qn1", AttemptedQn1);
                i.putExtra("Qn2", AttemptedQn2);
                i.putExtra("Qn3", AttemptedQn3);
                i.putExtra("Qn4", AttemptedQn4);
                i.putExtra("Qn5", AttemptedQn5);
                i.putExtra("Qn6", true);
                i.putExtra("Qn7", AttemptedQn7);
                i.putExtra("Qn8", AttemptedQn8);
                i.putExtra("Qn9", AttemptedQn9);
                i.putExtra("Qn10", AttemptedQn10);
                //startActivity(i);
                startActivity(i);

            }
        });

        mButtonChoice7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Player = getIntent().getStringExtra("Username");
                int mScore = getIntent().getIntExtra("Score", 0);
                Intent i = new Intent(QuestionChooserActivity.this, QuizActivity.class);
                i.putExtra("Question No.", 6);
                i.putExtra("Username", Player);
                i.putExtra("Score", mScore);
                Boolean AttemptedQn1 = getIntent().getBooleanExtra("Qn1", false);
                Boolean AttemptedQn2 = getIntent().getBooleanExtra("Qn2", false);
                Boolean AttemptedQn3 = getIntent().getBooleanExtra("Qn3", false);
                Boolean AttemptedQn4 = getIntent().getBooleanExtra("Qn4", false);
                Boolean AttemptedQn5 = getIntent().getBooleanExtra("Qn5", false);
                Boolean AttemptedQn6 = getIntent().getBooleanExtra("Qn6", false);
                //Boolean AttemptedQn7 = getIntent().getBooleanExtra("Qn7", false);
                Boolean AttemptedQn8 = getIntent().getBooleanExtra("Qn8", false);
                Boolean AttemptedQn9 = getIntent().getBooleanExtra("Qn9", false);
                Boolean AttemptedQn10 = getIntent().getBooleanExtra("Qn10", false);

                i.putExtra("Qn1", AttemptedQn1);
                i.putExtra("Qn2", AttemptedQn2);
                i.putExtra("Qn3", AttemptedQn3);
                i.putExtra("Qn4", AttemptedQn4);
                i.putExtra("Qn5", AttemptedQn5);
                i.putExtra("Qn6", AttemptedQn6);
                i.putExtra("Qn7", true);
                i.putExtra("Qn8", AttemptedQn8);
                i.putExtra("Qn9", AttemptedQn9);
                i.putExtra("Qn10", AttemptedQn10);
                //startActivity(i);
                startActivity(i);

            }
        });

        mButtonChoice8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Player = getIntent().getStringExtra("Username");
                int mScore = getIntent().getIntExtra("Score", 0);
                Intent i = new Intent(QuestionChooserActivity.this, QuizActivity.class);
                i.putExtra("Question No.", 7);
                i.putExtra("Username", Player);
                i.putExtra("Score", mScore);
                Boolean AttemptedQn1 = getIntent().getBooleanExtra("Qn1", false);
                Boolean AttemptedQn2 = getIntent().getBooleanExtra("Qn2", false);
                Boolean AttemptedQn3 = getIntent().getBooleanExtra("Qn3", false);
                Boolean AttemptedQn4 = getIntent().getBooleanExtra("Qn4", false);
                Boolean AttemptedQn5 = getIntent().getBooleanExtra("Qn5", false);
                Boolean AttemptedQn6 = getIntent().getBooleanExtra("Qn6", false);
                Boolean AttemptedQn7 = getIntent().getBooleanExtra("Qn7", false);
                //Boolean AttemptedQn8 = getIntent().getBooleanExtra("Qn8", false);
                Boolean AttemptedQn9 = getIntent().getBooleanExtra("Qn9", false);
                Boolean AttemptedQn10 = getIntent().getBooleanExtra("Qn10", false);

                i.putExtra("Qn1", AttemptedQn1);
                i.putExtra("Qn2", AttemptedQn2);
                i.putExtra("Qn3", AttemptedQn3);
                i.putExtra("Qn4", AttemptedQn4);
                i.putExtra("Qn5", AttemptedQn5);
                i.putExtra("Qn6", AttemptedQn6);
                i.putExtra("Qn7", AttemptedQn7);
                i.putExtra("Qn8", true);
                i.putExtra("Qn9", AttemptedQn9);
                i.putExtra("Qn10", AttemptedQn10);
                //startActivity(i);
                startActivity(i);

            }
        });

        mButtonChoice9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Player = getIntent().getStringExtra("Username");
                int mScore = getIntent().getIntExtra("Score", 0);
                Intent i = new Intent(QuestionChooserActivity.this, QuizActivity.class);
                i.putExtra("Question No.", 8);
                i.putExtra("Username", Player);
                i.putExtra("Score", mScore);
                Boolean AttemptedQn1 = getIntent().getBooleanExtra("Qn1", false);
                Boolean AttemptedQn2 = getIntent().getBooleanExtra("Qn2", false);
                Boolean AttemptedQn3 = getIntent().getBooleanExtra("Qn3", false);
                Boolean AttemptedQn4 = getIntent().getBooleanExtra("Qn4", false);
                Boolean AttemptedQn5 = getIntent().getBooleanExtra("Qn5", false);
                Boolean AttemptedQn6 = getIntent().getBooleanExtra("Qn6", false);
                Boolean AttemptedQn7 = getIntent().getBooleanExtra("Qn7", false);
                Boolean AttemptedQn8 = getIntent().getBooleanExtra("Qn8", false);
                //Boolean AttemptedQn9 = getIntent().getBooleanExtra("Qn9", false);
                Boolean AttemptedQn10 = getIntent().getBooleanExtra("Qn10", false);

                i.putExtra("Qn1", AttemptedQn1);
                i.putExtra("Qn2", AttemptedQn2);
                i.putExtra("Qn3", AttemptedQn3);
                i.putExtra("Qn4", AttemptedQn4);
                i.putExtra("Qn5", AttemptedQn5);
                i.putExtra("Qn6", AttemptedQn6);
                i.putExtra("Qn7", AttemptedQn7);
                i.putExtra("Qn8", AttemptedQn8);
                i.putExtra("Qn9", true);
                i.putExtra("Qn10", AttemptedQn10);
                //startActivity(i);
                startActivity(i);

            }
        });

        mButtonChoice10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Player = getIntent().getStringExtra("Username");
                int mScore = getIntent().getIntExtra("Score", 0);
                Intent i = new Intent(QuestionChooserActivity.this, QuizActivity.class);
                i.putExtra("Question No.", 9);
                i.putExtra("Username", Player);
                i.putExtra("Score", mScore);
                Boolean AttemptedQn1 = getIntent().getBooleanExtra("Qn1", false);
                Boolean AttemptedQn2 = getIntent().getBooleanExtra("Qn2", false);
                Boolean AttemptedQn3 = getIntent().getBooleanExtra("Qn3", false);
                Boolean AttemptedQn4 = getIntent().getBooleanExtra("Qn4", false);
                Boolean AttemptedQn5 = getIntent().getBooleanExtra("Qn5", false);
                Boolean AttemptedQn6 = getIntent().getBooleanExtra("Qn6", false);
                Boolean AttemptedQn7 = getIntent().getBooleanExtra("Qn7", false);
                Boolean AttemptedQn8 = getIntent().getBooleanExtra("Qn8", false);
                Boolean AttemptedQn9 = getIntent().getBooleanExtra("Qn9", false);
                //Boolean AttemptedQn10 = getIntent().getBooleanExtra("Qn10", false);

                i.putExtra("Qn1", AttemptedQn1);
                i.putExtra("Qn2", AttemptedQn2);
                i.putExtra("Qn3", AttemptedQn3);
                i.putExtra("Qn4", AttemptedQn4);
                i.putExtra("Qn5", AttemptedQn5);
                i.putExtra("Qn6", AttemptedQn6);
                i.putExtra("Qn7", AttemptedQn7);
                i.putExtra("Qn8", AttemptedQn8);
                i.putExtra("Qn9", AttemptedQn9);
                i.putExtra("Qn10", true);
                //startActivity(i);
                startActivity(i);

            }
        });

    }

}
