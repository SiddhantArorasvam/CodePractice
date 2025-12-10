
public class Question5 {
    
    public static void main(String[] args) {
        
        //Check Number Palindrome
        
        System.out.println(IsNumberPalindrome(2002));
        
    }

    public static Boolean IsNumberPalindrome(int num){

        int remainder;
        int copy = num;
        int reversenum = 0;

        while (num > 0){

            remainder = num%10;
            reversenum = reversenum * 10 + remainder;
            num = num/10;

        }

        return copy == reversenum;

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