//Nauman Shahzad

package com.example.nomi.tictactoe;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class TwoPlayer extends AppCompatActivity {
    Player playerOne;
    Player playerTwo;

    //counter to count number of tiles taken
    short counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        playerOne = new Player();
        playerTwo = new Player();

        counter = 0;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_player);
        getWindow().getDecorView().setBackgroundResource(R.color.twoPlayerColor);
    }

    public void disableAllButtons(){
        ImageButton imageButton;

        imageButton = (ImageButton) findViewById(R.id.a0Button);
        imageButton.setEnabled(false);
        imageButton = (ImageButton) findViewById(R.id.a1Button);
        imageButton.setEnabled(false);
        imageButton = (ImageButton) findViewById(R.id.a2Button);
        imageButton.setEnabled(false);

        imageButton = (ImageButton) findViewById(R.id.b0Button);
        imageButton.setEnabled(false);
        imageButton = (ImageButton) findViewById(R.id.b1Button);
        imageButton.setEnabled(false);
        imageButton = (ImageButton) findViewById(R.id.b2Button);
        imageButton.setEnabled(false);

        imageButton = (ImageButton) findViewById(R.id.c0Button);
        imageButton.setEnabled(false);
        imageButton = (ImageButton) findViewById(R.id.c1Button);
        imageButton.setEnabled(false);
        imageButton = (ImageButton) findViewById(R.id.c2Button);
        imageButton.setEnabled(false);

        Button button = (Button) findViewById(R.id.resetButton);
        button.setEnabled(true);
        button.setText("RESET?");
    }

    public void checkForWinner(){
        if(playerOne.didPlayerWin()){
            TextView textView = (TextView) findViewById(R.id.textView2);
            textView.setText("Player One Won!!!!");
            disableAllButtons();
        }

        else if(playerTwo.didPlayerWin()){
            TextView textView = (TextView) findViewById(R.id.textView2);
            textView.setText("Player Two Won!!!!");
            disableAllButtons();
        }

        else if(counter == 9){
            TextView textView = (TextView) findViewById(R.id.textView2);
            textView.setText("Tie!!!");

            Button button = (Button) findViewById(R.id.resetButton);
            button.setEnabled(true);
            button.setText("RESET?");
        }

        else if(counter % 2 == 1){
            TextView textView = (TextView) findViewById(R.id.textView2);
            textView.setText("Player Two's Turn");
        }

        else{
            TextView textView = (TextView) findViewById(R.id.textView2);
            textView.setText("Player One's Turn");
        }
    }

    public void a0Click(View view){
        counter++;
        System.out.println("counter: " + counter);
        //Player one's turn
        if(counter % 2 == 1){
            ImageButton button = (ImageButton) findViewById(R.id.a0Button);
            button.setImageResource(R.drawable.o);
            button.setEnabled(false);

            playerOne.isA0();

            checkForWinner();
        }

        else if(counter % 2 == 0){
            ImageButton button = (ImageButton) findViewById(R.id.a0Button);
            button.setImageResource(R.drawable.x);
            button.setEnabled(false);

            playerTwo.isA0();

            checkForWinner();
        }
    }

    public void b0Click(View view){
        counter++;
        System.out.println("counter: " + counter);
        //Player one's turn
        if(counter % 2 == 1){
            ImageButton button = (ImageButton) findViewById(R.id.b0Button);
            button.setImageResource(R.drawable.o);
            button.setEnabled(false);

            playerOne.isB0();

            checkForWinner();
        }

        else if(counter % 2 == 0){
            ImageButton button = (ImageButton) findViewById(R.id.b0Button);
            button.setImageResource(R.drawable.x);
            button.setEnabled(false);

            playerTwo.isB0();

            checkForWinner();
        }
    }

    public void c0Click(View view){
        counter++;
        System.out.println("counter: " + counter);
        //Player one's turn
        if(counter % 2 == 1){
            ImageButton button = (ImageButton) findViewById(R.id.c0Button);
            button.setImageResource(R.drawable.o);
            button.setEnabled(false);

            playerOne.isC0();

            checkForWinner();
        }

        else if(counter % 2 == 0){
            ImageButton button = (ImageButton) findViewById(R.id.c0Button);
            button.setImageResource(R.drawable.x);
            button.setEnabled(false);

            playerTwo.isC0();

            checkForWinner();
        }
    }

    public void a1Click(View view){
        counter++;
        System.out.println("counter: " + counter);
        //Player one's turn
        if(counter % 2 == 1){
            ImageButton button = (ImageButton) findViewById(R.id.a1Button);
            button.setImageResource(R.drawable.o);
            button.setEnabled(false);

            playerOne.isA1();

            checkForWinner();
        }

        else if(counter % 2 == 0){
            ImageButton button = (ImageButton) findViewById(R.id.a1Button);
            button.setImageResource(R.drawable.x);
            button.setEnabled(false);

            playerTwo.isA1();

            checkForWinner();
        }
    }

    public void b1Click(View view){
        counter++;
        System.out.println("counter: " + counter);
        //Player one's turn
        if(counter % 2 == 1){
            ImageButton button = (ImageButton) findViewById(R.id.b1Button);
            button.setImageResource(R.drawable.o);
            button.setEnabled(false);

            playerOne.isB1();

            checkForWinner();
        }

        else if(counter % 2 == 0){
            ImageButton button = (ImageButton) findViewById(R.id.b1Button);
            button.setImageResource(R.drawable.x);
            button.setEnabled(false);

            playerTwo.isB1();

            checkForWinner();
        }
    }

    public void c1Click(View view){
        counter++;
        System.out.println("counter: " + counter);
        //Player one's turn
        if(counter % 2 == 1){
            ImageButton button = (ImageButton) findViewById(R.id.c1Button);
            button.setImageResource(R.drawable.o);
            button.setEnabled(false);

            playerOne.isC1();

            checkForWinner();
        }

        else if(counter % 2 == 0){
            ImageButton button = (ImageButton) findViewById(R.id.c1Button);
            button.setImageResource(R.drawable.x);
            button.setEnabled(false);

            playerTwo.isC1();

            checkForWinner();
        }
    }

    public void a2Click(View view){
        counter++;
        System.out.println("counter: " + counter);
        //Player one's turn
        if(counter % 2 == 1){
            ImageButton button = (ImageButton) findViewById(R.id.a2Button);
            button.setImageResource(R.drawable.o);
            button.setEnabled(false);

            playerOne.isA2();

            checkForWinner();
        }

        else if(counter % 2 == 0){
            ImageButton button = (ImageButton) findViewById(R.id.a2Button);
            button.setImageResource(R.drawable.x);
            button.setEnabled(false);

            playerTwo.isA2();

            checkForWinner();
        }
    }

    public void b2Click(View view){
        counter++;
        System.out.println("counter: " + counter);
        //Player one's turn
        if(counter % 2 == 1){
            ImageButton button = (ImageButton) findViewById(R.id.b2Button);
            button.setImageResource(R.drawable.o);
            button.setEnabled(false);

            playerOne.isB2();

            checkForWinner();
        }

        else if(counter % 2 == 0){
            ImageButton button = (ImageButton) findViewById(R.id.b2Button);
            button.setImageResource(R.drawable.x);
            button.setEnabled(false);

            playerTwo.isB2();

            checkForWinner();
        }
    }

    public void c2Click(View view){
        counter++;
        System.out.println("counter: " + counter);
        //Player one's turn
        if(counter % 2 == 1){
            ImageButton button = (ImageButton) findViewById(R.id.c2Button);
            button.setImageResource(R.drawable.o);
            button.setEnabled(false);

            playerOne.isC2();

            checkForWinner();
        }

        else if(counter % 2 == 0){
            ImageButton button = (ImageButton) findViewById(R.id.c2Button);
            button.setImageResource(R.drawable.x);
            button.setEnabled(false);

            playerTwo.isC2();

            checkForWinner();
        }
    }

    public void resetClick(View view){
        Intent intent = getIntent();
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        finish();
        startActivity(intent);
    }
}
