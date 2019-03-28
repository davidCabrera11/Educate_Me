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

public class g1ReceptionActivity extends AppCompatActivity {


    TextView textQuestionG1_Part1,textQuestionG1_Part2,textQuestionG1_Part3;

    Button btnRestart;

    ImageButton imgBtnPictureG1,imgBtnQuestion;

    ImageView imgPictureG1;

    static final String[] questionG1Part1 ={"Walk","The","The","Ducks","Stop"};

    static final String[] questionG1Part2 ={"the","fox","rat","can","the"};

    static final String[] questionG1Part3 ={"dog.","ran.","sits.","fly.","car!"};

    static final String[] answersG1 = {"dog.","fox","rat","Ducks","car!"};

    private int index = 0;
    private int correctAnswers = 0;
    private int incorrectAnswers = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g1_reception);


        textQuestionG1_Part1 = findViewById(R.id.textQuestionG1_Part1);
        textQuestionG1_Part2 = findViewById(R.id.textQuestionG1_Part2);
        textQuestionG1_Part3 = findViewById(R.id.textQuestionG1_Part3);

        imgBtnPictureG1 = findViewById(R.id.imageButtonPictureG1);
        imgBtnQuestion = findViewById(R.id.imageButtonQuestionG1);

        imgPictureG1 = findViewById(R.id.imagePicG1);
        btnRestart = findViewById(R.id.buttonRestartG1);


        //Gets Sound from folder raw in resources

        //Sounds of question Image
        final MediaPlayer listen_dog = MediaPlayer.create(this,R.raw.listen_dog_g1_reception);
        final MediaPlayer listen_fox = MediaPlayer.create(this,R.raw.listen_fox_g1_reception);
        final MediaPlayer listen_rat = MediaPlayer.create(this,R.raw.listen_rat_g1_reception);
        final MediaPlayer listen_ducks = MediaPlayer.create(this,R.raw.listen_ducks_g1_reception);
        final MediaPlayer listen_car = MediaPlayer.create(this,R.raw.listen_car_g1_reception);

        //Sound related to the question
        final MediaPlayer dog = MediaPlayer.create(this,R.raw.dog_g1_reception);
        final MediaPlayer fox = MediaPlayer.create(this,R.raw.fox_g1_reception);
        final MediaPlayer rat = MediaPlayer.create(this,R.raw.rat_g1_reception);
        final MediaPlayer ducks = MediaPlayer.create(this,R.raw.ducks_g1_reception);
        final MediaPlayer car = MediaPlayer.create(this,R.raw.car_g1_reception);


        //set text parts to the first question
        textQuestionG1_Part1.setText(questionG1Part1[index]);
        textQuestionG1_Part2.setText(questionG1Part2[index]);
        textQuestionG1_Part3.setText(questionG1Part3[index]);



        textQuestionG1_Part1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              //  Toast.makeText(getApplicationContext(), "Part1", Toast.LENGTH_SHORT).show();

                if (textQuestionG1_Part1.getText()==answersG1[index]){



                    if (index+1 != answersG1.length){

                        Toast.makeText(getApplicationContext(), "Correct Answer", Toast.LENGTH_SHORT).show();
                        index++;
                        textQuestionG1_Part1.setText(questionG1Part1[index]);
                        textQuestionG1_Part2.setText(questionG1Part2[index]);
                        textQuestionG1_Part3.setText(questionG1Part3[index]);
                        changeImage(index);
                        playPicture(listen_dog,listen_fox,listen_rat,listen_ducks,listen_car);
                        playQuesition(dog,fox,rat,ducks,car);

                    }else {

                        Toast.makeText(getApplicationContext(), "You have solved them all", Toast.LENGTH_SHORT).show();

                    }
                }else{

                    Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();
                }
            }
        });

        textQuestionG1_Part2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Toast.makeText(getApplicationContext(), "Part2", Toast.LENGTH_SHORT).show();

                if (textQuestionG1_Part2.getText()==answersG1[index]){

                    if (index+1 != answersG1.length){

                        Toast.makeText(getApplicationContext(), "Correct Answer", Toast.LENGTH_SHORT).show();
                        index++;
                        textQuestionG1_Part1.setText(questionG1Part1[index]);
                        textQuestionG1_Part2.setText(questionG1Part2[index]);
                        textQuestionG1_Part3.setText(questionG1Part3[index]);
                        changeImage(index);
                        playPicture(listen_dog,listen_fox,listen_rat,listen_ducks,listen_car);
                        playQuesition(dog,fox,rat,ducks,car);

                    }else {

                        Toast.makeText(getApplicationContext(), "You have solved them all", Toast.LENGTH_SHORT).show();
                    }
                }else{

                    Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();

                }
            }
        });

        textQuestionG1_Part3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Toast.makeText(getApplicationContext(), "Part3", Toast.LENGTH_SHORT).show();

                if (textQuestionG1_Part3.getText()==answersG1[index]){

                    if (index+1 != answersG1.length){

                        Toast.makeText(getApplicationContext(), "Correct Answer", Toast.LENGTH_SHORT).show();
                        index++;
                        textQuestionG1_Part1.setText(questionG1Part1[index]);
                        textQuestionG1_Part2.setText(questionG1Part2[index]);
                        textQuestionG1_Part3.setText(questionG1Part3[index]);
                        changeImage(index);
                        playPicture(listen_dog,listen_fox,listen_rat,listen_ducks,listen_car);
                        playQuesition(dog,fox,rat,ducks,car);

                    }else {

                        Toast.makeText(getApplicationContext(), "You have solved them all", Toast.LENGTH_SHORT).show();
                    }
                }else{

                    Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();

                }
            }
        });

        imgBtnPictureG1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set media player & play sound
                listen_dog.start();
            }
        });

        //Plays the sound related to the question
        imgBtnQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dog.start();
            }
        });


        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index = 0;
                textQuestionG1_Part1.setText(questionG1Part1[index]);
                textQuestionG1_Part2.setText(questionG1Part2[index]);
                textQuestionG1_Part3.setText(questionG1Part3[index]);
                changeImage(index);


            }
        });

    }



    //Changes image related to the question
    public void changeImage(int index){



        switch (index){
            case 0:
                imgPictureG1.setImageResource(R.drawable.dog_g1);
                break;
            case 1:
                imgPictureG1.setImageResource(R.drawable.fox_g1);
                break;
            case 2:
                imgPictureG1.setImageResource(R.drawable.rat_g1);
                break;
            case 3:
                imgPictureG1.setImageResource(R.drawable.duck_g1);
                break;
            case 4:
                imgPictureG1.setImageResource(R.drawable.car_g1);
                break;
        }

    }

    //Plays question related to the image
    public void playPicture (final MediaPlayer listen_dog, final MediaPlayer listen_fox,
                             final MediaPlayer listen_rat, final MediaPlayer listen_ducks, final MediaPlayer listen_car){


        imgBtnPictureG1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (index){
                    case 0:
                        listen_dog.start();
                        break;
                    case 1:
                        listen_fox.start();
                        break;
                    case 2:
                        listen_rat.start();
                        break;
                    case 3:
                        listen_ducks.start();
                        break;
                    case 4:
                        listen_car.start();
                        break;
                }
            }
        });
    }

    //Plays question related to the question
    public void playQuesition(final MediaPlayer dog,final MediaPlayer fox,
                              final MediaPlayer rat, final MediaPlayer ducks, final MediaPlayer car){

        imgBtnQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (index){
                    case 0:
                        dog.start();
                        break;
                    case 1:
                        fox.start();
                        break;
                    case 2:
                        rat.start();
                        break;
                    case 3:
                        ducks.start();
                        break;
                    case 4:
                        car.start();
                        break;
                }

            }
        });

    }

}
