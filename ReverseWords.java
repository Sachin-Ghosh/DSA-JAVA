public class ReverseWords {
    public static void main(String[] args) {
        String s1 = "the sky is blue";
        System.out.println(reverseWords(s1));
    }
    public static String reverseWords(String s) {
        s = s.trim();

       String[] words = s.split("\\s+"); 

       StringBuilder reversed = new StringBuilder();
       for (int i = words.length - 1; i >= 0; i--) {
           reversed.append(words[i]);
           if (i != 0) {
               reversed.append(" ");
           }
       }

       return reversed.toString();
   }
}
