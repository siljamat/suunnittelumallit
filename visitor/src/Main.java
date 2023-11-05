public class Main {
    public static void main(String[] args) {
        Pelihahmo pelihahmo = new Pelihahmo();

        for (int i = 0; i < 3; i++) {
            pelihahmo.attack();
            pelihahmo.evolve();
        }
    }
}