package com.example.nomi.tictactoe;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class FirstScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);
        getWindow().getDecorView().setBackgroundColor(Color.CYAN);
    }


    public void twoPlayerClick(View view){
        Intent intent = new Intent(getApplicationContext(), TwoPlayer.class);
        startActivity(intent);
    }
}
