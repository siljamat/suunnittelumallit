public class Supervisor extends Raise{
    private final double ALLOWABLE = 0.02;

    public void processRequest(double raisePercentage) {
        if (raisePercentage <= ALLOWABLE) {
            System.out.println("Supervisor will approve a " + raisePercentage * 100 + "% raise.");
        } else {
            super.processRequest(raisePercentage);
        }
    }
}
