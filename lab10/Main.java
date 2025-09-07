public class Main {
    public static void main(String[] args) {
        Dog[] dogs = {
                new Dog("Жорик", "Овчарка", "мясо", "будка"),
                new Dog("Люся", "Чихуахуа", "корм", "диван"),
                new Dog("Дуся", "Рыжая", "кости", "улица")
        };
        dogs[1].sleep();
        dogs[2].makeNoise();
        dogs[1].eat();
        Cat[] cats = {
                new Cat("Вискас", "Серая", "рыба", "квартира"),
                new Cat("Вика", "Черная", "корм", "дом")
        };

        Horse[] horses = {
                new Horse("Евгений", true, "сено", "стойло"),
                new Horse("Маруся", false, "овес", "конюшня")
        };
        Vet vet = new Vet();
        vet.treatAnimal(dogs[0]);
        vet.treatAnimal(cats[1]);
        vet.treatAnimal(horses[0]);
    }
}
class Animal{
    String food;
    String location;
    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }
    void sleep(){
            System.out.printf("животное спит\n");
    }
    void makeNoise(){
        System.out.printf("JERK SHIT HAPPENS\n");
    }
    void eat(){
        System.out.printf("JERK SHIT HAPPENS\n");
    }
}
class Vet{
    void treatAnimal(Animal animal) {
        System.out.printf("Животное ест: %s, находится: %s\n", animal.food, animal.location);
    }
}

class Dog extends Animal{
    String name;
    String bread;
    public Dog(String name, String breed, String food, String location) {
        super(food, location);
        this.name = name;
        this.bread = breed;
    }
    @Override
    void makeNoise(){
        System.out.printf("%s сказала гау гау гау \n", this.name);
    }
    @Override
    void eat(){
        System.out.printf("%s хавает собачи корм \n", this.name);
    }


}
class Cat extends Animal{
    String name;
    String color;
    public Cat(String name, String color, String food, String location) {
        super(food, location);
        this.name = name;
        this.color = color;
    }

    @Override
    void makeNoise(){
        System.out.printf("%s сказалa мяу мяу мау \n", this.name);
    }
    @Override
    void eat(){
        System.out.printf("%s хавает кошачи корм \n", this.name);
    }
}
class Horse extends Animal{
    String name;
    boolean mane;
    public Horse(String name, boolean mane, String food, String location) {
        super(food, location);
        this.name = name;
        this.mane = mane;
    }
    @Override
    void makeNoise(){
        System.out.printf("%s сказала иго иго игого \n", this.name);
    }
    @Override
    void eat(){
        System.out.printf("%s хавает лошадиный корм \n", this.name);
    }

}
