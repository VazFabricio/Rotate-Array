public class Main {
    public static void main(String[] args) {
        //Initialize array
        int [] nums = new int [] {1, 2, 3, 4, 5};
        //n determine the number of times an array should be rotated.
        int n = 3;
        exibe(nums);
        rotate(nums, 3);
        System.out.println(" ");
        exibe(nums);
    }

    public static void rotate(int[] nums, int n) {
        //Rotate the given array by n times toward right
        for(int i = 0; i < n; i++){
            int j, last;
            //Stores the last element of array
            last = nums[nums.length-1];

            for(j = nums.length-1; j > 0; j--){
                //Shift element of array by one
                nums[j] = nums[j-1];
            }
            //Last element of array will be added to the start of array.
            nums[0] = last;
        }
    }

    public static void exibe(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}