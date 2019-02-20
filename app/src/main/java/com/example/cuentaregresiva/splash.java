package com.example.cuentaregresiva;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class splash extends AppCompatActivity {
    TextView txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Bundle b = getIntent().getExtras();
        txt1 = findViewById(R.id.tx);
        String t1 = b.getString("name");
        txt1.setText(t1);
    }
}
