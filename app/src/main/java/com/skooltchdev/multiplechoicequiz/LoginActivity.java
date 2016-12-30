package com.skooltchdev.multiplechoicequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    //DatabaseHelper helper = new DatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button mStartButton;

        mStartButton = (Button) findViewById(R.id.start_button);



        mStartButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                EditText mUserName;
                mUserName = (EditText) findViewById(R.id.username);
                String Player = mUserName.getText().toString();
                Intent i = new Intent(LoginActivity.this, QuizActivity.class);
                i.putExtra("Username", Player);
                startActivity(i);

            }

        });
    }
}
