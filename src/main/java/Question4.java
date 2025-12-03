public class Question4 {
    
    public static void main(String[] args) {
      
      //  String Palindrome Checker
        
        System.out.println(Ispalindrome("Lever"));
    }
    
    public static Boolean Ispalindrome(String s){
        
        
        char[] arr = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        
        while (start < end){
            
            if (arr[start]!=arr[end]){
                
                return false;
            }
            start ++;
            end --;
        }
        
        return true;
        
    }
    
  
}


//public static boolean IsPalindrome(String val){
//
//    int start = 0;
//    int end = val.length()-1;
//
//    while (start<end){
//
//        if(val.charAt(start) != val.charAt(end)){
//            return false;
//        }
//        start++;
//        end--;
//    }
//
//
//    return true;
//}