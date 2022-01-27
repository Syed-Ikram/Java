package com.assignment;
//Time and Space Complexity are O(n).
import java.util.Arrays;
import java.util.Scanner;

public class JavaAssignment2 {
    public static int COUNT = 26;
    public static boolean isPangram(String str) {
        if (str == null) {
            return false;
        }
        Boolean[] alphabetMarker = new Boolean[COUNT];
        Arrays.fill(alphabetMarker, false);
        int alphabetIndex = 0;
        str = str.toUpperCase();
        for (int i = 0; i < str.length(); i++) {
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                alphabetIndex = str.charAt(i) - 'A';
                alphabetMarker[alphabetIndex] = true;
            }
        }
        for (boolean index : alphabetMarker) {
            if (!index) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter String :");
        String checkString = keyboard.nextLine();
        if(isPangram(checkString)){
            System.out.println("It is a Panpgram");
        }
        else{
            System.out.println("It is not a Pangram");
        }
    }
}
