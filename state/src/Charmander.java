public class Charmander implements HahmoState {
    @Override
    public void ability(Pelihahmo p) {
        System.out.println("Ability: blaze");
    }

    @Override
    public void attack(Pelihahmo p) {
        System.out.println("Charmander attacks");
    }

    @Override
    public void evolve(Pelihahmo p) {
        System.out.println("Charmander evolves");
        p.setState(new Charmeleon());
    }


}
