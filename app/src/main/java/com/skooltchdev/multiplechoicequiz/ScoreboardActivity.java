package com.skooltchdev.multiplechoicequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ScoreboardActivity extends AppCompatActivity {
    private TextView mFinalScoreBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoreboard);
        Intent i = getIntent();
        int Total_Score = i.getIntExtra("Get_Score", 0);
        String Player_Name = i.getStringExtra("Name");
        mFinalScoreBox = (TextView) findViewById(R.id.final_score);
        mFinalScoreBox.setText(Player_Name+ "'s Score is: " + Total_Score);


    }
}
