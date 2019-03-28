package com.example.educate_me;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class o1YearTwoActivity extends AppCompatActivity {


    TextView textQuestion, textOption1, textOption2;

    ImageView imageQuestion;

    ImageButton imgVol1, imgVol2, imgVol3;

    Button restartBtnO1;

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

        textQuestion = findViewById(R.id.textQuestion_O1);
        textOption1 = findViewById(R.id.textOption1_o1);
        textOption2 = findViewById(R.id.textOption2_o1);

        restartBtnO1 = findViewById(R.id.buttonRestartO1);

        imageQuestion = findViewById(R.id.imageViewO1);

        imgVol1 = findViewById(R.id.imageButtonVolume_o1);
        imgVol2 = findViewById(R.id.imageButtonVolume2_o1);
        imgVol3 = findViewById(R.id.imageButtonVolume3_o1);

        //Gets Sound from folder raw in resources


        //set text parts to the first question

        textQuestion.setText(textQst[index]);
        textOption1.setText(textOpt1[index]);
        textOption2.setText(textOpt2[index]);



         textOption1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (textOption1.getText() == answersO1[index] ){

                     if (index+1 != answersO1.length){


                         Toast.makeText(getApplicationContext(), "Correct Answer", Toast.LENGTH_SHORT).show();
                         index++;
                         textOption1.setText(textOpt1[index]);
                         textOption2.setText(textOpt2[index]);
                         textQuestion.setText(textQst[index]);
                         changeImage(index);
                         //playSound(grab_h2,spill_h2,cliff_h2,clap_h2,slip_h2);

                     }else {

                         Toast.makeText(getApplicationContext(), "You have solved them all", Toast.LENGTH_SHORT).show();
                     }

                 }else{

                     Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();

                 }

             }
         });


         textOption2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 if (textOption2.getText() == answersO1[index] ){

                     if (index+1 != answersO1.length){


                         Toast.makeText(getApplicationContext(), "Correct Answer", Toast.LENGTH_SHORT).show();
                         index++;
                         textOption1.setText(textOpt1[index]);
                         textOption2.setText(textOpt2[index]);
                         textQuestion.setText(textQst[index]);
                         changeImage(index);
                         //playSound(grab_h2,spill_h2,cliff_h2,clap_h2,slip_h2);

                     }else {

                         Toast.makeText(getApplicationContext(), "You have solved them all", Toast.LENGTH_SHORT).show();
                     }

                 }else{

                     Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();

                 }

             }
         });



    }


    public void changeImage(int index){

        switch (index){
            case 0:
                imageQuestion.setImageResource(R.drawable.cry_o1);
                break;
            case 1:
                imageQuestion.setImageResource(R.drawable.wins_o1);
                break;
            case 2:
                imageQuestion.setImageResource(R.drawable.hops_o1);
                break;
            case 3:
                imageQuestion.setImageResource(R.drawable.naps_o1);
                break;
            case 4:
                imageQuestion.setImageResource(R.drawable.wag_o1);
                break;
        }


    }




}
