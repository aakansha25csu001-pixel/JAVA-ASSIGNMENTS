
    import java.util.Scanner;

public class BitMaskUtility {

    
    static boolean isBitSet(int number, int position) {
        return (number & (1 << position)) != 0;
    }

   
    static int setBit(int number, int position) {
        return number | (1 << position);
    }

   
    static int clearBit(int number, int position) {
        return number & ~(1 << position);
    }

    // Toggle a bit (0 -> 1, 1 -> 0)
    static int toggleBit(int number, int position) {
        return number ^ (1 << position);
    }

    // Convert integer to 32-bit binary
    static String toBinary32(int number) {
        return String.format("%32s", Integer.toBinaryString(number)).replace(' ', '0');
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== BIT MASK UTILITY =====");
            System.out.println("1. Check Bit");
            System.out.println("2. Set Bit");
            System.out.println("3. Clear Bit");
            System.out.println("4. Toggle Bit");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exiting...");
                break;
            }

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice!");
                continue;
            }

            System.out.print("Enter number: ");
            int number = sc.nextInt();

            System.out.print("Enter bit position (0-31): ");
            int position = sc.nextInt();

            // Validate bit position
            if (position < 0 || position > 31) {
                System.out.println("Invalid bit position! Enter a value from 0 to 31.");
                continue;
            }

            System.out.println("\nBefore:");
            System.out.println("Decimal: " + number);
            System.out.println("Binary : " + toBinary32(number));

            int result = number;

            switch (choice) {

                case 1:
                    System.out.println("Bit " + position + " is "
                            + (isBitSet(number, position) ? "SET (1)" : "CLEAR (0)"));
                    break;

                case 2:
                    result = setBit(number, position);
                    System.out.println("\nAfter Set Bit:");
                    System.out.println("Decimal: " + result);
                    System.out.println("Binary : " + toBinary32(result));
                    break;

                case 3:
                    result = clearBit(number, position);
                    System.out.println("\nAfter Clear Bit:");
                    System.out.println("Decimal: " + result);
                    System.out.println("Binary : " + toBinary32(result));
                    break;

                case 4:
                    result = toggleBit(number, position);
                    System.out.println("After Toggle Bit:");
                    System.out.println("Decimal: " + result);
                    System.out.println("Binary : " + toBinary32(result));
                    break;
            }
        }

        sc.close();
    }
}

