public class Selection<T extends Comparable<T>> extends Sort<T>{
    @Override
    public void sort(T[] nums){
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
}
