public class Charmeleon implements HahmoState {
    @Override
    public void ability(Pelihahmo p) {
        System.out.println("Ability: blaze");
    }

    @Override
    public void attack(Pelihahmo p) {
        System.out.println("Charmeleon attacks");
    }

    @Override
    public void evolve(Pelihahmo p) {
        System.out.println("Charmeleon evolves");
        p.setState(new Charizard());
    }
}
