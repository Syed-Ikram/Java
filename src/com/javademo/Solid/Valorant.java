package com.javademo.Solid;

public class Valorant implements VideoGame{
    @Override
    public void useJoystick() {
        System.out.println("use joystick");
    }

    @Override
    public void play() {
        System.out.println("play valo");
    }

    @Override
    public void useMouse() {
        System.out.println("use mouse");
    }
}
