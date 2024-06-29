import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int num = sc.nextInt();
        // boolean ans = isArmstrong(num);
        // System.out.println(ans);
        //*Printing all armstrong number between 100-1000 */
        for(int i=100;i<=1000;i++){
            int num = i;
            boolean ans = isArmstrong(num);
            if(ans){
                System.out.println(num);
                }
                
        }
    }
    public static boolean isArmstrong(int num) {
        int temp = num;
        int sum = 0;
        while (temp != 0) {
            int rem = temp % 10;    
            sum += rem * rem * rem;
            temp /= 10;
            }
            return sum == num;
            }

}
