import java.util.Random;

public class Task3Lab2 {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 5;
        int[][] matrix = new int[rows][cols];
        
        fillMatrixWithRandomValues(matrix);
        
        System.out.println("Матрица:");
        printMatrix(matrix);
        
        int[] B = buildMaxIndexVector(matrix);
        
        System.out.println("\nВектор B (индексы максимальных значений по строкам):");
        printVector(B);
    }
    
    public static void fillMatrixWithRandomValues(int[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(100);  // rand от 0 до 99
            }
        }
    }
    
    public static int[] buildMaxIndexVector(int[][] matrix) {
        int[] B = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int maxIndex = 0;
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] > matrix[i][maxIndex]) {
                    maxIndex = j;
                }
            }
            B[i] = maxIndex;
        }
        return B;
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%4d", value);
            }
            System.out.println();
        }
    }
    
    public static void printVector(int[] vector) {
        for (int value : vector) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
