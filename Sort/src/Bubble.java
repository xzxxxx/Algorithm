public class Bubble {
    public static void main(String[] args) {
        int[] nums = new int[]{5,4,3,2,1};
        bubble(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }

    public static void bubble(int[] arr){
        for(int i = arr.length - 1; i > 0 ; i--){
            for(int j = 0; j < i; j++){
                if(arr[j + 1] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
