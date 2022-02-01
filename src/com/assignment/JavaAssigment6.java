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
        /*int num=n,count=0;
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

/*
public static void printVampireNumbers(int quantity){
        int count=0;
        int num=1000;
        while(count<quantity){
            //checks if the number is vampire number
            if(isVampire(num)){
                System.out.println(num);
                count++;
                System.out.println(count);
            }

            num++;
        }
    }

    public static boolean isVampire(int num){
        //checks whether even number of digits are present or not
        if(digitsCondition(num)){
            //counts the number of digits
            int length=countOfDigits(num);
            ArrayList<String> permutations=new ArrayList<String>();
            //finds the permutations of the number
            permutationsOfString(Integer.toString(num), "", permutations);
            String num1,num2;
            for(String str:permutations) {
                //takes two permutations
                num1=str.substring(0, length/2);
                num2=str.substring(length/2);
                //checks if both the numbers(permutations) has trailing zeros or having leading zeros
                if(!((hasLeadingZeros(num1) || hasLeadingZeros(num2)) || (hasTrailingZeros(num1) && hasTrailingZeros(num2))))
                {
                    //System.out.println("hello" + Integer.toString(Integer.parseInt(num1)*Integer.parseInt(num2)));
                    //checks whether their product gives the original number
                    if(Integer.parseInt(num1)*Integer.parseInt(num2)==num)
                        return true;
                }
            }
        }
        return false;
    }

    public static boolean digitsCondition(int num){
        int count=countOfDigits(num);
        if(count>=4 && count%2==0)
            return true;
        else
            return false;
    }

    public static int countOfDigits(int num){
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }

    public static boolean hasTrailingZeros(String num){
        if(Integer.parseInt(num)%10=='0')
            return true;
        return false;
    }

    public static boolean hasLeadingZeros(String num){
        if(num.charAt(0)=='0')
            return true;
        return false;
    }

    public static void permutationsOfString(String num, String ans, ArrayList<String> res){
        if(num.length()==0){
            res.add(ans);
            return;
        }
        //finds the permutations

        for(int i=0;i<num.length();i++){
            char target=num.charAt(i);
            //Till the length of the required permutation adds the number to array list
            String ros = num.substring(0, i) + num.substring(i + 1);
            permutationsOfString(ros, ans+target, res);

        }
    }
 */