public class Question17 {
    //ReverseVowels
    
    public static void main(String[] args) {
        
        System.out.println(ReverseVowels("Hello"));
    }
    
    public static char[] ReverseVowels(String input){
       
       char[] inputarr = input.toCharArray();
       int left = 0;
       int right = inputarr.length-1;
       String vowels = "aeiouAeiou";
       
       while (left<right){
           
           if (vowels.indexOf(inputarr[left])==-1) {
               left++;
               
           } else if (vowels.indexOf(inputarr[right])==-1) {
               
               right--;
           }
           else {
               char temp;
               temp = inputarr[left];
               inputarr[left] = inputarr[right];
               inputarr[right] = temp;
               left++;
               right--;
               
           }
           
       }
     
       return inputarr;
    }
}
