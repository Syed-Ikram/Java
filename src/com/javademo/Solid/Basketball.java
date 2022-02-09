package com.javademo.Solid;
//follows LSP
public class Basketball implements OutdoorGame{
    @Override
    public void wearShoes() {
        System.out.println("wear jordans..");
    }

    @Override
    public void play() {
        System.out.println("play basketball");
    }

    public void shootBall(){
        System.out.println("shooting ball ");
    }
    public void passBall(){
        System.out.println("pass ball ");
    }
}
