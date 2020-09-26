import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class QuickSort{
    public static void sort(Comparable[] nums){
        //TODO Shuffle
        StdRandom.shuffle(nums);
        sort(nums, 0, nums.length);
    }

    private static void sort(Comparable[] nums, int lo, int hi){
        if(lo >= hi) return;
        int mi = partition(nums, lo, hi);
        sort(nums, lo, mi);
        sort(nums, mi+1, hi);
    }

    private static int partition(Comparable[] nums, int lo, int hi){
        Comparable K = nums[lo];
        int i = lo;
        int j = hi;
        while(true){
            while(less(K, nums[++i])) break;
            while(less(nums[--j], K)) break;
            if(i == j) break;
            swap(nums, i, j);
        }
        swap(nums, lo, j);
        return j;
    }

    public static void main(String[] args){
        String[] a = StdIn.readAllStrings();
        Selection.sort(a);
        show(a);
    }
    protected static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    protected static void swap(Comparable[] a, int i, int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    protected static void show(Comparable[] a){
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
