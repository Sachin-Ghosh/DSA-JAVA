public class EvenDigit {
    public static void main(String[] args) {
        //*Q Find even number of digits in the array */
        int[] nums = {12, 345, 2, 5467};
        System.out.println(findNumbers(nums));
        

    
}
    public static int findNumbers(int[] nums){
        int count = 0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    public static boolean even(int num){
        int NumOfDigits = digit(num);
            // if(NumOfDigits % 2 == 0){
            //     return true;
            // }
            // return false;
            return NumOfDigits % 2 == 0; // Shortcut
    }
    public static int digits(int num){
        int count = 0;
        while(num>0){
            num = num/10;
            count++;
            }
            return count;
    }
    //*Optimized */
    public static int digit(int num){
        if(num < 0){
           num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;

    }




    
}
