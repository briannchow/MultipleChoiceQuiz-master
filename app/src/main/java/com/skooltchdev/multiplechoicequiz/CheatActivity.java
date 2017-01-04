package com.skooltchdev.multiplechoicequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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


            }
        });

        mGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent GetQnNo = getIntent();
                mQuestionNumber = GetQnNo.getIntExtra("Question Number", 0);

                Intent i = new Intent(CheatActivity.this, QuizActivity.class);
                i.putExtra("Question No.", mAnswerWasShown);
                i.putExtra("Was Ans Shown", true);

                //startActivity(i);
                startActivity(i);


            }
        });
    }



}
