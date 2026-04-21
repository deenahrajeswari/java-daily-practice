import java.util.*;
public class OddorEven {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        int number=scan.nextInt();
        if(number % 2==0){
            System.out.println("the given number is Even:" + number);

        }
        else{
            System.out.println("the given number is Odd:" + number); 
        }
        scan.close();

    }
    
}
