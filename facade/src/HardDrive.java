public class HardDrive {
    public char[] read(long lba, int size) {
        System.out.println("Reading from Hard Drive at LBA: " + lba + " with size: " + size);
        return new char[size];
    }
}
