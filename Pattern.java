public class Pattern {
    public static void main(String[] args) {
        int n=5;
        int count =1;
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
        // for(int i=0;i<n;i++){
        //     if(i%2 ==0) count = 1;
        //     else count = 0;
        //     for(int j=0;j<=i;j++){
        //         System.out.print(count);
        //         count = 1-count;
        //     }
        //     System.out.println();
        // }
        // int gap = 2*(n-1);
        // for(int i =1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //         }
        //         for(int j=1;j<=gap;j++){
        //             System.out.print(" ");
        //         }
        //         for(int j=i;j>=1;j--){
        //             System.out.print(j);
        //         }
        //         System.out.println();
        //         gap-=2;
        // }
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(count);
        //         count = count + 1;
        //         }
        //         System.out.println();
        //     }
        // for(int i =1;i<=n;i++){
        //     char countt='A';
        //     for(int j=1;j<=i;j++){
        //         System.out.print(countt  + " " );
        //         countt++;
        //         }
        //         System.out.println();
        // }
        // for(int i =1;i<=n;i++){
        // char countt='A';
        //     for(int j=1;j<=n-i+1;j++){
        //         System.out.print(countt  + " " );
        //         countt++;
        //         }
        //         System.out.println();
        // }
        // char countt='A';
        // for(int i =1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(countt  + " " );
        //         }
        //         countt++;
        //         System.out.println();
        // }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n-i-1;j++){
        //         System.out.print(" ");
        //     }
        //     char countt = 'A';
        //     int breakpoint = (2*i+1)/2;
        //     for(int j=1;j<=2*i+1;j++){
        //         System.out.print(countt + " ");
        //         if(j <= breakpoint) countt++;
        //         else countt--;
        //     }
        //     for(int j=0;j<n-i-1;j++){
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }
        // for(int i=0;i<n;i++){
        //     for(char ch =(char)(int)('A' + n-1-i);ch<=(char)(int)('A'+n-1);ch++){
        //         System.out.print(ch + " ");
        //     }
        //     System.out.println();
        // }
        // int countt =0;
        // for(int i=0;i<n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print("*");
        //         }
        //     for(int j=0;j<countt;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print("*");
        //         }
        //         System.out.println();
        //         countt+=2;
        // }
        // countt=2*n -2;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //         }
        //     for(int j=0;j<countt;j++){
        //       System.out.print(" ");
        //         }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //         }
        //         countt-=2;
        //         System.out.println();
        //         }
        // int countt = 2*n-2;
        // for(int i=1;i<=2*n-1;i++){
        //     int stars = i;
        //     if(i>n) stars = 2*n-i;
        //     for(int j=1;j<=stars;j++){
        //         System.out.print("*");
        //     }
        //     for(int j = 1;j<=countt;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1;j<=stars;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     if(i<n) countt -=2;
        //     else countt +=2;
        // }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(i==0 || j==0 || i==n-1 || j==n-1)
        //            System.out.print("* ");
        //         else System.out.print("  ");
        //     }
        //      System.out.println();
        // }
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top = i;
                int bottom = j;
                int right = (2*n - 2) - j;
                int left = (2*n - 2) - i;
                System.out.print(n- Math.min(Math.min(top,bottom), Math.min(left,right)) + " ");
            }
            System.out.println();
        }


        
        
                




    }
    
}
