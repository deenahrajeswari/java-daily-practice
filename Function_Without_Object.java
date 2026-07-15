import java.util.Scanner;

public class Function_Without_Object {
    /*Function  */
    
    public static String welcome(String name){
    String input="welcome" + name;
    return input;
  }
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
   
     String user_name1=scan.nextLine();
      
    
    System.out.println(welcome(user_name1));
    String user_name2=scan.nextLine();
    System.out.println(welcome(user_name2));
    
    String user_name3=scan.nextLine();
    System.out.println(welcome(user_name3));
    scan.close();
    
  }
  /*public static boolean isPass(int mark){
    if(mark>=35){
      return true;

    }
    else{
      return false;
    }
  }
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int score=scan.nextInt();
    System.out.println(isPass(score));
    scan.close();
    
  } */
    
}
