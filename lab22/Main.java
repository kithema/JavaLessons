public class Main {
    public static void main(String[] args) {
        V380 rr380 = new HighVoltage();
        Rozetka rozetka = new Rozetka(rr380);
        rozetka.Test();
        Adapter rr220 = new Adapter(new LowVoltage());
        Rozetka rozetka1 = new Rozetka(rr220);
        rozetka1.Test();
    }
}
interface V380{
    void ChargingOn();
    void ChargingOff();
}
class HighVoltage implements V380{
    public void ChargingOn(){
        System.out.println("Зарядка 380 вольт включена");
    }
    public void ChargingOff(){
        System.out.println("Зарядка 380 вольт выключена");
    }
}
interface V220{
    void ChargingOnn();
    void ChargingOfff();
}
class LowVoltage implements V220{
    public void ChargingOnn(){
        System.out.println("Зарядка 220 вольт включена");
    }
    public void ChargingOfff(){
        System.out.println("Зарядка 220 вольт выключена");
    }
}
class Rozetka{ //к
    private V380 V380;
    public Rozetka(V380 V380){
        this.V380 = V380;
    }
    public void Test(){
        V380.ChargingOn();
        V380.ChargingOff();
    }
}
class Adapter implements V380{
    LowVoltage lowVoltage; 
    public Adapter(LowVoltage lowVoltage){
        this.lowVoltage = lowVoltage;
    }
    public void ChargingOn(){ 
        lowVoltage.ChargingOnn();
    }
    public void ChargingOff(){
        lowVoltage.ChargingOfff();
    }
}
