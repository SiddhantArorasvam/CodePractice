
public class Question5 {
    
    public static void main(String[] args) {
        
        //Check Number Palindrome
        
        System.out.println(IsNumberPalindrome(2012));
        
    }
    
    public static Boolean IsNumberPalindrome(int num) {
    
    int copy = num;
    int remainder;
    int reversenumber = 0;
    
    while (num >0){
        
        remainder = num%10;
        reversenumber = (reversenumber*10) + remainder;
        num = num/10;
        
    }
    
    
    return copy==reversenumber;
    }
    
    
}



//public static boolean IsPalindrome(int num){
//
//    int remainder;
//    int copy = num;
//    int reversenumber = 0;
//
//    while (num>0){
//
//        remainder = num%10;
//        reversenumber = (reversenumber*10) + remainder;
//        num = num/10;
//
//
//    }
//
//
//
//
//    return copy==reversenumber;
//}