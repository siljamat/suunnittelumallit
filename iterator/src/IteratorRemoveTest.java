import java.util.LinkedList;
import java.util.Iterator;

public class IteratorRemoveTest {

    public static void main(String[] args) {
        // Luo linkitetty lista ja lisää siihen alkioita
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            linkedList.add(i);
        }

        // Luo iteraattori
        Iterator<Integer> iterator = linkedList.iterator();

        // Iteroi ja tee muutoksia
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.println("Current Element: " + element);

            // Tee muutos: poista parilliset luvut iteraattorin remove-metodilla
            if (element % 2 == 0) {
                iterator.remove();
                System.out.println("Removed element " + element);
            }
        }

        // Tulosta lopullinen lista
        System.out.println("Final List: " + linkedList);
    }
}
