public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void moveZeroes(int[] nums) {
        int last = 0;
        for (int current = 0; current < nums.length; current++) {
            if (nums[current] != 0) {
                nums[last++] = nums[current];
            }
        }
        for (int i = last; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
