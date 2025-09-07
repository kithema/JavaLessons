import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Введите размер квадратной матрицы: ");
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextInt(100);
            }
        }
        System.out.println("Оригинальная матрица:");
        printMatrix(matrix);
        sortDiagonal(matrix);
        System.out.println("\nМатрица после сортировки главной диагонали:");
        printMatrix(matrix);
    }
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
    private static void sortDiagonal(int[][] matrix) {
        int n = matrix.length; 
        int[] diagonal = new int[n];
        for (int i = 0; i < n; i++) {
            diagonal[i] = matrix[i][i];
        }
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (diagonal[j] < diagonal[minIndex]) {
                    minIndex = j;
                }
            }
            swap(diagonal, i, minIndex);
        }
        for (int i = 0; i < n; i++) {
            matrix[i][i] = diagonal[i];
        }
    }
    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}