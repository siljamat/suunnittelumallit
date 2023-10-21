import java.util.List;

public class Iterator implements ListConverter{
    @Override
    public String listToString(List<Integer> list) {
        StringBuilder result = new StringBuilder();
        java.util.Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()) {
            result.append(iterator.next()).append("\n");
        }
        return result.toString();
    }
}
