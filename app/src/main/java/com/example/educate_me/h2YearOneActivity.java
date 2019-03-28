package com.example.educate_me;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class h2YearOneActivity extends AppCompatActivity {


    TextView textFillInH2, textOption1, textOption2;
    ImageButton imgVolH2;
    ImageView imageH2;

    static final String[] textFill ={"__ab","__ill","__ap","__iff","__ip"};

    static final String[] textOpt1 = {"sl","sp","pr","cl","ip"};

    static final String[] textOpt2 = {"gr","bl","cl","br","gr"};

    static final String[] correctAnswersH2 = {"gr","sp","cl","cl","sl"};

    private int index = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h2_year_one);



    }
}
