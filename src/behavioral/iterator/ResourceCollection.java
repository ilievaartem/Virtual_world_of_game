package behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ResourceCollection implements Iterable<Resource> {
    private List<Resource> resources;

    public ResourceCollection() {
        resources = new ArrayList<>();
    }

    public void addResource(Resource resource) {
        resources.add(resource);
    }

    @Override
    public Iterator<Resource> iterator() {
        return resources.iterator();
    }
}
