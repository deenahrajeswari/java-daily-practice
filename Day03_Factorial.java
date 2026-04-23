import java.util.Scanner;
public class Day03_Factorial {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        /*Getting input */
        System.out.println("enter the number");
        int number=scan.nextInt();

        int factorial=1;
        for(int i=1;i<=number;i++){
          factorial=i*factorial;   
        }
        System.out.println("Factorial of number is: " + factorial);
        scan.close();
    }

    
}
