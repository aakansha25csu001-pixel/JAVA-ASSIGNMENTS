import java.util.Scanner;

public class MatrixOperations {

    Scanner sc = new Scanner(System.in);


    static int[][] inputMatrix(Scanner sc) {

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns: ");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        return matrix;
    }

    // Row sums
    static int[] rowSums(int[][] matrix) {

        int[] sum = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                sum[i] = sum[i] + matrix[i][j];
            }
        }

        return sum;
    }

    static int[] columnSums(int[][] matrix) {

        int[] sum = new int[matrix[0].length];

        for (int j = 0; j < matrix[0].length; j++) {

            for (int i = 0; i < matrix.length; i++) {
                sum[j] = sum[j] + matrix[i][j];
            }
        }

        return sum;
    }

  
    static int[][] add(int[][] first, int[][] second) {

        if (first.length != second.length ||
            first[0].length != second[0].length) {

            System.out.println("Matrices cannot be added.");
            return null;
        }

        int[][] result = new int[first.length][first[0].length];

        for (int i = 0; i < first.length; i++) {

            for (int j = 0; j < first[i].length; j++) {
                result[i][j] = first[i][j] + second[i][j];
            }
        }

        return result;
    }

  
    static int[][] transpose(int[][] matrix) {

        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] result = new int[columns][rows];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    
    static int[][] multiply(int[][] first, int[][] second) {

        if (first[0].length != second.length) {

            System.out.println("Matrices cannot be multiplied.");
            return null;
        }

        int[][] result =
                new int[first.length][second[0].length];

        for (int i = 0; i < first.length; i++) {

            for (int j = 0; j < second[0].length; j++) {

                for (int k = 0; k < second.length; k++) {

                    result[i][j] =
                            result[i][j] +
                            first[i][k] * second[k][j];
                }
            }
        }

        return result;
    }

   
    static void printMatrix(int[][] matrix) {

        if (matrix == null) {
            return;
        }

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      
        System.out.println("Enter first matrix:");
        int[][] first = inputMatrix(sc);

        System.out.println("\nFirst Matrix:");
        printMatrix(first);

        
        int[] rows = rowSums(first);

        System.out.println("\nRow sums:");
        for (int i = 0; i < rows.length; i++) {
            System.out.print(rows[i] + " ");
        }

        // Column sums
        int[] columns = columnSums(first);

        System.out.println("\n\nColumn sums:");
        for (int i = 0; i < columns.length; i++) {
            System.out.print(columns[i] + " ");
        }

        
        int[][] trans = transpose(first);

        System.out.println("\n\nTranspose:");
        printMatrix(trans);

        
        System.out.println("\nEnter second matrix:");
        int[][] second = inputMatrix(sc);

        // Addition
        int[][] sum = add(first, second);

        System.out.println("\nAddition:");
        printMatrix(sum);

        
        int[][] product = multiply(first, second);

        System.out.println("\nMultiplication:");
        printMatrix(product);

        sc.close();
    }
}
    

