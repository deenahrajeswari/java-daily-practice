import java.util.Scanner;

public class Day02_largest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
    /*Taking input  */
    System.out.println("enter the number1:");
    int number1=scan.nextInt();
    System.out.println("enter the number2:");
    int number2=scan.nextInt();
    System.out.println("enter the number3:");
    int number3=scan.nextInt();

    /*Checking largest of three numbers */
    if(number1>number2 && number1>number3){
        System.out.println("the largest number is " + number1);
    }
    else if(number1<number2 && number2>number3){
        System.out.println("the largest number is " + number2);

    }
    else{
        System.out.println("the largest number is " + number3);
    }
        
    }
    


    
}
