import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student [] students = {
                new Student(3, "Филфак", 2013, 23, "Иванов Леопольд Борисович", "+89539534444"),
                new Student(2, "Програмер", 2015, 22, "Козлов Леонид Сергеевич", "+88889534444"),
                new Student(1, "математик", 2017, 33, "Цветов Руслан Анатольевич", "+89999534444"),
        };
        for(int i = 0; i< students.length; i++){
            students[i].getName();
            students[i].getAge();
            System.out.println();
        }
        System.out.println("Какой факультет вывести??????");
        String findFaculty = input.nextLine();
        for(int i = 0; i < students.length; i++){
            String special = students[i].getFaculty();
            if (special.equals(findFaculty)) {
                students[i].getName();
                System.out.println();
            }
        }
        System.out.println("Введите год??????");
        int findDatebegins = input.nextInt();
        for(int i = 0; i < students.length; i++){
            int speciall = students[i].getDateBegin();
            if (speciall > findDatebegins) {
                students[i].getName();
                System.out.println();

            }
        }
    }
}
class Person{
    private int age;
    public String fullname;
    public String number;
    public Person(int age, String fullname, String number){
        this.age = age;
        this.fullname = fullname;
        this.number = number;
    }
    void getName(){
        System.out.printf("%s ", this.fullname);
    }
    void getAge(){
        System.out.printf("%d ", this.age);
    }
}
class Student extends Person{
    public int stage;
    public String faculty;
    private int dateBegin;
    public Student(int stage, String faculty, int dateBegin, int age, String fullname, String number){
        super(age, fullname, number);
        this.faculty = faculty;
        this.stage = stage;
        this.dateBegin = dateBegin;
    }
    String getFaculty(){
        return this.faculty;
    }
    int getDateBegin(){
        return this.dateBegin;
    }
}
