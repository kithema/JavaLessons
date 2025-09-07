public class Main {
    public static void main(String[] args) {
        Person leha = new Person("Лёха", "Лосев", 2003);
        Auto lehino = new Auto("Лада", 1710, 23.50);
        Book lehina = new Book("ХЛОПНУЛ", "pisjio", 1999);

        leha.ultra(lehino, lehina);
    }
}
class Person{
    String name;
    String secondname;
    int date;
    public Person(String name, String secondname, int date){
        this.name = name;
        this.secondname = secondname;
        this.date = date;
    }
    public void getInfoPerson(){
        System.out.println(this.name + " " + this.secondname + " " + this.date);
    }
    public void ultra(Auto lehino, Book lehina){
        System.out.println(this.name + " читает книгу " + lehina.name + " про машину " + lehino.mark);
    }

}
class Auto{
    String mark;
    int date;
    double vengine;
    public Auto(String mark, int date, double vengine){
        this.mark = mark;
        this.date = date;
        this.vengine = vengine;
    }
    public void getInfoAuto(){
        System.out.println(this.mark + " " + this.date + " " + this.vengine);
    }
}
class Book{
    String name;
    String author;
    int date;
    public Book(String name, String author, int date){
        this.name = name;
        this.author = author;
        this.date = date;
    }
    public void getInfoBook(){
        System.out.println(this.name + " " + this.author + " " + this.date);
    }
}
