package com.assignment;

import java.util.*;
import java.io.*;

public class JavaAssignment11 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader fileReader = new BufferedReader(
                new FileReader(new File("javaRead.txt")));
        PrintWriter pw = new PrintWriter("javaWrite.txt");
        Map<Character, Integer> countChar = new HashMap<Character, Integer>();
        int i = 0;
        while ((i = fileReader.read()) != -1) {
            char ch = (char) i;
            if (countChar.containsKey(ch)) {
                countChar.replace(ch, countChar.get(ch) + 1);
            } else {
                countChar.put(ch, 1);
            }
        }
        for (Map.Entry m : countChar.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
            pw.println(m.getKey() + " " + m.getValue());
        }
        pw.close();
        fileReader.close();

    }
}
