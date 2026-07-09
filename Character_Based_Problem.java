public class Character_Based_Problem {
    public static void main(String args[]){
        /*Check whether a character is Uppercase or Lowercase */
        char letter='D';
        if(Character.isUpperCase(letter)){
            System.out.println("Upper");

        }
        else{
            System.out.println("Lower");
        }

        /*Check whether a character is an Alphabet, Digit, or Special Character*/
        char a1='1';
        System.out.println(Character.isLetterOrDigit(a1));

        /*Convert Uppercase character to Lowercase and vice versa */

        char b1='l';
        System.out.println(Character.toUpperCase(b1));

        /*Find ASCII value of a character */

        int value='a';
        System.out.println(value);

        /*Check whether a character is a vowel or consonant */

        char c1='b';
        if(c1=='a' || c1=='e' || c1=='i' || c1=='o' || c1=='u'){
            System.out.println("vowel");
        }
        else{
            System.out.println("consonent");
        }

    }
}
