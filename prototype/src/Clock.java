public class Clock implements Cloneable {
    private Pointer hourPointer;
    private Pointer minPointer;

    public Clock(Pointer hourPointer, Pointer minPointer) {
        this.hourPointer = hourPointer;
        this.minPointer = minPointer;
    }

    public Pointer getHourPointer() {
        return hourPointer;
    }

    public Pointer getMinPointer() {
        return minPointer;
    }

    // deep copy
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Clock clone = (Clock) super.clone();
        clone.hourPointer = (Pointer) hourPointer.clone();
        clone.minPointer = (Pointer) minPointer.clone();
        return clone;
    }

    // shallow copy
    public Clock shallowClone() throws CloneNotSupportedException {
        return (Clock) super.clone();
    }
}
