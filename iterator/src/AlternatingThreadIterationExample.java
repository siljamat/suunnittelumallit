import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AlternatingThreadIterationExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        Iterator<Integer> iterator = list.iterator();

        // Luo ja käynnistä kaksi säiettä
        Thread thread1 = new Thread(() -> iterateList(iterator, "Thread 1"));
        Thread thread2 = new Thread(() -> iterateList(iterator, "Thread 2"));

        thread1.start();
        thread2.start();
    }

    private static void iterateList(Iterator<Integer> iterator, String threadName) {
        while (iterator.hasNext()) {
            System.out.println(threadName + ": " + iterator.next());
        }
    }
}
