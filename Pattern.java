public class Pattern {
    public static void main(String[] args) {
        int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         System.out.print("*");
        //         }
        //         System.out.println();
        //         }
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //         }
        //         System.out.println();
        //         }
        // for(int i =1;i<=n;i++){
        //     int count=0;
        //     for(int j=1;j<=i;j++){
        //         count++;
        //         System.out.print(count);
        //         }
        //         System.out.println();
        // }
        // for(int i =1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i + "");
        //         }
        //         System.out.println();
        // }
        // for(int i=0;i<n;i++){
        //     for(int j=n;j>i;j--){
        //         System.out.print("*");
        //         }
        //         System.out.println();
        // }
        // for(int i=0;i<n;i++){
        //     for(int j=n;j>i;j--){
        //         System.out.print(n-j+1+"");
        //         }
        //         System.out.println();
        //         }
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n - i - 1; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j < 2 * i + 1; j++) {
        //         System.out.print("*");
        //     }
        //     for (int j = 0; j < n - i - 1; j++) {
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j <i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j < 2*n -(2*i +1); j++) {
        //         System.out.print("*");
        //     }
        //     for (int j = 0; j <  i; j++) {
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }
        // for(int i=1;i<=2*n-1;i++){
        //     int stars = i;
        //     if(i>n) stars = 2*n-i;
        //     for(int j=1;j<=stars;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        int count =1;
        for(int i=0;i<n;i++){
            if(i%2 ==0) count = 1;
            else count = 0;
            for(int j=0;j<=i;j++){
                System.out.print(count);
                count = 1-count;
            }
            System.out.println();
        }
        
        
                




    }
    
}
