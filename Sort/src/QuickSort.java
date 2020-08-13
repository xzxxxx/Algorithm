public class QuickSort {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2};
        quickSort(nums,0,nums.length - 1);
        for (int num : nums) {
            System.out.println(num);
        }
    }
    public static void quickSort(int[] nums, int l,int r){
        if(l >= r) return ;
        int i = l;
        int j = r;
        while(i < j){
            while(i < j && nums[l] >= nums[j]) j--; //先j--
            while(i < j && nums[l] <= nums[i]) i++;
            swap(nums,i,j);
        }
        swap(nums,l,i);//将l与i交换
        quickSort(nums,l,i-1);
        quickSort(nums,i+1,r);
    }

    public static void swap(int[] nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
