public class Main {
    public static void main(String[] args) {
        Core core = Core.getInstance();
        System.out.println(core.out());
        Core core2 = Core.getInstance();
        if(core.hashCode() == core2.hashCode()){
            System.out.println("OKAUUUYUU");
        }
        else{
            System.out.println("Not woraket");
        }
    }
}
class Core{
    private static Core cq =  new Core(12,3);
    private int x;
    private int y;
    private Core(int x, int y){
        this.x = x;
        this.y = y;
    }
    static Core getInstance(){
        return cq;
    }
    int out(){
         return ((2*x+3)/y);
    }
}
