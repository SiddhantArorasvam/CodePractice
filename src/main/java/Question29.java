import java.util.LinkedHashSet;
import java.util.Set;

public class Question29 {
    
    public static void main(String[] args) {
        Set<Character> set = new LinkedHashSet<>();
        String s = "SiddhantArora";
        char[] arr = s.toCharArray();
        
        for (char result :arr){
            
            
            set.add(result);
            
            
        }
        
        System.out.println(set.toString());
        
    }
}
