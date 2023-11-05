public class Pelihahmo {
    private HahmoState state = new Charmander();

    public void attack() {
        state.attack(this);
    }

    public void evolve() {
        HahmoVisitor visitor = new EvolveVisitor();
        visitor.makeDecision(this);
    }

    public void setState(HahmoState s) {
        state = s;
    }

    public HahmoState getState() {
        return state;
    }
}
