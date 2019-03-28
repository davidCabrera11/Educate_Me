package com.example.educate_me;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

public class b1ReceptionActivity extends AppCompatActivity {


    GridView gridAlphabet;

    TextView textQuestion, textCorrect, textIncorrect;

    ImageButton imgBtnVolume;

    Button btnRestart;




    static final String[] alphabetLowerCase = new String[]{

            "a","b","c","d","e",
            "f","g","h","i","j",
            "k","l","m","n","o",
            "p","q","r","s","t",
            "u","v","w","x","y",
            "z"
    };

    static final String[] questionsAlphabet = new String[]{
            "Find the letter e",
            "Find the letter x",
            "Find the letter j",
            "Find the letter s",
            "Find the letter c"
    };
    static final String[] answerAlphabet = new String[]{"e","x","j","s","c"};

    private int index = 0;
    private int correctAnswers = 0;
    private int incorrectAnswers = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b1_reception);


        gridAlphabet = findViewById(R.id.gridAlphabet);

        textQuestion = findViewById(R.id.textQuestionB1Reception);

        textQuestion.setText(questionsAlphabet[index]);

        textCorrect = findViewById(R.id.textCorrectB1Reception);

        textIncorrect = findViewById(R.id.textIncorrectB1Reception);

        imgBtnVolume =findViewById(R.id.imageButtonVolume);

        btnRestart = findViewById(R.id.buttonRestart);

        //Gets Sound from folder raw in resources
        final MediaPlayer letter_e = MediaPlayer.create(this,R.raw.letter_e_b1_reception);
        final MediaPlayer letter_x = MediaPlayer.create(this,R.raw.letter_x_b1_reception);
        final MediaPlayer letter_j = MediaPlayer.create(this,R.raw.letter_j_b1_reception);
        final MediaPlayer letter_s = MediaPlayer.create(this,R.raw.letter_s_b1_reception);
        final MediaPlayer letter_c = MediaPlayer.create(this,R.raw.letter_c_b1_reception);



        //Plays first letter sound
        imgBtnVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                letter_e.start();

            }
        });


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, alphabetLowerCase);
        gridAlphabet.setAdapter(adapter);

        //When a letter is clicked on the grid
        gridAlphabet.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String strSelectedItem = parent.getItemAtPosition(position).toString();


                //Checks if selected item on the grid is equal to the
                // answer of the question
                if(strSelectedItem == answerAlphabet[index]){



                    if(index+1!=questionsAlphabet.length){

                        playSound(imgBtnVolume,letter_e,letter_x,letter_j,letter_s,letter_c);

                        index++;
                        textQuestion.setText(questionsAlphabet[index]);

                        if (correctAnswers<=questionsAlphabet.length){
                            correctAnswers++;
                            Toast toast = Toast.makeText(getApplicationContext(),"Correct Answer",Toast.LENGTH_SHORT);
                            toast.setGravity(Gravity.TOP,10,20);
                            toast.show();
                            textCorrect.setText("Correct: "+correctAnswers);
                        }

                    }else{


                        correctAnswers++;
                        if (correctAnswers<=questionsAlphabet.length){
                            textCorrect.setText("Correct: "+correctAnswers);
                            Toast.makeText(getApplicationContext(), "You Solved them all", Toast.LENGTH_LONG).show();

                        }
                    }

                }else if(strSelectedItem != answerAlphabet[index]){

                    incorrectAnswers++;
                    textIncorrect.setText("Incorrect: "+incorrectAnswers);


                    Toast toast= Toast.makeText(getApplicationContext(),"Wrong Answer",Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.TOP,10,20);
                    toast.show();

                }


            }
        });



        //Restart Button

        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                index = 0;
                correctAnswers = 0;
                textCorrect.setText("Correct: "+correctAnswers);
                incorrectAnswers = 0;
                textIncorrect.setText("Incorrect: "+incorrectAnswers);
                textQuestion.setText(questionsAlphabet[index]);


            }
        });




    }


    public void playSound(ImageButton imgVolume,final MediaPlayer letterE, final MediaPlayer letterX,
                          final MediaPlayer letterJ, final MediaPlayer letters, final MediaPlayer letterC){



        imgVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (index){

                    case 0:
                        letterE.start();
                        break;

                    case 1:
                        letterX.start();
                        break;
                    case 2:
                        letterJ.start();
                        break;
                    case 3:
                        letters.start();
                        break;
                    case 4:
                        letterC.start();

                }



            }
        });




    }




}
