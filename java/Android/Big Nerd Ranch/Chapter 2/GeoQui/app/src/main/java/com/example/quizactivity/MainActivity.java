package com.example.quizactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private static Button mTrueButton;
    private static Button mFalsebutton;
    private static ImageButton mNextButton;
    private static ImageButton mPreviousbutton;
    private static TextView mQuestionTextView;
    private Question [] mQuestionBank = new Question[]{
            new Question(R.string.question_oceans,true),
            new Question(R.string.question_mideast,false),
            new Question(R.string.question_africa,false),
            new Question(R.string.question_asia,true),
    };
    private int mCurrentIndex=0;

    public static Button getmTrueButton() {
        return mTrueButton;
    }

    public static void setmTrueButton(Button mTrueButton) {
        MainActivity.mTrueButton = mTrueButton;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mQuestionTextView = (TextView) findViewById(R.id.question_text_view);
        mTrueButton = (Button) findViewById(R.id.true_button);
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(true);
            }
        });


        mFalsebutton = (Button) findViewById(R.id.false_button);
        mFalsebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(false);
            }
        });
        mNextButton = (ImageButton) findViewById(R.id.next_button);
        mNextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(mCurrentIndex+1!=mQuestionBank.length){
                    mCurrentIndex = mCurrentIndex +1;
                    updateQuestion();
                }
                else {
                    Toast.makeText(MainActivity.this, R.string.eol, Toast.LENGTH_SHORT).show();
                }

            }
        });
        mPreviousbutton = (ImageButton) findViewById(R.id.previous_button);
        mPreviousbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((mCurrentIndex-1)>=0){
                    mCurrentIndex = mCurrentIndex -1;
                    updateQuestion();
                }
                else {
                    Toast.makeText(MainActivity.this, R.string.fol, Toast.LENGTH_SHORT).show();
                }
            }
        });
        updateQuestion();
    }
    private void updateQuestion(){
        int question = mQuestionBank[mCurrentIndex].getTextResId();
        mQuestionTextView.setText(question);

    }
    private void checkAnswer(boolean userPressedTrue)
    {
        boolean answerIsTrue = mQuestionBank[mCurrentIndex].isAnswerTrue();
        int messageResId=0;
        if(userPressedTrue==answerIsTrue){
            messageResId=R.string.correct_toast;}
        else{
               messageResId=R.string.incorrect_toast;
            }
           Toast.makeText(this,messageResId,Toast.LENGTH_SHORT).show();

    }
}
