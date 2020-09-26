import edu.princeton.cs.algs4.StdIn;
public class Selection {
    public static void sort(Comparable[] nums){
        int len = nums.length;
        for(int i = 0; i < len - 1; i++){
            int min = i;
            for(int j = i + 1; j < len; j++){
                if(less(nums[j], nums[min])){
                    min = j;
                }
            }
            swap(nums, min, i);
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
