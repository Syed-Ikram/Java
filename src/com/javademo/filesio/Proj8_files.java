package com.javademo.filesio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj8_files {
    public static void main(String[] args){
        ArrayList<Rectangle> rectangleArrayList = new ArrayList<>();
        fillArrayList(rectangleArrayList);
        printArrayList(rectangleArrayList);
        writeToFile(rectangleArrayList);

    }
    public static void fillArrayList(ArrayList<Rectangle> rectangleAL){
        Scanner fileRead;
        try{
            fileRead = new Scanner(new File("rectangleData.txt"));
            Rectangle temp;
            double length;
            double width;

            while(fileRead.hasNext()){
                length = fileRead.nextDouble();
                width = fileRead.nextDouble();
                temp = new Rectangle(length,width);
                rectangleAL.add(temp);
            }
            fileRead.close();
        }
        catch (FileNotFoundException exception){
            System.out.println("error in acessing file");
        }
    }

    public static void writeToFile(ArrayList<Rectangle> rectangleAL){
        PrintWriter pw;
        try{
            pw = new PrintWriter("rectangleOutput.txt");
            for(Rectangle r : rectangleAL ){
                pw.println("Length="+r.getLength());
                pw.println("Width="+r.getWidth());
                pw.println("Perimeter="+r.getPerimeter());
                pw.println("Area="+r.getArea()+"\n");
            }
            pw.close();

        }
        catch(FileNotFoundException exception){
            System.out.println("error in acessing file");
        }
    }

    public static void printArrayList(ArrayList<Rectangle> rectangleAL){
        for(Rectangle r : rectangleAL ){
            System.out.println("Length="+r.getLength());
            System.out.println("Width="+r.getWidth());
            System.out.println("Perimeter="+r.getPerimeter());
            System.out.println("Area="+r.getArea()+"\n");
        }
    }
}
