public class MergeSort{
    public static void sort(Comparable[] nums){
        // Template
        sort(nums, 0, nums.length);
    }

    private static void sort(Comparable[] nums, int lo, int hi){
        if(lo <= hi){
            return;
        }
        mi = lo + (hi - lo)/2;
        sort(nums, lo, mi);
        sort(nums, mi+1,hi);
        merge(nums, lo, mi, hi);
    }

    private static void merge(Comparable[] nums, int lo, int mi, int hi){
        Comparable[] aux = new Comparable[nums.length];
        int i = lo;
        int j = mi+1;
        for(int k = lo; k <= hi; k++){
            aux[k] = nums[k];
        }
        for(int k = lo; k <= hi; k++){
            if(i > mi){
                nums[k] = aux[j++];
            }else if(j > hi){
                nums[k] = aux[i++];
            }else if(less(aux[i],aux[j]) <= 0){
                nums[k] = aux[i++];
            }else{
                nums[k] = aux[j++];
            }
        }
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
