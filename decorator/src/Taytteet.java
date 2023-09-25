public abstract class Taytteet implements IPizza {

    protected IPizza pizza;

    public Taytteet(IPizza pizza){
        this.pizza = pizza;
    }

    public double haeHinta() {
        return pizza.haeHinta();
    }

    @Override
    public String haeTiedot() {
        return pizza.haeTiedot();
    }
}
