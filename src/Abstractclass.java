abstract class Handphone{
    public abstract void harga();
}

class Laptop extends Handphone{
    @Override
    public void harga(){
        System.out.println("Harga : 10000");
    }

} 

public class Abstractclass{
    public static void main(String[] args) {
        Laptop hp = new Laptop();
        hp.harga();
    }
}