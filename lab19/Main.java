public class Main {
    public static void main(String[] args) {
        System.out.println(Size.XXS.getDescription());
        Clothes[] clothes = {
                new Tshirt(Size.L, "2500", "Багровый"),
                new Pants(Size.M, "3300", "Белый"),
                new Skirt(Size.L, "2000", "Чорни"),
                new Tie(Size.L, "100", "Зеленый")

        };
        Atelier atelier = new Atelier();
        atelier.dressMan(clothes);
        atelier.dressWoman(clothes);
    }
}

enum Size {
    XXS(32) {
        @Override
        public String getDescription() {
            return "Детский размер";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);
    private int euroSize;

    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public String getDescription() {
        return "Взрослый размер";
    }
}
interface manClothes{
    void dressMan();
}
interface womanClothes{
    void dressWoman();
}
abstract class Clothes{
    Size clothesSize;
    String clothesPrice;
    String clothesColor;
    public Clothes(Size clothesSize, String clothesPrice, String clothesColor){
        this.clothesColor = clothesColor;
        this.clothesPrice = clothesPrice;
        this.clothesSize = clothesSize;
    }

    @Override
    public String toString() {
        return String.format("Размер: %s (EUR %d), Цвет: %s, Стоимость: %s", clothesSize, clothesSize.getEuroSize(), clothesColor, clothesPrice);
    }

}
class Tshirt extends Clothes implements manClothes, womanClothes{
    public Tshirt(Size clothesSize, String clothesPrice, String clothesColor){
        super(clothesSize, clothesPrice, clothesColor);
    }
    @Override
    public void dressMan() {
        System.out.println("Футболка мужская" + this);
    }

    @Override
    public void dressWoman() {
        System.out.println("Футблка Женская" + this);
    }
}
class Pants extends Clothes implements manClothes, womanClothes{
    public Pants(Size clothesSize, String clothesPrice, String clothesColor){
        super(clothesSize, clothesPrice, clothesColor);
    }
    @Override
    public void dressMan() {
        System.out.println("Штаны мужские" + this);
    }

    @Override
    public void dressWoman() {
        System.out.println("Штаны женские" + this);
    }
}
class Skirt extends Clothes implements womanClothes{
    public Skirt(Size clothesSize, String clothesPrice, String clothesColor){
        super(clothesSize, clothesPrice, clothesColor);
    }
    @Override
    public void dressWoman() {
        System.out.println("Юбка " + this);
    }
}
class Tie extends Clothes implements manClothes{
    public Tie(Size clothesSize, String clothesPrice, String clothesColor){
        super(clothesSize, clothesPrice, clothesColor);
    }
    @Override
    public void dressMan() {
        System.out.println("Галстук " + this);
    }
}
class Atelier {
    public void dressWoman(Clothes[] clothes) {
        System.out.println("\nЖенская одежда в ателье:");
        for (Clothes item : clothes) {
            if (item instanceof womanClothes) {
                ((womanClothes) item).dressWoman();
            }
        }
    }

    public void dressMan(Clothes[] clothes) {
        System.out.println("\nМужская одежда в ателье:");
        for (Clothes item : clothes) {
            if (item instanceof manClothes) {
                (( manClothes) item).dressMan();
            }
        }
    }
}