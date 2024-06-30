import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,34};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] arr){
        // int[] rev = new int[arr.length];
        // for(int i=0;i<arr.length;i++){
        //     rev[i] = arr[arr.length-1-i];
        //     }
        //     return rev;
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            swap(arr , start, end);
            start++;
            end--;
            }
            }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
    
}
