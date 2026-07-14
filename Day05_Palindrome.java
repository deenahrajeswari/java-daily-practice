import java.util.Scanner;
public class Day05_Palindrome{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        /*Getting input from user */
        System.out.println("enter the number:");
        int number=scan.nextInt();

        /*Using for loop */
        int original=number;
        int reverse=0;
        while(original>0){
            int digit=original%10;
             reverse=(reverse*10)+digit;
             original=original/10;
        }
        
        /*Checking Palindrome */
        if(number==reverse){
            System.out.println(number +" is a Palindrome");
        }
        else{
            System.out.println(number +" is not a Palindrome");
        }
        scan.close();
    }
}

/*Using functions */
    /*import java.util.Scanner;
class Solution {
    public boolean isPalindrome(int x) {
        int reverse=0;
        int original=x;
        while(x>0){
        int digit=x%10;
        reverse=reverse*10+digit;
        x=x/10;
        }
        if(original==reverse){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        Solution obj=new Solution();
        int input=scan.nextInt();
        System.out.println(obj.isPalindrome(input));
    }
} */