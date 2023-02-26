package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class GuessTheNumber extends AppCompatActivity {

    EditText editText;
    Button btn;
    TextView txt;
    TextView guess;
    int num;
    int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess_the_number);
        editText=findViewById(R.id.editText);
        btn=findViewById(R.id.button2);
        txt=findViewById(R.id.txt);
        num=GenerateRandomNumb();
        guess=findViewById(R.id.guess);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1=editText.getText().toString();
                int i = Integer.parseInt(num1);
                counter++;
                guess.setText(Integer.toString(counter));

                if (i==num){
                    txt.setText("Congrats! You guessed it right. The number is "+num);

                }
                if(i<num){
                    txt.setText("Too low! Try again.");


                }
                if(i>num){
                    txt.setText("Too high! Try again");

                }

            }
        });

    }
    public int GenerateRandomNumb(){
        int rand;
        Random rnd = new Random();
        rand=rnd.nextInt(100);
        return rand;

    }

}