package mi.Container;

import mi.model.Task;

public class QueueContainer extends AbstractContainer implements Container {
    @Override
    public Task remove() {
        return container.remove(0);
    }

}
