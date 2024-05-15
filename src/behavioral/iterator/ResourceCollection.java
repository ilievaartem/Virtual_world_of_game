package behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ResourceCollection implements Iterable<Resource> {
    private List<Resource> resources;

    public ResourceCollection() {
        resources = new ArrayList<>();
    }

    // Метод для додавання ресурсу до колекції
    public void addResource(Resource resource) {
        resources.add(resource);
    }

    // Перевизначення методу iterator() для підтримки ітерації по колекції
    @Override
    public Iterator<Resource> iterator() {
        return resources.iterator();
    }
}
