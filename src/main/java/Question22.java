import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Question22 {
    //Map character count
    
    public static void main(String[] args) {
        
        System.out.println(MapCounter("Siddhant"));
    
    }
    public static Map<Character,Integer> MapCounter(String s){
        
        char[] arr = s.toCharArray();
        Map<Character,Integer> map = new LinkedHashMap<>();
        
        for (char c :arr){
            
            if(c!= ' '){
                
            
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }
        
        return map;
    }
}
