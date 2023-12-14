import java.util.ArrayList;
import java.util.Iterator;

public class IteratorModificationTest {

    public static void main(String[] args) {
        // Luo ArrayList ja lisää siihen alkioita
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
        }

        // Luo iteraattori
        Iterator<Integer> iterator = arrayList.iterator();

        // Iteroi ja tee muutoksia
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.println("Current Element: " + element);

            // Tee muutos: lisää uusi alkio listaan
            arrayList.add(element + 1);
            System.out.println("Added element " + (element + 1) + " to the list");
        }

        // Tulosta lopullinen lista
        System.out.println("Final List: " + arrayList);
    }
}
