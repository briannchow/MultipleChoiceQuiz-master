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
    private TextView mAnswerDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);
        mShowAnswer = (Button) findViewById(R.id.show_answer_button);
        mAnswerDisplay = (TextView) findViewById(R.id.answer_text_view);
        Intent i = getIntent();
        final String QuestionAnswer = i.getStringExtra("show_answer");

        mShowAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mAnswerDisplay.setText(QuestionAnswer);
            }
        });
    }
}
