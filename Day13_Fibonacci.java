import java.util.Scanner;
public class Day13_Fibonacci{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number: ");
        int number=scan.nextInt();
        int number1=0;
        int number2=1;
        
        for(int i=0;i<number;i++){


          System.out.println(number1);
          int number3=number1+number2;
          number1=number2;
          number2=number3;
        }
        scan.close();
        
    }
}