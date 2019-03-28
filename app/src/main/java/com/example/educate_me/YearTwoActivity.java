package com.example.educate_me;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class YearTwoActivity extends AppCompatActivity {


    private Button b1year2Btn, o1Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year_two);


        b1year2Btn = findViewById(R.id.beginB1Year2);
        o1Btn = findViewById(R.id.begino1);


        b1year2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YearTwoActivity.this,b1YearTwoActivity.class);
                startActivity(intent);


            }
        });


        o1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YearTwoActivity.this,o1YearTwoActivity.class);
                startActivity(intent);


            }
        });

    }

}
