import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность массива n");
        int n = input.nextInt();


        int[][] matrix = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.printf("Введите значение %d %d \n", i+1, j+1);
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("Исходная матрица:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        shakerSort(matrix);

        System.out.println("Матрица после сортировки главной диагонали:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void shakerSort(int[][] matrix) {
        int size = Math.min(matrix.length, matrix[0].length);
        int[] diagonal = new int[size];

        for (int i = 0; i < size; i++) {
            diagonal[i] = matrix[i][i];
        }

        int left = 0;
        int right = size - 1;

        while (left <= right) {
            for (int i = right; i > left; i--) {
                if (diagonal[i - 1] > diagonal[i]) {
                    int temp = diagonal[i];
                    diagonal[i] = diagonal[i - 1];
                    diagonal[i - 1] = temp;
                }
            }
            ++left;
            for (int i = left; i < right; ++i) {
                if (diagonal[i] > diagonal[i + 1]) {
                    int temp = diagonal[i + 1];
                    diagonal[i + 1] = diagonal[i];
                    diagonal[i] = temp;
                }
            }
            --right;
        }

        for (int i = 0; i < size; i++) {
            matrix[i][i] = diagonal[i];
        }
    }
}
