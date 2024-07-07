import java.util.Arrays;

public class FrequencyCount {
    
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 3, 5};
        int N = 5;
        int P = 5;
        frequencyCount(arr, N, P);
        System.out.print(Arrays.toString(arr));
        
}
    public static void frequencyCount(int arr[], int N, int P)
        {
            // // code here
            int[] hash = new int[N+1];
            
            for (int i = 0; i < N; i++) {
                if (arr[i] <= N) {
                    hash[arr[i]] += 1;
                }
            }

            
            for (int i = 0; i < N; i++) {
                arr[i] = hash[i + 1];
            }

        }
}
