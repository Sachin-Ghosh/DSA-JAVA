import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().trim().charAt(0); //Trim basically trims the part before and after the character and char at is stating the index of the charecter to chose
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } 
        else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase");
        }
        else {
            System.out.println("Invalid");
        }
}
}