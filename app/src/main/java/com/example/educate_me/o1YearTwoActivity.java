package com.example.educate_me;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class o1YearTwoActivity extends AppCompatActivity {


    TextView textQuestion, textOption1, textOption2;

    ImageView imageQuestion;

    ImageButton imgVol1, imgVol2, imgVol3;

    Button restartBtn;

    static final String[] textQst = {"The babies _.","The boy _ a prize.","The bunny _.",
                                    "The cat _.","The dogs _ their tails"};

    static final String[] textOpt1 = {"laugh","opens","eats","jumps","wag"};

    static final String[] textOpt2 = {"cry","wins","hops","naps","watch"};

    static final String[] answersO1 = {"cry","wins","hops","naps","wag"};

    private int index = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o1_year_two);
    }
}
