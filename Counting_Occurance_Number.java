public class Counting_Occurance_Number {
    public static void main(String args[]){
        int number=12344445;
        int count=0;
        for(int i=0;i<=number;i++){
            int remainder=number%10;
            if(remainder==2){
                count=count+1;
            }
            number=number/10;
        }
        System.out.println(count);
    }
}
