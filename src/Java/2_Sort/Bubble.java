public class Bubble {
    public static void sort(Comparable[] nums){
        int len = nums.length;
        boolean sorted = false; // Early exit if no swap
        while(!sorted && len > 0){
            sorted = true;
            for(int i = 0; i < len - 1; i++){
                if(!less(nums[i],nums[i+1])) {
                    sorted = false;
                    swap(nums, i, i+1);
                }
            }
            len--;
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
