import java.util.Arrays;

public class Question19 {
    
    public static void main(String[] args) {
        System.out.println(ReplaceVowels("Siddhant"));
    }
    
    public static String ReplaceVowels(String input){

       char[] inputarr =  input.toCharArray();
       int left = 0;
       int right = inputarr.length -1;
       String vowels = "aeiouAEIOU";
       while (left<right){

           for (int i=0;i<inputarr.length;i++){

               if (vowels.indexOf(inputarr[left])==-1){

               left++;

               }
               else if(vowels.indexOf(inputarr[right])==-1){

                   right--;
               }
               else {

                   inputarr[left] = 'X';
                   inputarr[right] = 'Y';
                   left++;
                   right--;
               }
           }

       }
       return Arrays.toString(inputarr);
    }
}
