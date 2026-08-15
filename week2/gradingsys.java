package week2;
import java.util.Scanner;
public class gradingsys {
public static void main (String[] args){
   Scanner sc=new Scanner(System.in);
    System.out.print("ENTER YOUR MARKS:");
    int marks=sc.nextInt();
    if(marks>=80 && marks<=100)
        {
        System.out.println("DISTINCTION");
    }
    else if(marks>=70 && marks<=79)
        {
        System.out.println("MERIT");
    }
    else if(marks>=50 && marks<=69)
        {
        System.out.println("PASS");
        }
    else  if(marks>=0 && marks<=49)
        {
        System.out.println("FAIL");
    }
    else
        {
        System.out.println("INVALID");
    }
    }
   }


