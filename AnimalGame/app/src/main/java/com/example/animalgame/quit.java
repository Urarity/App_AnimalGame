package com.example.animalgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class quit extends AppCompatActivity {

    private Button home_btn;
    private TextView quit_score;
    private Intent intent;
    private String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quit);

        quit_score = findViewById(R.id.quit_text);

        intent = getIntent();
        str = intent.getStringExtra("message");

        quit_score.setText(str);

        // Go Home button
        home_btn = findViewById(R.id.home_btn);

        home_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                home();
            }
        });

    }
    public void home(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
