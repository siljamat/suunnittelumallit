import java.util.List;

public class ArrayIteration implements ListConverter{
    @Override
    public String listToString(List<Integer> list) {
        StringBuilder result = new StringBuilder();
        Integer[] t = list.toArray(new Integer[list.size()]);
        for (int i = 0; i < t.length; i++) {
            result.append(t[i]);
            if (i % 2 == 1) {
                result.append("\n");
            } else {
                result.append(" ");
            }
        }
        return result.toString();
    }
}
