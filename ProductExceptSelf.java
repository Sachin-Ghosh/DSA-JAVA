import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println("Output for nums1: " + Arrays.toString(productExceptSelf(nums)));
    }
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] lP = new int[n];
        int[] rP = new int[n];
        int[] result = new int[n];

        lP[0] = 1;
        for (int i = 1; i < n; i++) {
            lP[i] = lP[i - 1] * nums[i - 1];
        }

        rP[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            rP[i] = rP[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < n; i++) {
            result[i] = lP[i] * rP[i];
        }

        return result;
    }
}
