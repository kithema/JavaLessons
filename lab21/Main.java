public class Main {
    public static void main(String[] args) {
        Company road = new Earth();
        Company sea = new Ocean();
        Company air = new Air();

        road.salami();
        sea.salami();
        air.salami();
    }
}
interface Machine{ 
    public void make();
}
abstract class Company {
    public abstract Machine createMachine();

    public void salami() {
        Machine machine = createMachine();
        machine.make();
    }

}



class Earth extends Company {
    @Override
    public Machine createMachine() {
        return new Truck();
    }
}
class Ocean extends Company {
    @Override
    public Machine createMachine() {
        return new Ship();
    }
}
class Air extends Company {
    @Override
    public Machine createMachine() {
        return new Airplane();
    }
}



class Truck implements Machine {
    @Override
    public void make() {
        System.out.println("Грузовичок");
    }
}

class Ship implements Machine {
    @Override
    public void make() {
        System.out.println("Кораблекк");
    }
}

class Airplane implements Machine {
    @Override
    public void make() {
        System.out.println("Самолетик");
    }
}
