import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculation c1 = null;

        do {
            System.out.println("\n1 - Сохранить\n2 - Восстановить\n3 - Выход");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Введите значение x");
                    double x = input.nextDouble();
                    c1 = new Calculation(x);
                    c1.calculate();
                    System.out.println(c1.getY());

                    try (ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("rr.txt"))) {
                        oss.writeObject(c1);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    break;

                case 2:
                    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("rr.txt"))) {
                        c1 = (Calculation) ois.readObject();
                        System.out.println("X: " + c1.getX() + ", Y: " + c1.getY());
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    break;

                case 3:
                    System.exit(0);

                default:
                    System.out.println("Такой опции нет");
            }
        } while (true);
    }
}

class Calculation implements Serializable {
    private double x;
    private double y;

    public Calculation(double x) {
        this.x = x;
    }

    public void calculate() {
        this.y = x - Math.sin(x);
    }

    public double getX() { return x; }
    public double getY() { return y; }
}
