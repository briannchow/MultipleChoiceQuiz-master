package com.skooltchdev.multiplechoicequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class CheatActivity extends AppCompatActivity {
    private Button mShowAnswer;
    private Button mGoBack;
    private int mQuestionNumber;
    private boolean mAnswerWasShown;
    private TextView mAnswerDisplay;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);
        mShowAnswer = (Button) findViewById(R.id.show_answer_button);
        mGoBack = (Button) findViewById(R.id.go_back);
        mAnswerDisplay = (TextView) findViewById(R.id.answer_text_view);
        Intent i = getIntent();
        final String QuestionAnswer = i.getStringExtra("show_answer");
        mAnswerWasShown = false;

        mShowAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mAnswerDisplay.setText(QuestionAnswer);
                mAnswerWasShown = true;
                Toast.makeText(CheatActivity.this, "Cheating is wrong", Toast.LENGTH_SHORT).show();


            }
        });

        mGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent GetQnNo = getIntent();
                mQuestionNumber = GetQnNo.getIntExtra("Question Number", 0);
                String Player = getIntent().getStringExtra("Username");
                int Score = getIntent().getIntExtra("Score", 0);

                Intent i = new Intent(CheatActivity.this, QuizActivity.class);
                i.putExtra("Question No.", mQuestionNumber);
                i.putExtra("Was Ans Shown", true);
                i.putExtra("Username", Player);
                i.putExtra("Score", Score);
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
                i.putExtra("Qn1",AttemptedQn1);
                i.putExtra("Qn2", AttemptedQn2);
                i.putExtra("Qn3", AttemptedQn3);
                i.putExtra("Qn4", AttemptedQn4);
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
    }



}
