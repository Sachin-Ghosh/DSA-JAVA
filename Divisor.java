public class Divisor {
    public static void main(String[] args) {
        int N = 4; 
        System.out.println("The sum of Divisor from 1 to " + N + " is: " + sumOfDivisors(N));
    
    
}
static long sumOfDivisors(int N) {
    long totalSum = 0;
    for (int i = 1; i <= N; i++) {
        totalSum += i * (N / i);
    }

    return totalSum;
}
}
