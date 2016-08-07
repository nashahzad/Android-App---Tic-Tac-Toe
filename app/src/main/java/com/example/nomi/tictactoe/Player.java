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

    public void counterIncrement(){
        counter++;
    }

    public boolean isA0() {
        return a0;
    }

    public void setA0(boolean a0) {
        this.a0 = a0;
    }

    public boolean isA1() {
        return a1;
    }

    public void setA1(boolean a1) {
        this.a1 = a1;
    }

    public boolean isA2() {
        return a2;
    }

    public void setA2(boolean a2) {
        this.a2 = a2;
    }

    public boolean isB0() {
        return b0;
    }

    public void setB0(boolean b0) {
        this.b0 = b0;
    }

    public boolean isB1() {
        return b1;
    }

    public void setB1(boolean b1) {
        this.b1 = b1;
    }

    public boolean isB2() {
        return b2;
    }

    public void setB2(boolean b2) {
        this.b2 = b2;
    }

    public boolean isC0() {
        return c0;
    }

    public void setC0(boolean c0) {
        this.c0 = c0;
    }

    public boolean isC1() {
        return c1;
    }

    public void setC1(boolean c1) {
        this.c1 = c1;
    }

    public boolean isC2() {
        return c2;
    }

    public void setC2(boolean c2) {
        this.c2 = c2;
    }
}
