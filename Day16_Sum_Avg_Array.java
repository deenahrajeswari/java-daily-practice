import java.util.Scanner;
public class Day16_Sum_Avg_Array{
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("enter the size of the array:");
    int size=scan.nextInt();
    int [] myArray=new int[size];
    int sum=myArray[0];
    for(int i=0;i<myArray.length;i++){
        System.out.println("enter the element");
        myArray[i]=scan.nextInt();
        sum=sum+myArray[i];
    }
    System.out.println("Sum=" + sum);
    int average=sum/size;
    System.out.println("Average=" + average);
    scan.close();
  }
}