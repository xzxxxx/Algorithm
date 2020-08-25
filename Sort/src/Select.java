public class Select {
    public static void main(String[] args) {
        int[] nums = new int[]{5,4,3,2,1};
        select(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
    public static void select(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
