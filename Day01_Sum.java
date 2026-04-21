import java.util.*;
public class Day01_Sum{
     public static void main(String args[]){
      Scanner scan=new Scanner(System.in);
      System.out.println("enter the first number");
      int num1=scan.nextInt();
      System.out.println("enter the second number");
      int num2=scan.nextInt();

      int sum=num1+num2;
      scan.close();
      System.out.println("the sum of two numbers is.." + sum);
      
     }
}