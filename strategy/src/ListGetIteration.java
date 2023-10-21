import java.util.List;

public class ListGetIteration implements ListConverter {
    @Override
    public String listToString(List<Integer> list) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            result.append(list.get(i));
            if ((i + 1) % 3 == 0) {
                result.append("\n");
            } else {
                result.append(" ");
            }
        }
        return result.toString();
    }
}

