package com.example.animalgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class game extends AppCompatActivity {
    int num = 0;
    private Intent intent;
    private TextView txt;
    private TextView final_txt;
    private Button back_btn;
    private Button submit_btn;
    private EditText input;
    private String[] firstName;
    private String user_input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        start();
    }
    public void start() {

        firstName = new String[]{
                "Which animal has sweat glands in their paw?",
                "Which animal is mainly used as emotional support?",
                "Which animal can absorb scent chemicals?",
                "Which animal has the highest chance to detect diseases?",
                "Which animal has a park named after them?",
                "Which animal was considered a god in the past?",
                "Which animal has a scary rumour based on its color?",
                "Which animal was Lincolns favorite?",
                "Which animal outnumbers humans in Aoshima Japan by 6 to 1?",
                "Which animal has a commonly known rough tongue?",
                "Which animal has the shortest life span at 2 years?",
                "Which animal reproduces the fastest?",
                "Which animal has OCD about how it travels?",
                "Which animal is a fantastic climber?",
                "Which animal is the natural enemy of the cat?",
                "Which animal looks most like a rabbit?",
                "Which animal has a habit that humans called haying?",
                "Which animal is the most endangered?",
                "Which animal cannot tolerate high temperatures?",
                "Which animal was used as reference for the popular Japanese game character Pikachu?",
                "Which animal was originally known as a Desert Rat?",
                "Which animal is able to shed their tail to escape predators?",
                "Which animal washes themselves with sand?",
                "Which animal lives in groups?",
                "Which animal thumps it's back leg like a rabbit when threatened?",
                "Which animal has the thickest fur?",
                "Which animal can shed it's fur to get away from predators known by humans as the 'fur slip'",
                "Which animal is nocturnal?",
                "Which animal washes itself in volcanic ash or dust?",
                "Which animal can jump 6 feet in the air?"};

        List<String> strList = Arrays.asList(firstName);
        Collections.shuffle(strList);
        firstName = strList.toArray(new String[strList.size()]);

        txt = findViewById(R.id.st_text);

        txt.setText(firstName[0]);

        back_btn = findViewById(R.id.quit_btn);

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user_quit();
            }
        });

        input = findViewById(R.id.user_input);

        submit_btn = findViewById(R.id.submit_btn);

        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit();
            }
        });

    }

    public void submit() {
        user_input = input.getText().toString();

        switch (user_input) {
            case "a":

                switch (firstName[0]) {
                    case "Which animal has sweat glands in their paw?":
                    case "Which animal is mainly used as emotional support?":
                    case "Which animal can absorb scent chemicals?":
                    case "Which animal has the highest chance to detect diseases?":
                    case "Which animal has a park named after them?":
                    case "Which animal is the natural enemy of the cat?":

                    case "a":
                        Toast.makeText(getApplicationContext(), "You got the answer right!", Toast.LENGTH_SHORT).show();
                        display();
                        break;
                    case "\n":
                        break;
                    default:
                        fail();
                        break;
                }
                break;

            case "b":
                switch (firstName[0]) {
                    case "Which animal was considered a god in the past?":
                    case "Which animal has a scary rumour based on its color?":
                    case "Which animal was Lincolns favorite?":
                    case "Which animal outnumbers humans in Aoshima Japan by 6 to 1?":
                    case "Which animal has a commonly known rough tongue?":

                    case "b":
                        Toast.makeText(getApplicationContext(), "You got the answer right!", Toast.LENGTH_SHORT).show();
                        display();
                        break;
                    case "a":
                    case "c":
                    case "d":
                    case "e":
                    case "f":
                        fail();
                        break;
                    case "\n":
                        break;
                    default:
                        fail();
                        break;
                }
                break;

            case "c":
                switch (firstName[0]) {
                    case "Which animal has the shortest life span at 2 years?":
                    case "Which animal reproduces the fastest?":
                    case "Which animal has OCD about how it travels?":
                    case "Which animal is a fantastic climber?":
                    case "Which animal is the natural enemy of the cat?":
                    case "Which animal is able to shed their tail to escape predators?":

                    case "c":
                        Toast.makeText(getApplicationContext(), "You got the answer right!", Toast.LENGTH_SHORT).show();
                        display();
                        break;
                    case "a":
                    case "b":
                    case "d":
                    case "e":
                    case "f":
                        fail();
                        break;
                    case "\n":
                        break;
                    default:
                        fail();
                        break;
                }
                break;

            case "d":
                switch (firstName[0]) {
                    case "Which animal looks most like a rabbit?":
                    case "Which animal has a habit that humans called haying?":
                    case "Which animal is the most endangered?":
                    case "Which animal cannot tolerate high temperatures?":
                    case "Which animal was used as reference for the popular Japanese game character Pikachu?":

                    case "d":
                        Toast.makeText(getApplicationContext(), "You got the answer right!", Toast.LENGTH_SHORT).show();
                        display();
                        break;
                    case "a":
                    case "b":
                    case "c":
                    case "e":
                    case "f":
                        fail();
                        break;
                    case "\n":
                        break;
                    default:
                        fail();
                        break;
                }
                break;

            case "e":
                switch (firstName[0]) {
                    case "Which animal was originally known as a Desert Rat?":
                    case "Which animal is able to shed their tail to escape predators?":
                    case "Which animal washes themselves with sand?":
                    case "Which animal lives in groups?":
                    case "Which animal thumps it's back leg like a rabbit when threatened?":

                    case "e":
                        Toast.makeText(getApplicationContext(), "You got the answer right!", Toast.LENGTH_SHORT).show();
                        display();
                        break;
                    case "a":
                    case "b":
                    case "c":
                    case "d":
                    case "f":
                        fail();
                        break;
                    case "\n":
                        break;
                    default:
                        fail();
                        break;
                }
                break;

            case "f":
                switch (firstName[0]) {
                    case "Which animal has the thickest fur?":
                    case "Which animal can shed it's fur to get away from predators known by humans as the 'fur slip'":
                    case "Which animal is nocturnal?":
                    case "Which animal can jump 6 feet in the air?":
                    case "Which animal washes itself in volcanic ash or dust?":

                    case "f":
                        Toast.makeText(getApplicationContext(), "You got the answer right!", Toast.LENGTH_SHORT).show();
                        display();
                        break;
                    case "a":
                    case "b":
                    case "c":
                    case "d":
                    case "e":
                        fail();
                        break;
                    case "\n":
                        break;
                    default:
                        fail();
                        break;
                }
                break;

            case "\n":
                break;
            default:
                fail();
                break;

        }
    }
    public void display(){

        txt = findViewById(R.id.user_input);

        txt.setText("");

        num++;

        if(num < 10) {

            final_txt = findViewById(R.id.progress);

            String str = String.valueOf(num);

            String str2 = "Points: " + str + "/10";

            final_txt.setText(str2);

            start();
        }

        if (num >= 10){

            String str2 =  String.valueOf(num);

            Intent intent = new Intent(getApplicationContext(), score.class);
            intent.putExtra("message", str2);

            startActivity(intent);

        }
    }
    public void fail(){

        Toast.makeText(getApplicationContext(), "You got the answer wrong", Toast.LENGTH_SHORT).show();

        String str3 = String.valueOf(num);

        Intent intent = new Intent(getApplicationContext(), fail.class);
        intent.putExtra("message", str3);

        startActivity(intent);

    }
    public void user_quit(){

        Toast.makeText(getApplicationContext(), "Sorry to see you quit...", Toast.LENGTH_SHORT).show();

        String str4 = String.valueOf(num);

        Intent intent = new Intent(getApplicationContext(), quit.class);
        intent.putExtra("message", str4);

        startActivity(intent);
    }
}

