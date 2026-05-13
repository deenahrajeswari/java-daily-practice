public class Day15_Min_Array{
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50};
        int min=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
               arr[i]=min;
            }
            

        }
        System.err.println(min);
    }

}