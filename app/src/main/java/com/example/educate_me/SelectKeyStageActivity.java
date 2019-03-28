package com.example.educate_me;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SelectKeyStageActivity extends AppCompatActivity {

    private ImageView imgReception, imgYearOne, imgYearTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_key_stage);


        imgReception = findViewById(R.id.imageReception);
        imgYearOne = findViewById(R.id.imageYearOne);
        imgYearTwo = findViewById(R.id.imageYearTwo);


        imgReception.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SelectKeyStageActivity.this,ReceptionActivity.class);
                startActivity(intent);
            }
        });


        imgYearOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SelectKeyStageActivity.this,YearOneActivity.class);
                startActivity(intent);
            }
        });


        imgYearTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SelectKeyStageActivity.this,YearTwoActivity.class);
                startActivity(intent);

            }
        });

    }
}
