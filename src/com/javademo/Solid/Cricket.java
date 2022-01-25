package com.javademo.Solid;
//follows OCP
public class Cricket extends Sport{
    @Override
    public void play() {
        System.out.println("bowl a bouncer");
    }
}
