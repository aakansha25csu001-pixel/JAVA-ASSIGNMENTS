package week2;

import java.util.Scanner;

         
public class MenuCalculator {
    public static void printMenu(){
        System.out.println("CALCULATORR");
        System.out.println("1.ADD");
         System.out.println("2.SUBTRACT");
         System.out.println("3.MULTIPLY");
          System.out.println("4.DIVIDE");
           System.out.println("0.EXIT");
    }
    public static double calculate(int choice,double a,double b){
        switch (choice){
            case 1:
            return (a+b);
             case 2:
            return (a-b); 
            case 3:
            return (a*b); 
            case 4:
            return (a/b); 
            default :
            return 0;
            

        }
    }
    public static void main (String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER YOUR CHOICE:");
        int choice=sc.nextInt();
          System.out.println("ENTER A:");
        double a=sc.nextDouble();
          System.out.println("ENTER B:");
        double b=sc.nextDouble();
        if (b==0|| choice>4|| choice==0){
            System.out.println("INVALID CHOICE");
        }
        double result=calculate(choice,a,b);
        System.out.println("RESULT:"+result);
    
    }
}
