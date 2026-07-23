import java.util.Arrays;

public class VarArg {
    static void input(int ...v){
        System.out.println(Arrays.toString(v));
        
    }
    public static void main(String[] args) {
        input(1,2,3,4,5,6,7);
        
    }
    
}
