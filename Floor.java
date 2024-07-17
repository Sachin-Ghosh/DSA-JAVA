public class Floor {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 15, 40};
        int target = 5;
        System.out.println(floor(arr, target));
        }
        public static int floor(int[] arr, int target) {
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target < arr[mid]) {
                    end = mid - 1;
                    // return end;
                    } else if (target > arr[mid]) {
                        start = mid + 1;
                        // return start;
                        } else {
                            return mid;
                            }
                            }
                            return end;
        
    }
    
}
