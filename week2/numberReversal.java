package week2;
import java.util.Scanner;
public class numberReversal {
    public static int reverseNumber(int num){
        int reverse=0;
        while(num>0){
            int digit=num%10;
            reverse=reverse*10+digit;
            num=num/10;
        }
            return reverse;
        
    }
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int result=reverseNumber(num);
        System.out.println("Result:"+result);
    }
    
}
