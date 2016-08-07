//Nauman Shahzad

package com.example.nomi.tictactoe;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class TwoPlayer extends AppCompatActivity {
    Player playerOne;
    Player playerTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        playerOne = new Player();
        playerTwo = new Player();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_player);
        getWindow().getDecorView().setBackgroundResource(R.color.twoPlayerColor);
    }

    public void a0Click(View view){
        ImageButton button = (ImageButton) findViewById(R.id.a0Button);
        button.setImageResource(R.drawable.o);
    }

    public void b0Click(View view){
        ImageButton button = (ImageButton) findViewById(R.id.b0Button);
        button.setImageResource(R.drawable.x);
    }
}
