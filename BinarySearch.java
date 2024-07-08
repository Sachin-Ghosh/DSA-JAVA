import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = { 2324,453,545,2,3,5,1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Arrays.sort(arr);
        Arrays.binarySearch(arr,5);
        System.out.println(Arrays.binarySearch(arr,5));
        System.out.println(Arrays.toString(arr));
        int target = 5;
        int index = binarySearch(arr, target);
        System.out.println("Index of " + target + " is " + index);
    }

    public static int binarySearch(int[] arr,int target){
                int start = 0;
                int end = arr.length - 1;
                while(start <= end){
                    int mid = start + (end - start) / 2;
                    if(arr[mid] == target){
                        return mid;
                        }
                        else if(arr[mid] < target){
                                start = mid + 1;
                                }
                            else if(arr[mid] > target){
                                end = mid - 1;
                                }
                                else{
                                    return mid;
                                }
                                }
                                
                                return -1;
            }
}
