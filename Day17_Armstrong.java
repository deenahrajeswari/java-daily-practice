import java.util.Scanner;
public class Day17_Armstrong {
    static boolean isArmstrong(int number){
        int original=number;
        int armstrong=0;
        while(number>0){
            int digit=number%10;
            armstrong=digit*digit*digit+armstrong;
            number=number/10;

        }
        if(armstrong==original){
        
            return true;
        }
        else{
            return false;
        }
        
        

    }
    public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     int input=scan.nextInt();
     System.out.println(isArmstrong(input));
     scan.close();  
    }
    
}
