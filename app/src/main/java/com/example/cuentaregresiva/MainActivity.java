package com.example.cuentaregresiva;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView N;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        N = findViewById(R.id.num);
        new CountDownTimer(10000,1000){
            @Override
            public void onTick(long millisUntilFinished) {
                N.setText(String.valueOf(millisUntilFinished/1000));
            }

            @Override
            public void onFinish() {
                Intent t = new Intent (MainActivity.this, splash.class);
                t.putExtra("Until The End","Until");
                startActivity(t);
                finish();
            }
        }.start();
    }
}
