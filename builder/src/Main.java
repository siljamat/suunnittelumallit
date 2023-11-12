public class Main {
    public static void main(String[] args) {
        BurgerDirector director = new BurgerDirector();

        BurgerBuilder hesburgerBuilder = new HesburgerBuilder();
        director.setBurgerBuilder(hesburgerBuilder);
        Burger hesburger = director.constructBurger();
        hesburger.showBurger();

        System.out.println();

        BurgerBuilder mcDonaldsBuilder = new McDonaldsBuilder();
        director.setBurgerBuilder(mcDonaldsBuilder);
        Burger mcDonalds = director.constructBurger();
        mcDonalds.showBurger();
    }
}