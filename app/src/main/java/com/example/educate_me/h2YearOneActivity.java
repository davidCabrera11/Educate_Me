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

public class h2YearOneActivity extends AppCompatActivity {


    TextView textFillInH2, textOption1, textOption2;
    ImageButton imgVolH2;
    ImageView imageH2;
    Button btnRestartH2;

    static final String[] textFill ={"__ab","__ill","__ap","__iff","__ip"};

    static final String[] textOpt1 = {"sl","sp","pr","cl","sl"};

    static final String[] textOpt2 = {"gr","bl","cl","br","gr"};

    static final String[] correctAnswersH2 = {"gr","sp","cl","cl","sl"};

    private int index = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h2_year_one);

        textFillInH2 = findViewById(R.id.textFillInH2);
        textOption1 = findViewById(R.id.textOption1_H2);
        textOption2 = findViewById(R.id.textOption2_H2);

        btnRestartH2 = findViewById(R.id.buttonRestartH2);

        imgVolH2 = findViewById(R.id.imageButtonVolumeH2);

        imageH2 = findViewById(R.id.imageH2);

        //Gets Sound from folder raw in resources
        final MediaPlayer grab_h2 = MediaPlayer.create(this,R.raw.grab_h2);
        final MediaPlayer spill_h2 = MediaPlayer.create(this,R.raw.spill_h2);
        final MediaPlayer cliff_h2 = MediaPlayer.create(this,R.raw.cliff_h2);
        final MediaPlayer clap_h2 = MediaPlayer.create(this,R.raw.clap_h2);
        final MediaPlayer slip_h2 = MediaPlayer.create(this,R.raw.slip_h2);

        //Sounds of question Image


        //Sound related to the question


        //set text parts to the first question
        textFillInH2.setText(textFill[index]);
        textOption1.setText(textOpt1[index]);
        textOption2.setText(textOpt2[index]);

        imgVolH2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                grab_h2.start();

            }
        });


        textOption1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (textOption1.getText() == correctAnswersH2[index] ){

                    if (index+1 != correctAnswersH2.length){


                        Toast.makeText(getApplicationContext(), "Correct Answer", Toast.LENGTH_SHORT).show();
                        index++;
                        textOption1.setText(textOpt1[index]);
                        textOption2.setText(textOpt2[index]);
                        textFillInH2.setText(textFill[index]);
                        changeImage(index);
                        playSound(grab_h2,spill_h2,cliff_h2,clap_h2,slip_h2);

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

                if (textOption2.getText() == correctAnswersH2[index] ){

                    if (index+1 != correctAnswersH2.length){


                        Toast.makeText(getApplicationContext(), "Correct Answer", Toast.LENGTH_SHORT).show();
                        index++;
                        textOption1.setText(textOpt1[index]);
                        textOption2.setText(textOpt2[index]);
                        textFillInH2.setText(textFill[index]);
                        changeImage(index);
                        playSound(grab_h2,spill_h2,cliff_h2,clap_h2,slip_h2);



                    }else {

                        Toast.makeText(getApplicationContext(), "You have solved them all", Toast.LENGTH_SHORT).show();
                    }

                }else{

                    Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnRestartH2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index = 0;
                textOption1.setText(textOpt1[index]);
                textOption2.setText(textOpt2[index]);
                textFillInH2.setText(textFill[index]);
                changeImage(index);

            }
        });



    }

    //Changes image related to the question
    public void changeImage(int index){


        switch (index){
            case 0:
                imageH2.setImageResource(R.drawable.grab_h2);
                break;
            case 1:
                imageH2.setImageResource(R.drawable.spill_h2);
                break;
            case 2:
                imageH2.setImageResource(R.drawable.clap_h2);
                break;
            case 3:
                imageH2.setImageResource(R.drawable.cliff_h2);
                break;
            case 4:
                imageH2.setImageResource(R.drawable.slip_h2);
                break;
        }

    }


    public void playSound(final MediaPlayer grab,final MediaPlayer spill,final MediaPlayer cliff,
                          final MediaPlayer clap,final MediaPlayer slip){


        imgVolH2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                switch (index){
                    case 0:
                        grab.start();
                        break;
                    case 1:
                        spill.start();
                        break;
                    case 2:
                        clap.start();

                        break;
                    case 3:
                        cliff.start();
                        break;
                    case 4:
                        slip.start();
                        break;
                }


            }
        });


    }
}
