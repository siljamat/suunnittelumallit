public class McDonaldsBuilder implements BurgerBuilder {
    private StringBuilder burger = new StringBuilder();

    public void buildBun() {
        burger.append("Mäkki-sämpylä\n");
    }

    public void buildPatty() {
        burger.append("Mäkki-pihvi\n");
    }

    public void buildCheese() {
        burger.append("Mäkki-juusto\n");
    }

    public Burger getBurger() {
        Burger mcDBurger = new Burger();
        mcDBurger.addPart(burger.toString());
        return mcDBurger;
    }
}
