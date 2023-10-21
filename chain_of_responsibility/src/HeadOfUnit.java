public class HeadOfUnit extends  Raise {
    private final double ALLOWABLE_MIN = 0.02;
    private final double ALLOWABLE_MAX = 0.05;

    public void processRequest(double raisePercentage) {
        if (raisePercentage > ALLOWABLE_MIN && raisePercentage <= ALLOWABLE_MAX) {
            System.out.println("Head of unit will approve a " + raisePercentage * 100 + "% raise.");
        } else {
            super.processRequest(raisePercentage);
        }
    }
}
