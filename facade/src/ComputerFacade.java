public class ComputerFacade {
    private static final long kBootAddress = 0x1000;
    private static final long kBootSector = 1;
    private static final int kSectorSize = 512;

    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    ComputerFacade() {
        cpu = new CPU();
        memory = new Memory();
        hardDrive = new HardDrive();
    }

    void start() {
        cpu.freeze();
        memory.load(kBootAddress, hardDrive.read(kBootSector, kSectorSize));
        cpu.jump(kBootAddress);
        cpu.execute();
    }
}
