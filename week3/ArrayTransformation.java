import java.util.Scanner;

public class ArrayTransformation {
       Scanner sc=new Scanner(System.in);
      int values[],newvalues[],size;
      public void input(){
        System.out.println("Enter size:");
        size=sc.nextInt();
        values=new int[size];
       int [] newvalues=new int[values.length];
        for(int i=0;i<size;i++){
            values[i]=sc.nextInt();
        }
      }
      static void reverseinPlace(int [] values){
     int i=0;
     int j=values.length;
      
        while(i<j){
            int temp =values[i];
            values[i]=values[j];
            values[j]=temp;
            i++;
            j--;

        }
       }
       static int[] reversedCopy(int[] values){
        int[] copy=new int [values.length];
        int j=0;
        for(int i=values.length-1;i>=0;i--){
            copy[j]=values[i];
            j++;
        }
        return copy;
       }
       static int removeValue(int [] values,int target){
        int count=0;
        for(int i=0;i<values.length;i++){
            if(values[i]!=target){
                values[count]=values[i];
                count ++;
            }
        }
        return count;
       }
       static int[] runningSum(int[] values){
        int sum =0;
        int [] result=new int[values.length];
        for(int i=0;i<values.length;i++){
            sum=sum+values[i];
            result[i]=sum;
        }
        return result;
       }
      public static void main(String[] args) {

        ArrayTransformation obj = new ArrayTransformation();

        obj.input();
        System.out.println("Original array:");

        for (int i = 0; i < obj.values.length; i++)
        {
            System.out.print(obj.values[i] + " ");
        }

        int[] copy = reversedCopy(obj.values);

        System.out.println("\n\nReversed copy:");

        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }

      


        System.out.println("\n\nAfter reverseInPlace:");

        for (int i = 0; i < obj.values.length; i++) {
            System.out.print(obj.values[i] + " ");
        }

        
        int[] sum = runningSum(obj.values);

        System.out.println("\n\nRunning sum:");

        for (int i = 0; i < sum.length; i++) {
            System.out.print(sum[i] + " ");
        }

      
        System.out.println("\n\nEnter value to remove:");
        int target = obj.sc.nextInt();

        int newSize = removeValue(obj.values, target);

        System.out.println("Array after removing " + target + ":");

        for (int i = 0; i < newSize; i++) {
            System.out.print(obj.values[i] + " ");
        }

        System.out.println("Logical length: " + newSize);
        System.out.println("Original array length: " + obj.values.length);
    }
}