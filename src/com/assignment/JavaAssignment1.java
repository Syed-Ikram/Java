package com.assignment;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.regex.*;

public class JavaAssignment1 {
    public static boolean findFile(File dirPath,String findFile){
        File filesList[] = dirPath.listFiles();
        boolean flag = false;
        for(File file : filesList) {
            if(file.isFile()) {
                flag = checkFileName(file,findFile);
                if(flag == true){
                    System.out.println("Path is " + file.getAbsolutePath());
                    return flag;
                }
            } else {
                return findFile(file,findFile);
            }
        }
        return flag;
        //System.out.println("file not found !");
    }
    public static boolean checkFileName(File file,String findFile){
        return Pattern.matches(file.getName(),findFile);
    }
    public static void main(String args[]) throws IOException {
        //Creating a File object for directory
        Scanner keyboard = new Scanner(System.in);
        File file = new File("C:\\Users\\syedk\\Downloads");
        String findFile;
        System.out.println("enter file to be found:");
        findFile = keyboard.nextLine();
        boolean check = findFile(file ,findFile);
        if(check)
            System.out.println("file found !");
        else
            System.out.println("file not found !");

    }
}
