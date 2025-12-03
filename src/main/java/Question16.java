public class Question16 {
    
    //ReverseOnlyAlphabets
    
    public static void main(String[] args) {
        
        System.out.println(ReverseAlphabets("12ab1"));
    }
    
    public static char[] ReverseAlphabets(String input){
        
        char[] chararr = input.toCharArray();
        int left = 0;
        int right = chararr.length-1;
        
        while (left<right){
            
            if(!Character.isLetter(chararr[left])){
                
                left++;
            }else if(!Character.isLetter(chararr[right])){
                
                right--;
            }
            else {
            
                char temp = chararr[left];
                chararr[left] = chararr[right];
                chararr[right] = temp;
                
                left++;
                right--;
            
            
            }
        }
        
        
        return chararr;
    }
}
