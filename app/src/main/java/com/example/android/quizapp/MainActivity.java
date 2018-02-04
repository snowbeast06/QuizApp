package com.example.android.quizapp;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private int score = 0;
    private RadioGroup radioGroup1, radioGroup2, radioGroup3, radioGroup4, radioGroup5, radioGroup6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup1 = (RadioGroup) findViewById(R.id.radioGroup1);
        radioGroup2 = (RadioGroup) findViewById(R.id.radioGroup2);
        radioGroup3 = (RadioGroup) findViewById(R.id.radioGroup3);

    }

    public void calculateScore(View view) {
        int chosenAnswer1, chosenAnswer2, chosenAnswer3;

        chosenAnswer1 = radioGroup1.getCheckedRadioButtonId();
        checkQuestion1(chosenAnswer1);

        chosenAnswer2 = radioGroup2.getCheckedRadioButtonId();
        checkQuestion2(chosenAnswer2);

        chosenAnswer3 = radioGroup3.getCheckedRadioButtonId();
        checkQuestion3(chosenAnswer3);


        Log.i("MainActivity.java", "in the calculateScore method ");
        Log.i("MainActivity.java", "" + chosenAnswer1 + " " + chosenAnswer2);


    }


    private void checkQuestion1(int chosenAnswer) {
        // we'll hardcode the correct answers and have a different checker for each question
        // in this case the correct answer is #1

        RadioButton correctAnswer = (RadioButton) findViewById(R.id.radioGroup1Button1);

        if ((correctAnswer.getId()) == chosenAnswer) {
            score++;
            Log.i("MainActivity.java", "Checking the first answer");
            Log.i("MainActivity.java", "correct answer");
        }
        return;
    }

    private void checkQuestion2(int chosenAnswer) {
        // we'll hardcode the correct answers and have a different checker for each question
        // in this case the correct answer is #2

        RadioButton correctAnswer = (RadioButton) findViewById(R.id.radioGroup2Button2);

        if ((correctAnswer.getId()) == chosenAnswer) {
            score++;
            Log.i("MainActivity.java", "Checking the first answer");
            Log.i("MainActivity.java", "correct answer");
        }
        return;
    }

    private void checkQuestion3(int chosenAnswer) {
        // we'll hardcode the correct answers and have a different checker for each question
        // in this case the correct answer is #3

        RadioButton correctAnswer = (RadioButton) findViewById(R.id.radioGroup3Button3);

        if ((correctAnswer.getId()) == chosenAnswer) {
            score++;
            Log.i("MainActivity.java", "Checking the first answer");
            Log.i("MainActivity.java", "correct answer");
        }
        return;
    }


}
