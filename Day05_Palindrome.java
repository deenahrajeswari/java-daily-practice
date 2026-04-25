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