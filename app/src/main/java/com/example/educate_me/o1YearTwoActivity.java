package com.example.educate_me;

import android.media.MediaPlayer;
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

    static final String[] textQst = {"The babies _.","The boy _\n a prize.","The bunny _.",
                                    "The cat _.","The dogs _ \ntheir tails"};

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

        //Gets Sound from folder raw in resources text question
        final MediaPlayer o1Question1 = MediaPlayer.create(this,R.raw.o1q1question);
        final MediaPlayer o1Question2 = MediaPlayer.create(this,R.raw.o1q2question);
        final MediaPlayer o1Question3 = MediaPlayer.create(this,R.raw.o1q3question);
        final MediaPlayer o1Question4 = MediaPlayer.create(this,R.raw.o1q4question);
        final MediaPlayer o1Question5 = MediaPlayer.create(this,R.raw.o1q5question);

        //Sounds text option 1
        final MediaPlayer laughs = MediaPlayer.create(this,R.raw.o1q1laugh);
        final MediaPlayer opens = MediaPlayer.create(this,R.raw.o1q2opens);
        final MediaPlayer eats = MediaPlayer.create(this,R.raw.o1q3eats);
        final MediaPlayer jumps = MediaPlayer.create(this,R.raw.o1q4jumps);
        final MediaPlayer wag = MediaPlayer.create(this,R.raw.o1q5wag);

        //Sounds text option 2
        final MediaPlayer cry = MediaPlayer.create(this,R.raw.o1q1cry);
        final MediaPlayer wins = MediaPlayer.create(this,R.raw.o1q2wins);
        final MediaPlayer hops = MediaPlayer.create(this,R.raw.o1q3hops);
        final MediaPlayer naps = MediaPlayer.create(this,R.raw.o1q4naps);
        final MediaPlayer watch = MediaPlayer.create(this,R.raw.o1q5watch);



        //set text parts to the first question
        textQuestion.setText(textQst[index]);
        textOption1.setText(textOpt1[index]);
        textOption2.setText(textOpt2[index]);

        //sets sounds for first question

        imgVol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                o1Question1.start();

            }
        });

        imgVol2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                laughs.start();
            }
        });

        imgVol3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cry.start();

            }
        });

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

                         playQuestion(o1Question1,o1Question2,o1Question3,o1Question4,o1Question5);
                         playOption1(laughs,opens,eats,jumps,wag);
                         playOption2(cry,wins,hops,naps,watch);

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

                         playQuestion(o1Question1,o1Question2,o1Question3,o1Question4,o1Question5);
                         playOption1(laughs,opens,eats,jumps,wag);
                         playOption2(cry,wins,hops,naps,watch);
                     }else {

                         Toast.makeText(getApplicationContext(), "You have solved them all", Toast.LENGTH_SHORT).show();
                     }

                 }else{

                     Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();

                 }

             }
         });

         restartBtnO1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 index = 0;
                 textOption1.setText(textOpt1[index]);
                 textOption2.setText(textOpt2[index]);
                 textQuestion.setText(textQst[index]);
                 changeImage(index);
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

    public void playQuestion(final MediaPlayer question1,final MediaPlayer question2,
                             final MediaPlayer question3,final MediaPlayer question4,
                             final MediaPlayer question5){

        imgVol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (index){
                    case 0:
                        question1.start();
                        break;
                    case 1:
                        question2.start();
                        break;
                    case 2:
                        question3.start();
                        break;
                    case 3:
                        question4.start();
                        break;
                    case 4:
                        question5.start();
                        break;
                }

            }
        });




    }


    public void playOption1(final MediaPlayer laughs,final MediaPlayer opens,
                            final MediaPlayer eats,final MediaPlayer jumps,
                            final MediaPlayer wag){

        imgVol2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (index){
                    case 0:
                        laughs.start();
                        break;
                    case 1:
                        opens.start();
                        break;
                    case 2:
                        eats.start();
                        break;
                    case 3:
                        jumps.start();
                        break;
                    case 4:
                        wag.start();
                        break;
                }



            }
        });

    }


    public void playOption2(final MediaPlayer cry,final MediaPlayer wins,
                            final MediaPlayer hops,final MediaPlayer naps,
                            final MediaPlayer watch){

        imgVol3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (index){
                    case 0:
                        cry.start();
                        break;
                    case 1:
                        wins.start();
                        break;
                    case 2:
                        hops.start();
                        break;
                    case 3:
                        naps.start();
                        break;
                    case 4:
                        watch.start();
                        break;
                }


            }
        });

    }


}
