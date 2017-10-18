package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    Button mAnswerTop;
    Button mAnswerBottom;
    TextView mTextViewQuestions;

    int mChoise=1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("Index:", String.valueOf(mChoise));

        mAnswerTop = (Button) findViewById(R.id.buttonTop);
        mAnswerBottom = (Button) findViewById(R.id.buttonBottom);
        mTextViewQuestions = (TextView) findViewById(R.id.storyTextView);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mAnswerTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(mChoise==1||mChoise==2){
                mTextViewQuestions.setText(R.string.T3_Story);
                mAnswerTop.setText(R.string.T3_Ans1);
                mAnswerBottom.setText(R.string.T3_Ans2);
                mChoise = 3;
            }
            else {
                mTextViewQuestions.setText(R.string.T6_End);
                buttonVisibility();
                mChoise = 6;

            }
                Log.i("Index:", String.valueOf(mChoise));
            }

        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mAnswerBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mChoise==1) {
                    mTextViewQuestions.setText(R.string.T2_Story);
                    mAnswerTop.setText(R.string.T2_Ans1);
                    mAnswerBottom.setText(R.string.T2_Ans2);
                    mChoise = 3;
                }
              else if(mChoise==2){
                    mTextViewQuestions.setText(R.string.T4_End);
                    buttonVisibility();
                    mChoise = 4;



                }
                else {
                    mTextViewQuestions.setText(R.string.T5_End);
                    buttonVisibility();
                    mChoise = 5;

                }
                Log.i("Index:", String.valueOf(mChoise));//consolde mchoise ın kaç olduğun gösterir
            }
        });

    }

 @Override
public void onSaveInstanceState(Bundle outState){
    super.onSaveInstanceState(outState);
    mTextViewQuestions.setText(R.string.T1_Story);
    mAnswerTop.setText(R.string.T1_Ans1);
    mAnswerBottom.setText(R.string.T1_Ans2);
    mChoise = 1;

}
public void buttonVisibility(){
    mAnswerTop.setVisibility(View.INVISIBLE);
    mAnswerBottom.setVisibility(View.INVISIBLE);
}



}
