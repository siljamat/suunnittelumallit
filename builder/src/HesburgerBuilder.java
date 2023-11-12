import java.util.ArrayList;
import java.util.List;

public class HesburgerBuilder implements BurgerBuilder {
    private List<Object> parts = new ArrayList<>();

    public void buildBun() {
        parts.add(new Bun());
    }

    public void buildPatty() {
        parts.add(new Patty());
    }

    public void buildCheese() {
        parts.add(new Cheese());
    }

    public Burger getBurger() {
        Burger burger = new Burger();
        burger.addPart(parts);
        return burger;
    }
}