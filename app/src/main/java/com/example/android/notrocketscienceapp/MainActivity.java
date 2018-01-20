package com.example.android.notrocketscienceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button answer1, answer2, next;

    TextView question_number, question_content;

    ImageView image_content;

    private Questions mQuestions = new Questions();

    private String mAnswer;
    int Score = 0;
    private int mQuestionsLenght = mQuestions.mQuestions.length;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();

        answer1 = (Button) findViewById(R.id.ans1);
        answer2 = (Button) findViewById(R.id.ans2);
        next = (Button) findViewById(R.id.button_next);

        question_number = (TextView) findViewById(R.id.num_1);
        question_content = (TextView) findViewById(R.id.cont_1);
        image_content = (ImageView) findViewById(R.id.imageView);

        updateQuestion(r.nextInt(mQuestionsLenght));

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer1.getText() == mAnswer){
                    Score++;
                    updateQuestion(r.nextInt(mQuestionsLenght));
                }else
                    updateQuestion(r.nextInt(mQuestionsLenght));

                if (answer2.getText() == mAnswer){
                    Score++;
                    updateQuestion(r.nextInt(mQuestionsLenght));
                }else
                    updateQuestion(r.nextInt(mQuestionsLenght));
            }
        });

        /*answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer1.getText() == mAnswer){
                    Score++;
                    updateQuestion(r.nextInt(mQuestionsLenght));
                }

            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer2.getText() == mAnswer){
                    Score++;
                    updateQuestion(r.nextInt(mQuestionsLenght));
                }

            }
        });*/
    }

    private void updateQuestion(int num){
        question_content.setText(mQuestions.getQuestion(num));
        answer1.setText(mQuestions.getChoice1(num));
        answer2.setText(mQuestions.getChoice2(num));

        mAnswer = mQuestions.getAnswer(num);
    }


}
