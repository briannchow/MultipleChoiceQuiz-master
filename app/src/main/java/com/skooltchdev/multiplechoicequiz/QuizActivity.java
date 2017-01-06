package com.skooltchdev.multiplechoicequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.ScheduledThreadPoolExecutor;

public class QuizActivity extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;
    private Button mButtonCheat;
    private ImageView mMoviePoster;
    private TextView mPlayerScore;
    private String mAnswer;
    private int mScore = 0;
    private int mNewScore = 0;
    private int mQuestionNumber;
    public final static String EXTRA_QUIZ_SCORE = "com.example.MultipleChoiceQuiz-master.SCORE";
    private boolean mIsCheater;
    Boolean AttemptedQn1;
    Boolean AttemptedQn2;
    Boolean AttemptedQn3;
    Boolean AttemptedQn4;
    Boolean AttemptedQn5;
    Boolean AttemptedQn6;
    Boolean AttemptedQn7;
    Boolean AttemptedQn8;
    Boolean AttemptedQn9;
    Boolean AttemptedQn10;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mScoreView = (TextView)findViewById(R.id.score);
        mQuestionView = (TextView)findViewById(R.id.question);
        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);
        mButtonChoice4 = (Button)findViewById(R.id.choice4);
        mButtonCheat =(Button)findViewById(R.id.cheat);
        mMoviePoster = (ImageView) findViewById(R.id.Poster1);
        mPlayerScore = (TextView) findViewById(R.id.score_text);
        Intent GetQnNo = getIntent();
        mQuestionNumber = GetQnNo.getIntExtra("Question No.", 0);
        mScore = GetQnNo.getIntExtra("Score", 0);
        mIsCheater = false;




        Intent GetCheaterStatus = getIntent();
        mIsCheater = GetCheaterStatus.getBooleanExtra("Was Ans Shown", false);


        updateScore(mScore);
        updateQuestion();



        //Start of Button Listener for Button1
        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice1.getText() == mAnswer && mIsCheater == false){
                    mNewScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                //This line of code is optiona
                    Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();
                    BackToQnChooser(mNewScore);

                }else if (mButtonChoice1.getText() == mAnswer && mIsCheater == true){
                    Toast.makeText(QuizActivity.this, "Using a cheat won't increase your score", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                    BackToQnChooser(mScore);
                } else {
                    Toast.makeText(QuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                    BackToQnChooser(mScore);
                }
            }
        });

        //End of Button Listener for Button1

        //Start of Button Listener for Button2
        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice2.getText() == mAnswer && mIsCheater == false){
                    mNewScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    //This line of code is optiona
                    Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();
                    BackToQnChooser(mNewScore);

                }else if (mButtonChoice2.getText() == mAnswer && mIsCheater == true){
                    Toast.makeText(QuizActivity.this, "Using a cheat won't increase your score", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                    BackToQnChooser(mScore);
                } else {
                    Toast.makeText(QuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                    BackToQnChooser(mScore);
                }
            }
        });

        //End of Button Listener for Button2


        //Start of Button Listener for Button3
        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice3.getText() == mAnswer && mIsCheater == false){
                    mNewScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    BackToQnChooser(mNewScore);
                    //This line of code is optiona
                    Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();

                }else if (mButtonChoice3.getText() == mAnswer && mIsCheater == true){
                    Toast.makeText(QuizActivity.this, "Using a cheat won't increase your score", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                    BackToQnChooser(mScore);
                } else {
                    Toast.makeText(QuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                    BackToQnChooser(mScore);
                }
            }
        });

        mButtonChoice4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice4.getText() == mAnswer && mIsCheater == false){
                    mNewScore = mScore + 1;
                    updateScore(mNewScore);
                    updateQuestion();
                    //This line of code is optiona
                    Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();
                    BackToQnChooser(mNewScore);

                }else if (mButtonChoice4.getText() == mAnswer && mIsCheater == true){
                    Toast.makeText(QuizActivity.this, "Using a cheat won't increase your score", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                    BackToQnChooser(mScore);
                } else {
                    Toast.makeText(QuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                    BackToQnChooser(mScore);
                }
            }
        });

        //End of Button Listener for Button3
        mButtonCheat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(QuizActivity.this, CheatActivity.class);
                String Player = getIntent().getStringExtra("Username");
                i2.putExtra("show_answer", mAnswer);
                i2.putExtra("Question Number", mQuestionNumber);
                i2.putExtra("Username", Player);
                i2.putExtra("Score", mScore);
                //startActivity(i);
                startActivity(i2);

            }
        });






    }

    private void updateQuestion(){
        String Player = getIntent().getStringExtra("Username");
        if(Player == "Xu Jia Wei" || Player == "Jia Wei") {
            Player = "Donkey Teeth";
        }




        if (mQuestionNumber <= mQuestionLibrary.getNumOfQuestions()) {
            mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
            mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
            mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
            mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
            mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
            mButtonChoice4.setText(mQuestionLibrary.getChoice4(mQuestionNumber));
            mPlayerScore.setText(Player + "'s " +"Score:");

            //mMoviePoster.setImageResource(R.drawable.titanic_2_2d_pack_shot1);

        } else {
            // call for score board
            Intent i = new Intent(QuizActivity.this, ScoreboardActivity.class);
            i.putExtra("Get_Score", mScore);
            i.putExtra("Name", Player);
            startActivity(i);
        }
    }


    private void updateScore(int point) {
        mScoreView.setText("" + point);
    }

    private void BackToQnChooser(int mScore) {
        Intent BackToQnChooser = new Intent(QuizActivity.this, QuestionChooserActivity.class);
        BackToQnChooser.putExtra("Username", getIntent().getStringExtra("Username"));
        BackToQnChooser.putExtra("Score", mScore);
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

        BackToQnChooser.putExtra("Qn1",AttemptedQn1);
        BackToQnChooser.putExtra("Qn2", AttemptedQn2);
        BackToQnChooser.putExtra("Qn3", AttemptedQn3);
        BackToQnChooser.putExtra("Qn4", AttemptedQn4);
        BackToQnChooser.putExtra("Qn5", AttemptedQn5);
        BackToQnChooser.putExtra("Qn6", AttemptedQn6);
        BackToQnChooser.putExtra("Qn7", AttemptedQn7);
        BackToQnChooser.putExtra("Qn8", AttemptedQn8);
        BackToQnChooser.putExtra("Qn9", AttemptedQn9);
        BackToQnChooser.putExtra("Qn10", AttemptedQn10);



        startActivity(BackToQnChooser);
    }
}
