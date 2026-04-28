public class Day08_ReverseString{
    public static void main(String[] args) {

        // Using StringBuilder
        String str="Hello World";
        String reverse=new StringBuilder(str).reverse().toString();
        System.out.println(reverse);

        // Using for loop
        String original = "Java";
        String reversed = "";

        for (int i=original.length()-1;i>=0;i--) {
           reversed += original.charAt(i);
        }
        System.out.println(reversed);

    }
}