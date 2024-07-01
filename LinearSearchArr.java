import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchArr {
    public static void main(String[] args) {
        //Q find the number in input using linear search in the array
        int[] arr = Input();
        System.out.println("Array elements are: " + Arrays.toString(arr));   
        Scanner sc=new Scanner(System.in);  
        System.out.println("Enter the number you want to search: ");
        int num = sc.nextInt();
        int index = LinearSearch(arr, num);
        if (index == -1) {
            System.out.println("Number not found");
            } else {
                System.out.println("Number found at index: " + index);
                }
                

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
    public static int LinearSearch(int[] arr,int num){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
                }
                }
                return -1;
    }
}