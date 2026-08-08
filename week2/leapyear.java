
package  week2;
import java.util.Scanner;
public class leapyear{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a year:");
        int year =sc.nextInt();
        boolean leap=true;
        if(year%400==0||(year%4==0 && year%100!=0))
            {
            leap=true;
        } 
    else {
        leap=false;
    }
 System.out.println ("Leap Year:"+leap);
}
}

