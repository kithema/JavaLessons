public class Main {
    public static void main(String[] args) {
        Skateboards element = new Skateboards("Diffusial", "3333", "5");
        Guns ak = new Guns("ak47", "1313", "10");
        Shoes maisonmargiela = new Shoes("tabi", "1232134", "13");
        Student student = new Student("jhonny", 22, " крутой");
        Customer sematary = new Customer("djSorrow", "123", "zein", "skate-element", "132123412", "13");
        sematary.coreMechanic();
    }
}
interface Product{
    String getName();
    String getCost();
    String getRating();
    void setName(String name);
    void setCost(String cost);
    void setRating(String rating);
}
interface User{
    void setLogin(String login);
    void setPassword(String password);
    String getLogin();
    String getPassword();
}
abstract class AbstractProduct implements Product{
     String name;
     String cost;
     String rating;
     AbstractProduct(String name, String cost, String rating){
         this.name = name;
         this.cost = cost;
         this.rating = rating;
     }

    public String getName(){
        return name;
    }

    public String getCost(){
        return cost;
    }

    public String getRating(){
        return rating;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setCost(String cost){
        this.cost = cost;
    }

    public void setRating(String rating){
        this.rating = rating;
    }
}

class Skateboards extends AbstractProduct{
    Skateboards(String name, String cost, String rating){
        super(name, cost, rating);
    }
}

class Guns extends AbstractProduct{
    Guns(String name, String cost, String rating){
        super(name, cost, rating);
    }
}

class Shoes extends AbstractProduct{
    Shoes(String name, String cost, String rating){
        super(name, cost, rating);
    }
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
class Artist extends People{
    Artist(String fullname, int age, String job){
        super(fullname, age, job);
    }
}
class Customer implements Product, User{
    String login;
    String password;
    String fullname;
    String name;
    String cost;
    String rating;
    Customer( String login, String password, String fullname, String name, String cost,String rating){
        this.login = login;
        this.password = password;
        this.fullname = fullname;
        this.name = name;
        this.cost = cost;
        this.rating = rating;
    }
    @Override
    public String getName(){
        return "";
    }

    @Override
    public String getCost(){
        return "";
    }

    @Override
    public String getRating(){
        return "";
    }

    @Override
    public void setName(String name){

    }

    @Override
    public void setCost(String cost){

    }

    @Override
    public void setRating(String rating){

    }

    @Override
    public void setLogin(String login){

    }

    @Override
    public void setPassword(String password){

    }

    @Override
    public String getLogin(){
        return "";
    }

    @Override
    public String getPassword(){
        return "";
    }
    void coreMechanic(){
        System.out.printf("%s купил %s", this.fullname, this.name);
    }
}
