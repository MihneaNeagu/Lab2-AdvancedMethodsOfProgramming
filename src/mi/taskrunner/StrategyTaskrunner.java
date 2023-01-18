package mi.taskrunner;

import mi.Container.Container;
import mi.factory.Factory;
import mi.factory.Strategy;
import mi.factory.TaskContainerFactory;
import mi.model.Task;

public class StrategyTaskrunner implements Taskrunner {
    private Container container;

    public StrategyTaskrunner(Strategy strategy) {
        this.container = TaskContainerFactory.getInstance().createContainer(strategy);
        //Factory->Singleton
    }

    @Override
    public void executeOneTask() {
        if(container.isEmpty()!=true)
        {container.remove().execute();}
    }

    @Override
    public void executeAll() {
        while(container.isEmpty()!=true)
        {executeOneTask();}
    }

    @Override
    public void addTask(Task t) {
        container.add(t);
    }

    @Override
    public boolean hasTask() {
        return container.isEmpty();
    }
}
