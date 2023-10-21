public class Main {
    public static void main(String[] args) {
        NumList a = new NumList(new Iterator());
        a.printList();

        a.setConverter(new ArrayIteration());
        a.printList();

        a.setConverter(new ListGetIteration());
        a.printList();
    }

}