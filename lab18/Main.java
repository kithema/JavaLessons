import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void Sort(int[] A, SortType lambda) {
        for (int i = 0; i < A.length - 1; i++) {
            int pos = i;
            for (int j = i + 1; j < A.length; j++) {
                if (lambda.swap(A[j], A[pos])) {
                    pos = j;
                }
            }
            int temp = A[i];
            A[i] = A[pos];
            A[pos] = temp;
        }
        System.out.println("Конечный массив:\n" + Arrays.toString(A));
    }
    public static void main(String[] args) {
        SortType upward = (x, y) -> x<y;
        SortType downward = (x, y) -> x>y;

        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность массива:");
        int[] A = new int[input.nextInt()];
        for(int i = 0;i < A.length;i++){
            A[i] = (int)(Math.random() * 101);
        }
        System.out.println(Arrays.toString(A));

        Sort(A, upward);
        Sort(A, downward);

    }
}
interface SortType {
    boolean swap(int x, int y);
}
