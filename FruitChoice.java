import java.util.Scanner;


public class FruitChoice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of fruits you want to buy: ");
        
        String fruit = sc.next();

        switch(fruit){
            // case "apple":
            // System.out.println("Apple is a red fruit");
            // break;
            // case "banana":
            // System.out.println("Banana is a yellow fruit");
            // break;
            // case "orange":
            // System.out.println("Orange is an orange fruit");
            // break;
            // case "mango":
            // System.out.println("Mango is a the king fruit");
            // break;
            // default:
            // System.out.println("Invalid input");


            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("Round fruit");
            case "Grapes" -> System.out.println("Small fruit");
            default -> System.out.println("please enter a valid fruit");
            
        }

    
}
}
