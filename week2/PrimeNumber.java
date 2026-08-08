package week2;

import java.util.Scanner;

public class PrimeNumber {

    public static boolean isPrime(int num) {

      
        if (num < 2) {
            return false;
        }

        for (int divisor = 2; divisor * divisor <= num; divisor++) {
            if (num % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        if (isPrime(number)) {
            System.out.println(number + "  prime.");
        } else {
            System.out.println(number + "  not prime.");
        }

    
    }
}
