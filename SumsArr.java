import java.util.Arrays;

public class SumsArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(runningSum(arr)));
    }
    public static int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int sum =0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            ans[i] = sum;
        }
        
        return ans;
    }
    
}
