public abstract class Raise {
    private Raise successor;

    public void setSuccessor(Raise successor) {
        this.successor = successor;
    }
    public void processRequest(double raisePercentage) {
        if (successor != null)
            successor.processRequest(raisePercentage);
    }
}
