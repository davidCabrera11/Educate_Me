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

public class i2YearOneActivity extends AppCompatActivity {


    TextView textOption1, textOption2;

    ImageButton imgVolI2;

    ImageView imageI2;

    Button btnRestartI2;

    static final String[] textOpt1 ={"pat","cat","tag","tag","pad",};

    static final String[] textOpt2 ={"fan","jam","sad","bad","ran",};

    static final String[] answersI2 ={"pat","jam","tag","bad","ran",};

    private int index = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i2_year_one);

        textOption1 = findViewById(R.id.textOption1_I2);
        textOption2 = findViewById(R.id.textOption2_I2);

        imgVolI2 = findViewById(R.id.imageButtonVolumeI2);

        imageI2 = findViewById(R.id.imageI2);

        btnRestartI2 = findViewById(R.id.buttonRestartI2);

        //Gets Sound from folder raw in resources
        final MediaPlayer pat_i2 = MediaPlayer.create(this,R.raw.pat_i2);
        final MediaPlayer jam_i2 = MediaPlayer.create(this,R.raw.jam_i2);
        final MediaPlayer tag_i2 = MediaPlayer.create(this,R.raw.tag_i2);
        final MediaPlayer bad_i2 = MediaPlayer.create(this,R.raw.bad_i2);
        final MediaPlayer ran_i2 = MediaPlayer.create(this,R.raw.ran_i2);

        textOption1.setText(textOpt1[index]);
        textOption2.setText(textOpt2[index]);

        imgVolI2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pat_i2.start();
            }
        });

        textOption1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (textOption1.getText() == answersI2[index] ){

                    if (index+1 != answersI2.length){

                        Toast.makeText(getApplicationContext(), "Correct Answer", Toast.LENGTH_SHORT).show();
                        index++;
                        textOption1.setText(textOpt1[index]);
                        textOption2.setText(textOpt2[index]);
                        changeImage(index);
                        playSound(pat_i2,jam_i2,tag_i2,bad_i2,ran_i2);

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


                if (textOption2.getText() == answersI2[index] ){

                    if (index+1 != answersI2.length){

                        Toast.makeText(getApplicationContext(), "Correct Answer", Toast.LENGTH_SHORT).show();
                        index++;
                        textOption1.setText(textOpt1[index]);
                        textOption2.setText(textOpt2[index]);
                        changeImage(index);
                        playSound(pat_i2,jam_i2,tag_i2,bad_i2,ran_i2);

                    }else {

                        Toast.makeText(getApplicationContext(), "You have solved them all", Toast.LENGTH_SHORT).show();
                    }

                }else{

                    Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();

                }

            }
        });



        btnRestartI2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                index = 0;
                textOption1.setText(textOpt1[index]);
                textOption2.setText(textOpt2[index]);
                changeImage(index);

            }
        });

    }


    public void changeImage(int index){

        switch (index){
            case 0:
                imageI2.setImageResource(R.drawable.pat_i2);
                break;
            case 1:
                imageI2.setImageResource(R.drawable.jam_i2);
                break;
            case 2:
                imageI2.setImageResource(R.drawable.tag_i2);
                break;
            case 3:
                imageI2.setImageResource(R.drawable.bad_i2);
                break;
            case 4:
                imageI2.setImageResource(R.drawable.ran_i2);
                break;
        }

    }

    public  void playSound(final MediaPlayer pat,final MediaPlayer jam,final MediaPlayer tag,
                           final MediaPlayer bad,final MediaPlayer ran){


        imgVolI2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (index){
                    case 0:
                        pat.start();
                        break;
                    case 1:
                        jam.start();
                        break;
                    case 2:
                        tag.start();
                        break;
                    case 3:
                        bad.start();
                        break;
                    case 4:
                        ran.start();
                        break;
                }

            }
        });

    }
}
