import java.util.Scanner;

public class numberanalyser {
    static int readNumber(Scanner sc){
  return sc.nextInt();
    }
    static boolean IsEven(int number){
        if(number%2==0){
            return true;
        }else{
            return false;
        }
    }
    static boolean isPositive(int number){
        if(number>0){
            return true;
        }else{
            return false;
        }
    }
static int absoluteValue(int number){
    if(number<0){
        return -number;
    }
    return number;
}
static int countDigit(int number){
    if(number==0){
        return 1;
    }
    int count=0;
    while(number>0){
        count++;
        number=number/10;
    }
    return count;
}
static int sumDigit(int number){
    if(number==0){
        return 0;}
        int sum =0;
        while(number>0){
        sum=sum+(number%10);
        number=number/10;
    }
    return sum;
}
static void printResult(int number,boolean even,boolean positive,int digitcount,int digitsum){
    System.out.println("Positive:"+positive);
     System.out.println("Even:"+even);
      System.out.println("No of digits:"+digitcount);
       System.out.println("Sum of digits:"+digitsum);
}
public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("enter number:");
 int number=readNumber(sc);
 boolean even=IsEven(number);
 int absolute=absoluteValue(number);
 boolean positive=isPositive(number);
 int digitcount=countDigit(absolute);
 int digitsum=sumDigit(absolute);
 printResult(number, even, positive, digitcount, digitsum);   
}
}
