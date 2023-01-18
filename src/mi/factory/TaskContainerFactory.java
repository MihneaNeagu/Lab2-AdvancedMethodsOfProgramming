package mi.factory;

import mi.Container.Container;
import mi.Container.QueueContainer;
import mi.Container.StackContainer;

public class TaskContainerFactory implements Factory{
    private final static TaskContainerFactory taskContFact = new TaskContainerFactory();
    private TaskContainerFactory(){}
    public static TaskContainerFactory getInstance(){
        return taskContFact;
    }
    @Override
    public Container createContainer(Strategy strategy) {
        if(strategy == Strategy.LIFO)
            return new StackContainer();
        if(strategy == Strategy.FIFO)
            return new QueueContainer();
        return null;
    }
}
