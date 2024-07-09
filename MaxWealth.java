public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
        }
    //     public static int maximumWealth(int[][] accounts) {
    //         int max = Integer.MIN_VALUE;
    //         for (int i = 0; i < accounts.length; i++) {
    //             int sum = 0;
    //             for (int j = 0; j < accounts[i].length; j++) {
    //                 sum += accounts[i][j];
    //                 }
    //                 if (sum > max) {
    //                     max = sum;
    //                     }
    //                     }
    //                     return max;
    // }
    public static int maximumWealth(int[][] accounts) {
        int m = Integer.MIN_VALUE;
        
        for (int[] customer : accounts) {
            int n = 0;
            for (int wealth : customer) {
                n += wealth;
            }
            if (n > m) {
                m = n;
            }
        }
        
        return m;
    }
    
}
