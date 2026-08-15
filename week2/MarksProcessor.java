import java.util.Scanner;

public class MarksProcessor {
    
  static boolean isValidMark(int mark){
    if(mark>=0 && mark<=100)
        {
        return true;
        }
    else
        {
             return false;
        }
  }

  static void  printResult(int count,int sum,int highest,int failure,int passes,double avg)
  {
      System.out.println("Number of valid marks:"+count);
      System.out.println("Sum of numbers:"+sum);
      System.out.println("Average:"+avg);
      System.out.println("Highest number:"+highest);
      System.out.println("Passes:"+passes);
      System.out.println("Failures:"+failure);
  }
public static void main(String[] args) 
{
    Scanner sc=new Scanner(System.in);
    int mark;
int count=0;
int highest=0;
int failure=0;
int passes=0;
int sum=0;
while (true)
    {
    System.out.println("Enter marks:");
      mark=sc.nextInt();
    if(mark==-1)
    {
        break;
    }
    if (!isValidMark(mark))
    {
      System.out.println("INVALID");
      continue;
    }
count++;
sum=sum+mark;
double avg=sum/count;
if(mark>highest)
{
highest=mark;
 }
if (mark>=50)
{
    passes++;
}
else 
{
    failure++;
}
 
  printResult(count,sum,highest,failure,passes,avg);
}
}
}
