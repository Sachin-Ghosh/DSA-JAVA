import java.util.Arrays;

public class FirstLast {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5,5,5,6,7,8};
        int target =5;
        System.out.println(Arrays.toString(searchRange(nums,target)));
        }
    public static int[] searchRange(int[] nums, int target) { 
        int[] ans= {-1,-1};
        int start = search(nums,target,true);
        int end = search(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    public static int search(int[] nums, int target, boolean StartIndex){
        int ans = -1;
        int start = 0;
            int end = nums.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target < nums[mid]) {
                    end = mid - 1;
                    // return end;
                    } else if (target > nums[mid]) {
                        start = mid + 1;
                        // return start;
                        } else {
                            ans = mid;
                            if(StartIndex){
                                end = mid -1;
                            }else{
                                start = mid + 1;
                            }
                            }
                            }
                            return ans;
    }
}
