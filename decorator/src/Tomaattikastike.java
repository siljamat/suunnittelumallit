public class Tomaattikastike extends Taytteet {

    double hinta = 1.00;
    public Tomaattikastike (IPizza pizza){
        super(pizza);
    }

    public double haeHinta() {
        return pizza.haeHinta() + hinta;
    }

    @Override
    public String haeTiedot() {
        return super.haeTiedot() + "tomaattikastike " + haeHinta() + " €, ";
    }
}
