public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Чушпан", 43123, "Физрук");
        Teacher teacher1 = new Teacher("Чушпан1", 40332, "Преподчегото");
        Student student = new Student("Чушпан2", 2320, "официант");
        Student student1 = new Student("Чушпан3", 12320, "дровосек");
        teacher.setLogin("124432");
        teacher.setPassword("pass123");
        System.out.println(teacher.getLogin());
        System.out.println(teacher.getPassword());
        
    }
}

interface User{
    void setLogin(String login);
    void setPassword(String password);
    String getLogin();
    String getPassword();
}
abstract class People implements User{
    String login;
    String password;
    String fullname;
    int age;
    String job;
    People(String fullname, int age, String job){
        this.fullname = fullname;
        this.age = age;
        this.job = job;
    }
    public void setLogin(String login){
        this.login = login;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getLogin(){
        return login;
    }

    public String getPassword(){
        return password;
    }
}
class Teacher extends People{
     Teacher(String fullname, int age, String job){
        super(fullname, age, job);
     }
}
class Student extends People{
    Student(String fullname, int age, String job){
        super(fullname, age, job);
    }

}
