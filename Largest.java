import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //*If Else Method */

        // if(a>b && a>c){
        //     System.out.println("The largest number " + a);
        // }
        // else if(b>c){
        //     System.out.println("The largest number " + b);
        // }
        // else{
        //     System.out.println("The largest number " + c);
        // }    

        int max = Math.max(c,Math.max(a, b));
        System.out.println("The largest number " + max);
}
}