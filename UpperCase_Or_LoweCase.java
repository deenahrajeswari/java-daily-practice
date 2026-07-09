import java.util.Scanner;
public class UpperCase_Or_LoweCase {
    public static void main(String args[]){
     Scanner scan=new Scanner(System.in);
     char input=scan.next().charAt(0);

     if(input>='a' && input<='z'){
        System.out.println("lower");
     }
     else{
        System.out.println("upper");
     }
   }
   
   }
        
