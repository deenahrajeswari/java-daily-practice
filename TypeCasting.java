public class TypeCasting {
    public static void main(String args[]){

        /* widening type cast  */
        /*done automatically by java  */
        byte a=24;
        short b=357;
        char c='t';

        /*byte short char will be converted into int  */
        int d=123;

        /*byte short char int  will be converted into long */
        long g =908765433;
        float e=9.08f;
        double f=456.56789;

        /* all the data types will be converted into double  */
        

        double result = (a+b) * (c+d) - (e+f+g);

        System.out.println(result);
        System.out.println((a+b) + " " +(c+d) + " " + (e+f+g) );
    
    }
    
}
