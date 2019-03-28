package com.example.educate_me;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class b1YearTwoActivity extends AppCompatActivity {

    TextView textQuestionB1Y2;

    ImageView imgOpt1, imgOpt2,imgOpt3;

    ImageButton imgVol1, imgVol2, imgVol3;


    static final String[] questionB1Y2 ={
            "Which word rhymes with name?",
            "Which word rhymes with the best?",
            "Which word rhymes with cane?",
            "Which word rhymes with shop?",
            "Which word rhymes with time?"
    };

    private int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b1_year_two);

        textQuestionB1Y2 = findViewById(R.id.textQuestion_B1Y2);

        textQuestionB1Y2.setText(questionB1Y2[index]);


    }
}
