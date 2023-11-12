public class BurgerDirector {
    private BurgerBuilder burgerBuilder;

    public void setBurgerBuilder(BurgerBuilder builder) {
        this.burgerBuilder = builder;
    }

    public Burger constructBurger() {
        burgerBuilder.buildBun();
        burgerBuilder.buildPatty();
        burgerBuilder.buildCheese();
        return burgerBuilder.getBurger();
    }
}
