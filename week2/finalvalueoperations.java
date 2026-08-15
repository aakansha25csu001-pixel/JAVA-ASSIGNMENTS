import java.util.Scanner;

public class finalvalueoperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number of operation:");
        int n=sc.nextInt();
        int x=0;
        for(int i=0;i<n;i++){
            String operation=sc.next();
            if(operation.equals("++X") || operation.equals("X++")){
                x++;
            } else{
                x--;
            }
        }
     System.out.println("Final operations:"+x);
}
}
