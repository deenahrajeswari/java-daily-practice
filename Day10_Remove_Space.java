import java.util.Scanner;
public class Day10_Remove_Space{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the input string");
        String str=scan.nextLine()/*.strip()*/;

        /* strip/trim remove the extra space  only in the beginning and ending in the sentence  */

        String removeSpace=str.replace(" ","");
        
        System.out.println("After removing space from the String:" + removeSpace);
        scan.close();
        /*System.out.println( str);
        scan.close();*/



    }
}