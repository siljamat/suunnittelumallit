public class Juustoraaste extends Taytteet {

    double hinta = 2.00;
    public Juustoraaste (IPizza pizza){
        super(pizza);
    }

    public double haeHinta() {
        return pizza.haeHinta() + hinta;
    }

    @Override
    public String haeTiedot() {
        return super.haeTiedot() + "juustoraaste " + haeHinta() + " €, ";
    }
}
