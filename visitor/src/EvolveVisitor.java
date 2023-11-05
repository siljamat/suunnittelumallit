public class EvolveVisitor implements HahmoVisitor {
    @Override
    public void makeDecision(Pelihahmo pelihahmo) {
        HahmoState currentState = pelihahmo.getState();
        System.out.println("Evolving...");
        if (currentState instanceof Charmander) {
            System.out.println("Charmander evolves to Charmeleon");
            pelihahmo.setState(new Charmeleon());
        } else if (currentState instanceof Charmeleon) {
            System.out.println("Charmeleon evolves to Charizard");
            pelihahmo.setState(new Charizard());
        } else {
            System.out.println("Max evolution reached.");
        }
    }
}