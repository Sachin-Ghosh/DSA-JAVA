//*Temperature conversion */
import java.util.Scanner;

public class TempConv {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the temperature in Celcius: ");
        float tempC = in.nextFloat();
        
        float tempF = (tempC * 9/5) + 32;
        System.out.println("The temperature in Fahrenheit is: " + tempF);
        
}
}