package mi.Sorter;

public class BSort extends AbsSorter{
    @Override
    public void sort(int[] vec) {
        int n = vec.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (vec[j] > vec[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = vec[j];
                    vec[j] = vec[j + 1];
                    vec[j + 1] = temp;
                }
    }
}
