import java.util.ArrayList;
import java.util.List;

public class Burger {
    private List<Object> parts = new ArrayList<>();

    public void addPart(Object part) {
        parts.add(part);
    }

    public void showBurger() {
        System.out.println("Hampurilainen koostuu seuraavista osista:");
        for (Object part : parts) {
            System.out.println(part);
        }
    }
}