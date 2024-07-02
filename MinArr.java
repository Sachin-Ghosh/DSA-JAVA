import java.util.Arrays;
import java.util.Scanner;

public class MinArr {
    public static void main(String[] args) {
        int[] arr = Input();
        System.out.println("Array elements are: " + Arrays.toString(arr));   
        System.out.println("Minimum value of array is " + min(arr));
        System.out.println("Minimum value of array is " + minRange(arr));

    }
    public static int[] Input(){ 
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the number of elements you want to store: ");   
        int arr1 = sc.nextInt();  
        int[] array = new int[arr1];  
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<arr1; i++)  
        {    
        array[i]=sc.nextInt();  
        }  
        return array;
    }
    public static int minRange(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of the array: ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        int min = arr[start];


        if (start > end) {
            return -1;
        }

        int minVal = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
        }
        return minVal;
    }

    public static int min(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int minVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
                }
            }
            return minVal;
        
    }
    
}
