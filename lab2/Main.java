import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число n");
        double n = input.nextDouble();
        System.out.println("Введите число |x| <= 1");
        double x = input.nextDouble();
        if(Math.abs(x) <= 1)
        {
            for (double i = 0; i < n; i++){
                sum += (Math.pow(-1, i) * Math.pow(x,(2 * i + 1)))/(2 * i + 1);
            }
            System.out.println(sum);
        }
        else{
            System.out.println("Неверно введено x");
        }
    }
}