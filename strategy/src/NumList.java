import java.util.*;

public class NumList {
    private List<Integer> list;
    private ListConverter converter;

    public NumList(ListConverter converter) {
        this.list = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        this.converter = converter;
    }

    public void setConverter(ListConverter converter) {
        this.converter = converter;
    }

    public void printList() {
        String result = converter.listToString(list);
        System.out.println(result);
    }
}
