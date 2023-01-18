package mi.Container;
import mi.model.Task;
public interface Container
{
    Task remove();
    void add(Task task);
    int size();
    boolean isEmpty();
}