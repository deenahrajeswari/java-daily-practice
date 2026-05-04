import java.util.Scanner;
public class Day10_Remove_Space{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the input string");
        String str=scan.nextLine();

        String removeSpace=str.replace(" ","");
        
        System.out.println("After removing space from the String:" + removeSpace);
        scan.close();

    }
}