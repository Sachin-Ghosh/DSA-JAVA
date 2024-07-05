public class LCMnGCD {
    public static void main(String[] args) {
        int n1 = 20, n2 = 15;
        int[] result = lcmAndGcd(n1, n2);
        System.out.println("LCM: " + result[0]);
        System.out.println("GCD: " + result[1]);
    
}
    static int[] lcmAndGcd(int A , int B) {
        int gcd = gcd(A, B);
        int lcm = Math.abs(A * B) / gcd;
        return new int[]{lcm, gcd};
    }
    public static int gcd(int A, int B) {
        while(A > 0 && B > 0) {
        if(A > B) {
            A = A % B;
        }
        else {
            B = B % A;
        }
    }
    if(A == 0) {
        return B;
    }
    return A;
    
}
}
