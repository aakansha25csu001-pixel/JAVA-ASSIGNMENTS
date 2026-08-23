import java.util.Scanner;

class arraystatisticss {
    Scanner sc = new Scanner(System.in);
    int size, arr[];

    public void input() {
        System.out.print("Enter a size: ");
        size = sc.nextInt();

        arr = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public int sum(int[] values) {
        int sum = 0;

        for (int i = 0; i < values.length; i++) {
            sum = sum + values[i];
        }

        return sum;
    }

    public double average(int[] values) {
        if (values.length == 0) {
            return 0;
        } else {
            return (double) sum(values) / values.length;
        }
    }

    public int minimum(int[] values) {
        int minimum = Integer.MAX_VALUE;

        for (int i = 0; i < values.length; i++) {
            if (values[i] < minimum) {
                minimum = values[i];
            }
        }

        return minimum;
    }

    public int maximum(int[] values) {
        int maximum = Integer.MIN_VALUE;

        for (int i = 0; i < values.length; i++) {
            if (maximum < values[i]) {
                maximum = values[i];
            }
        }

        return maximum;
    }

    public int countEven(int[] values) {
        int count = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public void printSignCount(int[] values) {
        int count_pos = 0;
        int count_neg = 0;
        int count_zero = 0;

        for (int i = 0; i < values.length; i++) {

            if (values[i] > 0) {
                count_pos++;
            }

            if (values[i] < 0) {
                count_neg++;
            }

            if (values[i] == 0) {
                count_zero++;
            }
        }

        System.out.println("No of +ve: " + count_pos);
        System.out.println("No of -ve: " + count_neg);
        System.out.println("No of zero: " + count_zero);
    }
}

public class ArrayStatistics {
    public static void main(String[] args) {

        arraystatisticss obj = new arraystatisticss();

        int[] arr = {1, 8, 3, 0, -2, 4, -5};

        int s = obj.sum(arr);
        System.out.println("Sum: " + s);

        int c = obj.countEven(arr);
        System.out.println("No of even: " + c);

        int min = obj.minimum(arr);
        System.out.println("Minimum: " + min);

        int max = obj.maximum(arr);
        System.out.println("Maximum: " + max);

        double avg = obj.average(arr);
        System.out.println("Average: " + avg);

        obj.printSignCount(arr);
    }
}