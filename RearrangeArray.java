import java.util.*;

public class RearrangeArray {
    public static void main(String[] args) {
        int[] nums = {3, 1, -2, -5, 2, -4};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }

    public static int[] rearrangeArray(int[] nums) {
        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();

        for (int num : nums) {
            if (num > 0) {
                positives.add(num);
            } else {
                negatives.add(num);
            }
        }

        int[] result = new int[nums.length];
        int posIndex = 0;
        int negIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                result[i] = positives.get(posIndex++);
            } else {
                result[i] = negatives.get(negIndex++);
            }
        }

        return result;
    }
}
