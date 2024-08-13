public class MaxProductSubarray {
    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            int tempMax = maxProduct;

            maxProduct = Math.max(current, Math.max(maxProduct * current, minProduct * current));
            minProduct = Math.min(current, Math.min(tempMax * current, minProduct * current));

            result = Math.max(result, maxProduct);
        }

        return result;
    }
}
