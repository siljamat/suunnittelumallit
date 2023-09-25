public class Harkis extends Taytteet {

    double hinta = 4.00;
    public Harkis (IPizza pizza){
        super(pizza);
    }

    public double haeHinta() {
        return pizza.haeHinta() + hinta;
    }

    @Override
    public String haeTiedot() {
        return super.haeTiedot() + "härkis " + haeHinta() + " €, ";
    }
}
