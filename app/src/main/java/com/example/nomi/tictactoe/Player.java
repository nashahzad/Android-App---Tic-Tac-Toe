package com.example.nomi.tictactoe;

/**
 * Created by Nauman Shahzad on 8/6/2016.
 */
public class Player {
    //LETTERS DENOTE COLUMNS (LEFT TO RIGHT)
    //NUMBERS DENOTE ROWS (TOP TO BOTTOM)
    private boolean a0 = false;
    private boolean a1 = false;
    private boolean a2 = false;

    private boolean b0 = false;
    private boolean b1 = false;
    private boolean b2 = false;

    private boolean c0 = false;
    private boolean c1 = false;
    private boolean c2 = false;

    //counter variable to see how many tiles player has
    private int counter = 0;

    public Player(){}


    public boolean didPlayerWin(){

        //Only check for possible victory if player has at least 3 tiles down
        if(counter >= 3) {
            //First checking row by row
            if (a0 && b0 && c0) {
                return true;
            } else if (a1 && b1 && c1) {
                return true;
            } else if (a2 && b2 && c2) {
                return true;
            }

            //Then check columns
            else if (a0 && a1 && a2) {
                return true;
            } else if (b0 && b1 && b2) {
                return true;
            } else if(c0 && c1 && c2){
                return true;
            }

            //Diagnols
            else if(a0 && b1 && c2){
                return true;
            } else if(c0 && b1 && a2){
                return true;
            }
        }

        return false;
    }

    public void reset(){
        counter = 0;

        a0 = false;
        a1 = false;
        a2 = false;

        b0 = false;
        b1 = false;
        b2 = false;

        c0 = false;
        c1 = false;
        c2 = false;
    }

    public void isA0(){
        a0 = true;
        counter++;
    }

    public void isA1(){
        a1 = true;
        counter++;
    }

    public void isA2(){
        a2 = true;
        counter++;
    }

    public void isB0(){
        b0 = true;
        counter++;
    }

    public void isB1(){
        b1 = true;
        counter++;
    }

    public void isB2(){
        b2 = true;
        counter++;
    }

    public void isC0(){
        c0 = true;
        counter++;
    }

    public void isC1(){
        c1 = true;
        counter++;
    }

    public void isC2(){
        c2 = true;
        counter++;
    }
}
