 import java.util.Scanner;
 public class Day12_Swap_Numbers{
     public static void main(String[] args) {

      Scanner scan=new Scanner(System.in);

      //Taking input//
      System.out.println("Enter the number");
      int a=scan.nextInt();
      System.out.println("Enter the number");
      int b=scan.nextInt();
      
      //Logic for swapping using third variable//
      int temp=a;
      a=b;
      b=temp;

      //Printing output//
      System.out.println("After swapping a= " + a);
      System.out.println("After swapping b= " + b);

      System.out.println("Enter the number");
      int c=scan.nextInt();
      System.out.println("Enter the number");
      int d=scan.nextInt();

      //Logic for swapping without using third variable//
      c=c+d;
      d=c-d;
      c=c-d;

      //Printing output//
      System.out.println("After swapping c= " + c);
      System.out.println("After swapping d= " + d);

      scan.close();
     }
 }