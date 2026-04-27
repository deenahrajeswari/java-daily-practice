public class Day07_Vowels{
    public static void main(String[] args) {
        String word="Hello World";
        int count=0;
        word=word.toLowerCase();

        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
                
            }
            
        }
        System.out.println("Total vowels: " + count);
    }
}