import java.util.Random;

public class Task4Lab2 {
    public static void main(String[] args) {
        int n = 4;
        int[][] A = new int[n][n];

        fillMatrixWithRandomValues(A);

        System.out.println("Матрица A:");
        printMatrix(A);

        // Находим количество положительных элементов главной диагонали
        int positiveCount = countPositiveDiagonalElements(A);
        System.out.println("\nКоличество положительных элементов главной диагонали: " + positiveCount);

        // Умножаем побочную диагональ на количество положительных элементов
        multiplySecondaryDiagonal(A, positiveCount);

        System.out.println("\nМатрица A после изменения побочной диагонали:");
        printMatrix(A);
    }

    public static void fillMatrixWithRandomValues(int[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(21) - 10; // rand от -10 до 10
            }
        }
    }

    public static int countPositiveDiagonalElements(int[][] matrix) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > 0) {
                count++;
            }
        }
        return count;
    }

    public static void multiplySecondaryDiagonal(int[][] matrix, int multiplier) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            matrix[i][n - 1 - i] *= multiplier;
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%4d", value);
            }
            System.out.println();
        }
    }
}
