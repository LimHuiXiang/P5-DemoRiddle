package sg.edu.rp.c346.id20006757.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Event handling Step 1
    TextView tvQ1;
    Button btnRevealQ1;
    Button btnRevealQ2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("MainActivity", "onCreate() called.");




        //Event handling Step 2
        tvQ1 = findViewById(R.id.TextViewQ1);
        btnRevealQ1 = findViewById(R.id.ButtonQ1);
        btnRevealQ2 = findViewById(R.id.ButtonQ2);

        //Event handling Step 3
        btnRevealQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MainActivity.this, AnswerActivity1.class);
                intent.putExtra("Question", "Q1");
                startActivity(intent);

            }
        });

        //Event handling Step 3
        btnRevealQ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MainActivity.this, AnswerActivity1.class);
                intent.putExtra("Question", "Q2");
                startActivity(intent);

            }
        });

    }
    @Override
    protected void onStart() {
        Log.d("MainActivity", "onStart() called.");
        super.onStart();
    }
    @Override
    protected void onResume() {
        Log.d("MainActivity", "onResume() called.");
        super.onResume();
    }


    @Override
    protected void onPause() {
        Log.d("MainActivity", "onPause() called.");
        super.onPause();
    }
    @Override
    protected void onStop() {
        Log.d("MainActivity", "onStop() called.");
        super.onStop();
    }
    @Override
    protected void onDestroy() {
        Log.d("MainActivity", "onDestroy() called.");
        super.onDestroy();
    }
    @Override
    protected void onRestart() {
        Log.d("MainActivity", "onRestart() called.");
        super.onRestart();
    }
}