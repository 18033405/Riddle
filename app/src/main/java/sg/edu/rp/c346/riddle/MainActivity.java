package sg.edu.rp.c346.riddle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvQ1;
    TextView tvQ2;
    Button btnRevealQ1;
    Button btnRevealQ2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "onCreate() called.");

        tvQ2 = findViewById(R.id.textView2);
        tvQ1 = findViewById(R.id.textView);
        btnRevealQ1 = findViewById(R.id.button);
        btnRevealQ2 = findViewById(R.id.button2);

        btnRevealQ1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getBaseContext(),AnswerActivity1.class);
                intent.putExtra("Question","Q1");

                startActivity(intent);
            }
        });

        btnRevealQ2.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v){
                Intent intent=new Intent(getBaseContext(),AnswerActivity1.class);

                intent.putExtra("Question","Q2");
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



