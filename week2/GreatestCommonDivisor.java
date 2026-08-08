package week2;

import java.util.Scanner;

public class GreatestCommonDivisor {
    static int gcd(int first,int second){
        first=Math.abs(first);
        second=Math.abs(second);
        while(second!=0){
           int remainder= first%second;
           first=second;
           second=remainder;

        }return first;
    }
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
         int first=sc.nextInt();
  System.out.println("Enter second number:");
         int second=sc.nextInt();
         int result=gcd(first,second);
         System.out.println("Result:"+result);
    }
}
