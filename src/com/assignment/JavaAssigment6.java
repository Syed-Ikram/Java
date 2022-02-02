package com.assignment;

import java.util.ArrayList;
import java.util.Arrays;

//2
class One{
    public String name;
    public int rollNo;
    One(String name){
        this.name=name;
    }
    One(int rollNo,String name){
        this(name);
        this.rollNo=rollNo;
    }

}
//3
class Two{
    public String str;
    Two(String str){
        this.str = str;
        System.out.println("creating object of"+str);
    }
}
public class JavaAssigment6 {
    public static boolean ifDigitsOdd(int value){
        if (value <= 1000)
            return true;
        else if(value >= 10000 && value<=100000)
            return true;
        else if(value >=1000000 && value <=10000000)
            return true;
        else
            return false;
        /*int num=value,count=0;
        while (num != 0) {
            // num = num/10
            num /= 10;
            ++count;
        }
        if((count%2) != 0)
            return true;
        else
            return false;
         */
    }
    public static boolean checkTrailingZeros(int num1,int num2){
        if((num1%10)==0 &&(num2%10)==0)
            return true;
        else
            return false;
    }
    public static void main(String[] args){
        //1
        int i, j;
        ArrayList<Integer> vampireNumbers = new ArrayList<>();
        String[] num1, num2;
        int count= 0,limit=10;

        for (i = 10; i < 1000; i++) {
            for (j = 10; j < 1000; j++) {
                if(count == 100)
                    break;
                if(checkTrailingZeros(i,j))
                    continue;
                int value = i * j;
                if(vampireNumbers.contains(value))
                    continue;
                if(ifDigitsOdd(value))
                    continue;
                num1 = String.valueOf(value).split("");
                num2 = (String.valueOf(i) + String.valueOf(j)).split("");
                Arrays.sort(num1);
                Arrays.sort(num2);
                if (Arrays.equals(num1, num2)) {
                    count++;
                    vampireNumbers.add(value);
                    System.out.println(count+"\n"+value + " = " + i + " * " + j);
                }
            }
        }
        //2
        One obj1 = new One("john");
        One obj2 = new One(17,"jack");
        System.out.println(obj1.toString()+"  "+obj2.toString());
        //3
        Two[] arr= new Two[2];
        arr[1] = new Two(" Hi");
        arr[0] = new Two(" Hello");
    }
}

