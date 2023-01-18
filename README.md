# Lab2-AdvancedMethodsOfProgramming

Advanced programming methods, 2022–2023, LABORATORY 2 DEADLINE: Week 5-6 (some groups have pear) solve the requirements from 1 to 10 (without decorator), marked in red from file Seminar1_2.pdf (seminar folder, general->Files)

1. Define task class with attributes: TaskID(long), description(string) and methods: A constructor with parameters, set/get, execute(), toString() and methods equals - hashCode;

The equals contract - hashcode: If obj1.equals(obj2) then obj1. HashCode() == obj2.hashCode().

What happens when we have an inheritance relationship between two classes and overwrite equals? (a=b => b=a?)

OBS. Is a task an abstraction? What kind of method will be executed?

2. Derive the MessageTask class from the task class, with the attributes message (string), from(string), to(string) and date (LocalDateTime) and display on the screen, via the execute method, the message text (message attribute value) and the date it was created; (see also DateTimeFormatter)

The MessageTask class could be refactorized, thus still encapsulating a message type object with the attributes: id, subject, body, from, to, data

long id; string subject; string body; string from; string to; LocalDateTime date,

DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/mm//yy HH::MM");

3. Derive the SortingTask class from the task that sorts a vector of integers and displays the sorted vector, via the execute() method. Optional theme

Note: Implement sorting strategies – BubbleSort si (quicksort or MergeSort). Tip: SortingTask encapsulates an AbstractSorter that has the sort method.

4. Write a test program that creates a vector (array) of 5 tasks of the type MessageTask and displays them on the screen in the following format:

Example: id=1|description=feedback lab1|message=you got 9.60|from=Gigi|to=Ana|date=2018-09-27 09:29

Note: The display format of the date will be observed.

5. We consider that the container interface specifies the common interface for task object collections, in which they can be added and from which elements can be removed.

Public interface container { task remove(); void add(task task); int size(); boolean isEmpty(); }

Create two types of concrete containers:

1. Stackcontainer - which implements, using an array representation, a LIFO strategy; 2. Queuecontainer - which implements, using a representation on an array, a FIFO strategy; optional theme

3.Refactor the Stackcontainer and Queuecontainer classes so you avoid bad smell. See the refactoring “Superclass Extract” (solution: Create an abstract superclass; make

the original classes subclasses of this superclass, refactoring: Improving the Design of existing Code by Martin Fowler. Optional theme

6. We consider the Factory interface that contains a createcontainer methodology, which receives a strategy (FIFO or LIFO) as a parameter and returns a container associated with that strategy (Factory method pattern). Create the TaskContainerFactory class that implements the Factory interface. Create Stack or Queue containers only with calls from the createcontainer method.

Public interface Factory (container createcontainer(Strategy startup); }

7.implement the TaskContainerFactory class that implements the Factory interface so that there can be only one instance of this type. [Singleton pattern] (optional theme) + discussion during the seminar.

8. Consider the interface

Public interface TaskRunner { void executeOneTask(); //execute a task from the collection of tasks to execute void executeAll(); //execute all tasks from the collection of tasks. void addTask(task t); //adds a task to the collection of tasks to be executed

Boolean hasTask(); //check if there are still tasks to be executed

}

that specifies the common interface for a collection of tasks to execute.

9. Create the StrategyTaskRunner class that implements the TaskRunner interface and contains:

- A private attribute of the container type;

- A builder receiving as a parameter a strategy specifying in which order the tasks will be executed (LIFO or FIFO);

10. Write a test program that creates a vector of MessageTask tasks and executes them, via an object such as StrategyTaskRunner, using the strategy specified as a parameter in the command line. (main(string[] args).

11. Define the AbstractTaskRunner abstract class that implements the TaskRunner interface and contains as a private attribute a reference to a task Runner object, the reference received as the parameter through the constructor.

12. Expand the AbstractTaskRunner class as follows:

1. PrinterTaskRunner - which displays a message after executing a task specifying the time at which the task was executed.

2. DelayTaskRunner – who performs late tasks; optional theme

Try { thread.sleep(3000); } catch (interruptedException E) { e.printStackTrace(); }

13. Write a test program that creates a vector of MessageTask tasks and executes them, initially via an object of the type StratyTaskRunner then via an object of the type PrinterTaskRunner (decorator), using the strategy specified as a parameter in the command line.
