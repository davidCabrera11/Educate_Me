package com.example.educate_me;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class YearOneActivity extends AppCompatActivity {


    private Button h2Btn, i2Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year_one);



        h2Btn = findViewById(R.id.beginH2);
        i2Btn = findViewById(R.id.beginI2);


        h2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(YearOneActivity.this,h2YearOneActivity.class);
                startActivity(intent);
            }
        });


        i2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(YearOneActivity.this,i2YearOneActivity.class);
                startActivity(intent);

            }
        });


    }
}
