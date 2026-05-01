public class Day09_Palindrome_String{
    public static void main(String[] args) {
        String str="madam";

        String reverse=new StringBuilder(str).reverse().toString();

        if(str.equals(reverse)){
            System.out.println("Given string is a palindrome");

        }
        else{
            System.out.println("Given string is not a palindrome");
        }
        
    }
}