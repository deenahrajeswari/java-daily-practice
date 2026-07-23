public class Scope_Function{
    
      
    public static void main(String[] args) {
        int a =10;
      
      

      /* the variable a,b can be used only within this function this is the function scope */
      {
        a=40;
        System.out.println(a);
        int c=50;/* variable c can be only used within this block */
        System.out.println(c);

        /*  variable a is initilized outside the function so u can't initilized it again  */
        /* reassigning the value of variable a */
      }
      System.out.println(a);
    
    }
}