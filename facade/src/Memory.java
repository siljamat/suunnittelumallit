public class Memory {
    private char[] data = new char[0];

    public void load(long position, char[] data) {
        System.out.println("Loading data to memory at address: " + position);
        this.data = data;
    }
}
