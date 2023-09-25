public class Charizard implements HahmoState {
    @Override
    public void ability(Pelihahmo p) {
        System.out.println("Ability: blaze");
    }

    @Override
    public void attack(Pelihahmo p) {
        System.out.println("Charizard attacks");
    }

    @Override
    public void evolve(Pelihahmo p) {
        System.out.println("Charizard evolves");
    }

}
