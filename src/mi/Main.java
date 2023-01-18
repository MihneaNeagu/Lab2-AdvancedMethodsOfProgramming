package mi;

import mi.Container.Container;
import mi.Container.QueueContainer;
import mi.Container.StackContainer;
import mi.Sorter.AbsSorter;
import mi.Sorter.StrategySorter;
import mi.factory.Factory;
import mi.factory.Strategy;
import mi.factory.TaskContainerFactory;
import mi.model.MessageTask;
import mi.model.SortingTask;
import mi.model.Task;
import mi.taskrunner.StrategyTaskrunner;
import mi.taskrunner.Taskrunner;

import java.time.LocalDateTime;

public class Main {
    private static void testContainer(){
        MessageTask m0=new MessageTask(1L, "sem Map0", "Java", LocalDateTime.now());
        MessageTask m1=new MessageTask(2L, "sem Map1", "Java", LocalDateTime.now());
        MessageTask m2=new MessageTask(3L, "sem Map2", "Java", LocalDateTime.now());
        MessageTask m3=new MessageTask(4L, "sem Map3", "Java", LocalDateTime.now());

        Container container = new QueueContainer();

        container.add(m0);
        container.add(m1);
        container.add(m2);
        container.add(m3);

        System.out.println(container.size());
        System.out.println(container.remove()==m0);
        assert container.size() == 3;
    }

    public static void testFactory(){
        Factory f1 = TaskContainerFactory.getInstance();
        Factory f2 = TaskContainerFactory.getInstance();
        System.out.println(f1 == f2);
    }

    public static void main(String[] args) {
        // write your code here
        //mi.model.Task task = new mi.model.Task(12l, "sem Map");
        //System.out.println(task.getId() + " "+ task.getDesc());
        // System.out.println(task);
        /*MessageTask m0=new MessageTask(121l, "sem Map0", "concepte OPP", LocalDateTime.now());
        MessageTask m1=new MessageTask(21l, "sem Map1", "concepte OPP", LocalDateTime.now());
        MessageTask m2=new MessageTask(132l, "sem Map2", "concepte OPP", LocalDateTime.now());
        MessageTask m3=new MessageTask(152l, "sem Map3", "concepte OPP", LocalDateTime.now());
        MessageTask m4=new MessageTask(712l, "sem Map4", "concepte OPP", LocalDateTime.now());*/
        /*Container container = new StackContainer();
        container.add(m0);
        container.add(m1);
        container.add(m2);
        container.add(m3);
        container.add(m4);
        while(container.isEmpty()!=true)
        {
            Task task = container.remove();
            task.execute();
        }*/
       /* Taskrunner runner = new StrategyTaskrunner(Strategy.LIFO);
        runner.addTask(m0);
        runner.addTask(m1);
        runner.addTask(m2);
        runner.addTask(m3);
        runner.addTask(m4);
        runner.executeAll();

        LocalDateTime date=LocalDateTime.now();
        date.format(MessageTask.formatter);*/

        testContainer();
        testFactory();
        SortingTask a = new SortingTask(1, "map", new int[]{7,6,5,4} , StrategySorter.Qsort);
        a.execute();
        SortingTask a1 = new SortingTask(2,"map", new int[]{7,6,5,4} , StrategySorter.Bsort);
        a1.execute();
    }
}
