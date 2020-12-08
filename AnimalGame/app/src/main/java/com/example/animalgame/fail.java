package com.example.animalgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class fail extends AppCompatActivity {

    private Button try_btn;
    private Button home_btn;
    private TextView fail_score;
    private Intent intent;
    private String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fail);

        fail_score = findViewById(R.id.fail_text);

        intent = getIntent();
        str = intent.getStringExtra("message");

        fail_score.setText(str);

        // Try again button
        try_btn = findViewById(R.id.try_btn);

        try_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try_again();
            }
        });

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
    public void try_again(){
        Intent intent = new Intent(this, game.class);
        startActivity(intent);
    }
}
