package com.example.educate_me;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ReceptionActivity extends AppCompatActivity {

    private Button b1Btn, g1Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reception);

        b1Btn = findViewById(R.id.beginB1);
        g1Btn = findViewById(R.id.beginG1);

        b1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ReceptionActivity.this,b1ReceptionActivity.class);
                startActivity(intent);
            }
        });

        g1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ReceptionActivity.this,g1ReceptionActivity.class);
                startActivity(intent);
            }
        });

    }
}
