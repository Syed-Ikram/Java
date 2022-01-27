package com.assignment;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JavaAssignment3 {
    public static void runSystemCommand(String command) {
        try {
            Process p = Runtime.getRuntime().exec(command);
            // cmd /c to run on command line
            BufferedReader inputStream = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String s = "";
            while ((s = inputStream.readLine()) != null) {
                System.out.println(s);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        String ip;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter command : ");
        ip =in.nextLine();
        runSystemCommand(ip);

    }
}
