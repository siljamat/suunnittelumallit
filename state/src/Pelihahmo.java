public class Pelihahmo {
    private HahmoState state = new Charmander();

    public void ability() {
        state.ability(this);
    }

    public void attack() {
        state.attack(this);
    }

    public void evolve() {
        state.evolve(this);
    }

    public void setState(HahmoState s) {
        state = s;
    }
}
