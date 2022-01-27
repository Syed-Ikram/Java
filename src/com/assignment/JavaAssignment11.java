package com.assignment;

import java.io.*;

public class JavaAssignment11 {
    public static void main(String[] args) throws IOException,FileNotFoundException{
        BufferedReader br=new BufferedReader(new FileReader(new File("rectangleData.txt")));
        int c = 0;
        while((c = br.read()) != -1){
            char character = (char) c;
            System.out.println(character);
        }

    }
}
