import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee[] employees = {
                new Employee("Челов К.С.", "Уборщик", 2001, 13000),
                new Employee("Шариков Г.Ф.", "Режиссер", 2011, 14000),
                new Employee("Мышков П.И.", "Сценарист", 2009, 23000),
                new Employee("Лопостев В.Ж.", "Актер", 2010, 19000),
                new Employee("Ломов Б.М.", "Актер", 2001, 19000),
        };

        System.out.println("1 - список работников, зарплата которых больше заданной\n2 -  список работников, занимающих заданную должность");
        int choice = input.nextInt();
        switch (choice){
            case 1:
                System.out.println("Введите зарплату");
                int sslary = input.nextInt();
                for(int i = 0; i < employees.length; i++ ){
                    if(employees[i].salary > sslary){
                        employees[i].getName();
                    }
                }
                break;
            case 2:
                System.out.println("Введите дожность");
                input.nextLine();
                String jobe = input.nextLine();
                for(int j = 0; j < employees.length; j++ ){
                    if(employees[j].job.equals(jobe)){
                        employees[j].getName();
                    }
                }
                break;
            default:System.out.println("Такой функции нет");
        }

    }
}
class Employee{
    String fullname;
    String job;
    int agestart;
    int salary;

        public Employee(String fullname, String job, int agestart, int salary){
            this.fullname = fullname;
            this.job = job;
            this.agestart = agestart;
            this.salary = salary;
        }

        void getName(){
            System.out.printf("%s \n", fullname);
        }
}
