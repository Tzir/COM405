package javaapplication1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 4TZIRK74
 */
public class Heart {
    //Attributes

    private int bpm = 80;
    private int restingRate;

    //Constructor with parameters
    public Heart(int restingRate) {
        restingRate = 80;
        bpm = 80;
    }

    //Methods
    public boolean increaseBPM(int increaseRate) {
        if (bpm < restingRate + 100) {
            bpm = bpm + increaseRate;
            return true;
        }
        return false;
    }

    public void rest() {
        bpm = restingRate;
    }

    public int getBPM() {
        return bpm;
    }

}
