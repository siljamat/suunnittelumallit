public class CPU {
    private boolean frozen;
    private long position;

    public void freeze() {
        frozen = true;
        System.out.println("CPU is frozen.");
    }

    public void jump(long position) {
        this.position = position;
        System.out.println("Jumping to address: " + position);
    }

    public void execute() {
        if (frozen) {
            System.out.println("CPU is frozen. Thaw it before executing.");
        } else {
            System.out.println("Executing instructions from address: " + position);
        }
    }
}
