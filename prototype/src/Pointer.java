public class Pointer implements Cloneable {
    private int time;

    public Pointer(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}