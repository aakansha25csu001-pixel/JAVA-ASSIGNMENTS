import java.util.Scanner;
public class LinearSearchToolkit 
{
      Scanner sc=new Scanner(System.in);
      int values[],size;
      public void input(){
        System.out.println("Enter size:");
        size=sc.nextInt();
        values=new int[size];
        for(int i=0;i<size;i++){
            values[i]=sc.nextInt();
        }
      }
    static boolean contains(int[] values,int target)
    {
      for(int i=0;i<values.length;i++)
    {
         if(values[i]==target)
        {
            return true;
        }
        
    }
            return false;
        }

    static int firstindexof(int [] values,int target){
     for(int i=0;i<values.length;i++){
        if(values[i]==target){
            return i;
        }
     }
        return -1;
     }
 
     static int lastindexof(int[] values,int target){
        for(int i=values.length-1;i>=0;i--){
            if(values[i]==target){
                return i;
            }
        }
        return -1;
     }
     static int countOccurence(int []values,int target){  
        int count=0;
        for(int i=0;i<values.length;i++){
            if(values[i]==target){
                count++;
            }
        }
        return count;
     }

         public static void main(String[] args) {
        LinearSearchToolkit obj=new LinearSearchToolkit();
     
        obj.input();
       
        System.out.println("Enter target:");
        int target=obj.sc.nextInt();
        boolean found=obj.contains(obj.values,target);
        System.out.println("Target available:"+found);
        int first=obj.firstindexof(obj.values,target);
        System.out.println("First index of target:"+first);
        int last =obj.lastindexof(obj.values,target);
         System.out.println("Last index of target:"+last );
         int count=obj.countOccurence(obj.values,target);
          System.out.println("No of targets:"+count);
    }
}

    

