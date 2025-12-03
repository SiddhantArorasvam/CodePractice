import java.util.Arrays;

public class Question10 {
    
    //Check Anagram
    public static void main(String[] args) {
        
        System.out.println(checkAnagram("cheater","teache"));
    
    }
    
    public static Boolean checkAnagram(String str1, String str2){
        
        char[] string1 = str1.toCharArray();
        char[] string2 = str2.toCharArray();
        
        Arrays.sort(string1);
        Arrays.sort(string2);
        
        
        return Arrays.equals(string1,string2);
    }
    
    
}


