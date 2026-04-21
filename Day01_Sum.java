import java.util.*;
public class Day01_Sum{
     public static void main(String[] args) {
          Scanner scan=new Scanner(System.in);

          /*taking input*/
          System.out.println("enter first number");
          int number1=scan.nextInt();
          System.out.println("enter second number");
          int number2=scan.nextInt();

          /*calculating sum */
          int sum=number1+number2;
          System.out.println("The Sum of two numbers is:" + sum);
          scan.close();




     }

}