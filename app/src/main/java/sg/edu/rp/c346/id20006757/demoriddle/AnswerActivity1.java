package sg.edu.rp.c346.id20006757.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class AnswerActivity1 extends AppCompatActivity {
    TextView tvAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);
        Log.d("AnswerActivity1", "onCreate() called.");



        tvAnswer = findViewById(R.id.textView);

        Intent i =getIntent();

        String QuestionSelected = i.getStringExtra("Question");
        String a1 = "answer is :Queue";
        String a2 = "answer is :Gone";


      //  tvAnswer.setText("In Second Actiivty");
        String msg ="";
        if (QuestionSelected.equals("Q1")) {
            msg = QuestionSelected + a1;
        }
        else if(QuestionSelected.equals("Q2")) {
            msg = QuestionSelected + a2 ;


        }
        tvAnswer.setText(msg);



    }

    @Override
    protected void onStart() {
        Log.d("AnswerActivity1", "onStart() called.");
        super.onStart();
    }
    @Override
    protected void onResume() {
        Log.d("AnswerActivity1", "onResume() called.");
        super.onResume();
    }
    @Override
    protected void onPause() {
        Log.d("AnswerActivity1", "onPause() called.");
        super.onPause();
    }
    @Override
    protected void onStop() {
        Log.d("AnswerActivity1", "onStop() called.");
        super.onStop();
    }
    @Override
    protected void onDestroy() {
        Log.d("AnswerActivity1", "onDestroy() called.");
        super.onDestroy();
    }
    @Override
    protected void onRestart() {
        Log.d("AnswerActivity1", "onRestart() called.");
        super.onRestart();
    }

}