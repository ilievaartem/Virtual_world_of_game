package Lab6.Part2.Task9;

import java.util.ArrayList;
import java.util.List;

public class Example {
    private static final int MaxItems = 100;

    public static void main(String[] args) {
        List<String> items = new ArrayList<>();

        for (int i = 0; i < MaxItems; i++) {
            items.add("Item " + i);
        }
    }
}
