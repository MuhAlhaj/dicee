package com.alhaj.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button rollButton;
        rollButton =  findViewById(R.id.btn_roll);
        final ImageView leftDice =  findViewById(R.id.img_leftDice);
        final ImageView rightDice = findViewById(R.id.img_rightDice);

        final int []diceArray = {R.drawable.dice1,R.drawable.dice2,R.drawable.dice3,
                R.drawable.dice4,R.drawable.dice5,R.drawable.dice6};

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                Random randomNumberGerrator = new Random();
                int number = randomNumberGerrator.nextInt(6);
                int number2 = randomNumberGerrator.nextInt(6);

                leftDice.setImageResource(diceArray[number]);
                rightDice.setImageResource(diceArray[number2]);

            }
        });



    }

}
