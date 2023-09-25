public class Main {
    public static void main(String[] args) {

        IPizza pizza1 = new Harkis(new Juustoraaste(new Tomaattikastike(new Pizzapohja())));
        System.out.println(pizza1.haeTiedot());
        System.out.println(pizza1.haeHinta());

        IPizza pizza2 = new Salami(new Juustoraaste(new Tomaattikastike(new Pizzapohja())));
        System.out.println(pizza2.haeTiedot());
        System.out.println(pizza2.haeHinta());

        IPizza pizza3 = new Juustoraaste(new Mozzarella(new Tomaattikastike(new Pizzapohja())));
        System.out.println(pizza3.haeTiedot());
        System.out.println(pizza3.haeHinta());
    }
}