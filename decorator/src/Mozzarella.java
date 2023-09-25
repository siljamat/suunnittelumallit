public class Mozzarella extends Taytteet{

    double hinta = 2.50;

    public Mozzarella (IPizza pizza){
        super(pizza);
    }


    public double haeHinta() {
        return pizza.haeHinta() + hinta;
    }


    public String haeTiedot() {
        return super.haeTiedot() + "mozzarella " + haeHinta() + " €, ";
    }
}
