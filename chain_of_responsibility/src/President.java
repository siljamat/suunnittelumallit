public class President extends Raise{
    private final double ALLOWABLE = 0.06;

    public void processRequest(double raisePercentage) {
        if (raisePercentage <= ALLOWABLE) {
            System.out.println("President will approve a " + raisePercentage * 100 + "% raise.");
        } else {
            System.out.println("President will think about it.");
        }
    }
}
