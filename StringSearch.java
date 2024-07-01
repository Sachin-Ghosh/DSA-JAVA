import java.util.Scanner;

public class StringSearch {
    public static void main(String[] args) {
        String str = Input();
        int ind = contains(str);
        if (ind == -1) {
            System.out.println("Character not found");
            } else {System.out.println("Character found at index " + ind);
        }
        
                
    }
    public static int contains(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character to search: ");
        char ch = sc.next().charAt(0);
        int ind = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                ind = i;
                }
            }
        return ind;
    }
    public static String Input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = sc.nextLine();
        return input;
        }
        
    
}
