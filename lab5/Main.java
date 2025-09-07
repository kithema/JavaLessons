import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите x");
        double x = input.nextDouble();
        System.out.println("Введите a");
        double a = input.nextDouble();
        System.out.println("Введите b");
        double b = input.nextDouble();

        Calculate first = new Calculate(x, a, b);
        Calculate second = new Calculate(x, a, b);
        Calculate third = new Calculate(x, a, b);

        System.out.printf("Значение первого выражения = %f \n", first.Calculate1(x));
        System.out.printf("Значение второго выражения = %f \n", second.Calculate2(a,b));
        System.out.printf("Значение третьего выражения = %d \n", third.Calculate3(x, a, b));

    }
}
class Calculate{
    double x;
    double a;
    double b;
    Calculate(double x, double a, double b){
        this.x = x;
        this.a = a;
        this.b = b;
    }
    public double Calculate1(double x){

        return 3.0 * x + 5.0;
    }
    public double Calculate2(double a, double b){
        if(a - b == 0){
            return -1;
        }
        else {
            return (a + b)/(a - b);
        }
    }
    public int Calculate3(double x, double a, double b){
        if (b == 0){
            return -1;
        }
        int y = (int)((a * x) / b);
        int factorial = 1;
        if (y<0){
            return - 1;
        }
        for(int i = 1;  i<=y; i++){
            factorial = factorial * i;
        }
        return factorial;
    }

}