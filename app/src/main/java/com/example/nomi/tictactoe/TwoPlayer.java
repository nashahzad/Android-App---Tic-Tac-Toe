//Nauman Shahzad

package com.example.nomi.tictactoe;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TwoPlayer extends AppCompatActivity {
    Player playerOne;
    Player playerTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        playerOne = new Player();
        playerTwo = new Player();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_player);
        getWindow().getDecorView().setBackgroundColor(Color.CYAN);
    }
}
