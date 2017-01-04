package com.skooltchdev.multiplechoicequiz;

import android.content.Intent;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.support.v7.app.AlertDialog;
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
    private Button mShowLeaderboard;
    DatabaseHelper LeaderboardDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoreboard);
        mStartAgain = (Button)findViewById(R.id.start_button);
        mRecordScore = (Button)findViewById(R.id.Record_Score);
        mShowLeaderboard = (Button)findViewById(R.id.ShowLeaderboard);
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
        viewAll();


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

    public void viewAll () {

        mShowLeaderboard.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Cursor res = LeaderboardDb.getAllData();
                if (res.getCount() == 0) {
                    //Show message that there are no scores at the moment
                    ShowMessage("Error", "No Scores found");
                    return;
                }
                StringBuffer buffer = new StringBuffer();
                while (res.moveToNext()) {
                    buffer.append("Id:"+ res.getString(0)+"\n");
                    buffer.append("Name:"+ res.getString(1)+"\n");
                    buffer.append("Score:"+ res.getString(2)+"\n");
                }

                ShowMessage("Data",buffer.toString());

            }

        });

    }

    public void ShowMessage(String title, String Message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }
}
