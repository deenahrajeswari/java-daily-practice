import java.util.Scanner;
public class Day04_Reverse{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        /*Getting input from user */
        System.out.println("enter the number:");
        int number=scan.nextInt();

        /*Using while loop */
        
        int reverse=0;
        for(int i=0;number>0;i++){
            int digit=number%10;
            reverse=(reverse*10)+digit;
            number=number/10;

        }
        System.out.print(reverse);
        
        
    }
}