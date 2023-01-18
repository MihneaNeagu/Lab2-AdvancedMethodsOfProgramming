package mi.model;

import mi.Sorter.AbsSorter;
import mi.Sorter.BSort;
import mi.Sorter.QSort;
import mi.Sorter.StrategySorter;

import java.util.Arrays;

public class SortingTask extends Task{
    private int[] numere;
    private AbsSorter sorter;
    private StrategySorter strategySorter;

    public SortingTask(long id, String desc, int[] numere , StrategySorter strategySorter) {
        super(id, desc);
        this.numere = numere;
        this.strategySorter = strategySorter;
        if(this.strategySorter== StrategySorter.Qsort)
            this.sorter= new QSort();
        if(this.strategySorter== StrategySorter.Bsort)
            this.sorter = new BSort();
    }

    @Override
    public void execute() {
       this.sorter.sort(numere);
       System.out.println(Arrays.toString(numere));
    }
}
