package com.javademo.Solid;
//follows LSP
public class VideoGame extends Game{
    public void useJoystick(){
        System.out.println("use joy stick");
    }
    public void useMouse(){
        System.out.println("use Mouse");
    }
}
