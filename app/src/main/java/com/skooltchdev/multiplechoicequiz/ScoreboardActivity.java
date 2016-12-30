package com.skooltchdev.multiplechoicequiz;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ScoreboardActivity extends AppCompatActivity {
    private TextView mFinalScoreBox;
    private Button mStartAgain;
    private Button mRecordScore;
    DatabaseHelper LeaderboardDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoreboard);
        mStartAgain = (Button)findViewById(R.id.start_button);
        mRecordScore = (Button)findViewById(R.id.Record_Score);
        LeaderboardDb = new DatabaseHelper(ScoreboardActivity.this);

        Intent i = getIntent();
        int Score = i.getIntExtra("Get_Score", 0);
        String Player = i.getStringExtra("Name");
        mFinalScoreBox = (TextView) findViewById(R.id.final_score);


        mFinalScoreBox.setText(Player+ "'s Score is: " + Score);
        AddData();
        mStartAgain.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ScoreboardActivity.this, LoginActivity.class);
                startActivity(i);

            }

        });


    }

    public void AddData() {
        mRecordScore.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = getIntent();
                String Player = i.getStringExtra("Name");
                int Score = i.getIntExtra("Get_Score", 0);
                boolean isInserted = LeaderboardDb.insertData(Player, Score);
                if (isInserted =true) {
                    Toast.makeText(ScoreboardActivity.this, "Score was recorded", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(ScoreboardActivity.this, "Sth fked up", Toast.LENGTH_LONG).show();
                }

            }

        });
    }
}
