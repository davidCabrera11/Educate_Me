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

public class b1YearTwoActivity extends AppCompatActivity {

    TextView textQuestionB1Y2;

    Button restartBtnB1Y2;

    ImageView imgOpt1, imgOpt2,imgOpt3;

    ImageButton imgVol1, imgVol2, imgVol3, imgQuestion;




    static final String[] questionB1Y2 ={
            "Which word rhymes with name?",
            "Which word rhymes with the best?",
            "Which word rhymes with cane?",
            "Which word rhymes with shop?",
            "Which word rhymes with time?"
    };

    static final String[] textOpt1 ={"mug","smile","plane","blue","sheep",};

    static final String[] textOpt2 ={"game","nest","mug","note","lime",};

    static final String[] textOpt3 ={"sheep","drop","back","drop","rope",};

    static final String[] answersB1Y2 ={"game","nest","plane","drop","lime",};

    private int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b1_year_two);

        textQuestionB1Y2 = findViewById(R.id.textQuestion_B1Y2);

        restartBtnB1Y2 = findViewById(R.id.buttonRestartB1Y2);

        imgOpt1 = findViewById(R.id.imageViewB1Y2);
        imgOpt2 = findViewById(R.id.imageView2_B1Y2);
        imgOpt3 = findViewById(R.id.imageView3_B1Y2);

        imgQuestion = findViewById(R.id.imageButtonVolumeB1Y2);
        imgVol1 = findViewById(R.id.imageButtonVolume1_B1Y);
        imgVol2= findViewById(R.id.imageButtonVolume2_B1Y);
        imgVol3= findViewById(R.id.imageButtonVolume3_B1Y);

        //Sets text to first Question
        textQuestionB1Y2.setText(questionB1Y2[index]);


        //Sets sound for each image and question
        final MediaPlayer question1 = MediaPlayer.create(this,R.raw.b1y2question);
        final MediaPlayer question2 = MediaPlayer.create(this,R.raw.b1y2question2);
        final MediaPlayer question3 = MediaPlayer.create(this,R.raw.b1y2question3);
        final MediaPlayer question4 = MediaPlayer.create(this,R.raw.b1y2question4);
        final MediaPlayer question5 = MediaPlayer.create(this,R.raw.b1y2question5);

        //Image Option 1 Sounds
        final MediaPlayer mugOpt1 = MediaPlayer.create(this,R.raw.b1y2q1mug);
        final MediaPlayer smile = MediaPlayer.create(this,R.raw.b1y2q2smile);
        final MediaPlayer plane = MediaPlayer.create(this,R.raw.b1y2q3plane);
        final MediaPlayer blue = MediaPlayer.create(this,R.raw.b1y2q4blue);
        final MediaPlayer sheepOpt1 = MediaPlayer.create(this,R.raw.b1y2q5sheep);

        //Image Option 2 Sounds
        final MediaPlayer game = MediaPlayer.create(this,R.raw.b1y2q1game);
        final MediaPlayer nest = MediaPlayer.create(this,R.raw.b1y2q2nest);
        final MediaPlayer mugOpt2 = MediaPlayer.create(this,R.raw.b1y2q3mug);
        final MediaPlayer note = MediaPlayer.create(this,R.raw.b1y2q4note);
        final MediaPlayer lime = MediaPlayer.create(this,R.raw.b1y2q5lime);

        //Image Option 3 Sounds
        final MediaPlayer sheepOpt3 = MediaPlayer.create(this,R.raw.b1y2q1sheep);
        final MediaPlayer drop1 = MediaPlayer.create(this,R.raw.b1y2q2drop);
        final MediaPlayer back = MediaPlayer.create(this,R.raw.b1y2q3back);
        final MediaPlayer drop2 = MediaPlayer.create(this,R.raw.b1y2q4drop);
        final MediaPlayer rope = MediaPlayer.create(this,R.raw.b1y2q5rope);


        //set sounds for 1st question

        imgQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                question1.start();
            }
        });

        imgVol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mugOpt1.start();

            }
        });

        imgVol2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                game.start();
            }
        });

        imgVol3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sheepOpt3.start();
            }
        });


        imgOpt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ( textOpt1[index] == answersB1Y2[index] ){

                    if (index+1 != answersB1Y2.length){

                        Toast.makeText(getApplicationContext(), "Correct Answer", Toast.LENGTH_SHORT).show();
                        index++;
                        textQuestionB1Y2.setText(questionB1Y2[index]);
                        changeImage(index);

                        playSoundQuestion(question1,question2,question3,question4,question5);
                        playSoundOption1(mugOpt1,smile,plane,blue,sheepOpt1);
                        playSoundOption2(game,nest,mugOpt2,note,lime);
                        playSoundOption3(sheepOpt3,drop1,back,drop2,rope);

                    }else {

                        Toast.makeText(getApplicationContext(), "You have solved them all", Toast.LENGTH_SHORT).show();
                    }

                }else{

                    Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();

                }

            }
        });

        imgOpt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (textOpt2[index] == answersB1Y2[index] ){

                    if (index+1 != answersB1Y2.length){

                        Toast.makeText(getApplicationContext(), "Correct Answer", Toast.LENGTH_SHORT).show();
                        index++;
                        textQuestionB1Y2.setText(questionB1Y2[index]);
                        changeImage(index);

                        playSoundQuestion(question1,question2,question3,question4,question5);
                        playSoundOption1(mugOpt1,smile,plane,blue,sheepOpt1);
                        playSoundOption2(game,nest,mugOpt2,note,lime);
                        playSoundOption3(sheepOpt3,drop1,back,drop2,rope);

                    }else {

                        Toast.makeText(getApplicationContext(), "You have solved them all", Toast.LENGTH_SHORT).show();
                    }

                }else{

                    Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();

                }

            }
        });


        imgOpt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (textOpt3[index] == answersB1Y2[index] ){

                    if (index+1 != answersB1Y2.length){

                        Toast.makeText(getApplicationContext(), "Correct Answer", Toast.LENGTH_SHORT).show();
                        index++;
                        textQuestionB1Y2.setText(questionB1Y2[index]);
                        changeImage(index);

                        playSoundQuestion(question1,question2,question3,question4,question5);
                        playSoundOption1(mugOpt1,smile,plane,blue,sheepOpt1);
                        playSoundOption2(game,nest,mugOpt2,note,lime);
                        playSoundOption3(sheepOpt3,drop1,back,drop2,rope);

                    }else {

                        Toast.makeText(getApplicationContext(), "You have solved them all", Toast.LENGTH_SHORT).show();
                    }

                }else{

                    Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();

                }
            }
        });


        //Restart quiz

        restartBtnB1Y2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index = 0;

                textQuestionB1Y2.setText(questionB1Y2[index]);
                imgOpt1.setImageResource(R.drawable.name1);
                imgOpt2.setImageResource(R.drawable.name2);
                imgOpt3.setImageResource(R.drawable.name3);


            }
        });

    }

    public void changeImage(int index){

        switch (index){
            case 0:

                imgOpt1.setImageResource(R.drawable.name1);
                imgOpt2.setImageResource(R.drawable.name2);
                imgOpt3.setImageResource(R.drawable.name3);
                break;

            case 1:
                imgOpt1.setImageResource(R.drawable.best1);
                imgOpt2.setImageResource(R.drawable.best2);
                imgOpt3.setImageResource(R.drawable.best3);
                break;

            case 2:
                imgOpt1.setImageResource(R.drawable.cane1);
                imgOpt2.setImageResource(R.drawable.cane2);
                imgOpt3.setImageResource(R.drawable.cane3);
                break;

            case 3:
                imgOpt1.setImageResource(R.drawable.shop1);
                imgOpt2.setImageResource(R.drawable.shop2);
                imgOpt3.setImageResource(R.drawable.shop3);
                break;

            case 4:
                imgOpt1.setImageResource(R.drawable.time1);
                imgOpt2.setImageResource(R.drawable.time2);
                imgOpt3.setImageResource(R.drawable.time3);
                break;
        }

    }


    public void playSoundQuestion(final MediaPlayer q1,final MediaPlayer q2,final MediaPlayer q3,
                                  final MediaPlayer q4,final MediaPlayer q5){


        imgQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (index){
                    case 0:
                        q1.start();
                        break;
                    case 1:
                        q2.start();
                        break;
                    case 2:
                        q3.start();
                        break;
                    case 3:
                        q4.start();
                        break;
                    case 4:
                        q5.start();
                        break;
                }
            }
        });

    }

    public void playSoundOption1(final MediaPlayer mug1,final MediaPlayer smile,final MediaPlayer plane,
                                 final MediaPlayer blue,final MediaPlayer sheep1){


        imgVol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                switch (index){
                    case 0:
                        mug1.start();
                        break;
                    case 1:
                        smile.start();
                        break;
                    case 2:
                        plane.start();
                        break;
                    case 3:
                        blue.start();
                        break;
                    case 4:
                        sheep1.start();
                        break;
                }

            }
        });



    }

    public void playSoundOption2(final MediaPlayer game,final MediaPlayer nest,final MediaPlayer mug2,
                                 final MediaPlayer note,final MediaPlayer lime){

        imgVol2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (index){
                    case 0:
                        game.start();
                        break;
                    case 1:
                        nest.start();
                        break;
                    case 2:
                        mug2.start();
                        break;
                    case 3:
                        note.start();
                        break;
                    case 4:
                        lime.start();
                        break;
                }
            }
        });



    }

    public void playSoundOption3(final MediaPlayer sheep,final MediaPlayer drop1,final MediaPlayer back,
                                 final MediaPlayer drop2,final MediaPlayer rope){


        imgVol3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (index){
                    case 0:
                        sheep.start();
                        break;
                    case 1:
                        drop1.start();
                        break;
                    case 2:
                        back.start();
                        break;
                    case 3:
                        drop2.start();
                        break;
                    case 4:
                        rope.start();
                        break;
                }
            }
        });



    }






}
