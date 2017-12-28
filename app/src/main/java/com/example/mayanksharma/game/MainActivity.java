package com.example.mayanksharma.game;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollbutton;
        rollbutton =(Button)findViewById(R.id.Rollbutton);
        final ImageView rightdice =(ImageView) findViewById(R.id.rightdice);
        final ImageView leftdice =(ImageView) findViewById(R.id.leftdice);
        final int[] array ={R.drawable.dice_1,
                            R.drawable.dice_2,
                            R.drawable.dice_3,
                            R.drawable.dice_4,
                            R.drawable.dice_5,
                            R.drawable.dice_6,};
        rollbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee","Button has pressed");
                Random rand = new Random();
                int number = rand.nextInt(6);
                Log.d("Dice","The random no is ="+number);
                leftdice.setImageResource(array[number]);
                number = rand.nextInt(6);
                rightdice.setImageResource(array[number]);


            }
        });

    }
}
