public class Shell{
    public static void sort(Comparable[] nums){
       int n = nums.length;
       int h = 1;
       while(h < n/3) h = h*3+1; // 1 4 13 40...

       while(h >= 1){
           for(int i = 1; i < n; i++){
               for(int j = i; j > 0 && less(nums[j], nums[j-1]); j-= h){
                   swap(nums, j, j-1);
               }
           }
           h /= 3;
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
