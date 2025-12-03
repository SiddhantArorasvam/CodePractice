import java.sql.Struct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
//Map Counter
public class Question18 {
    
    public static void main(String[] args) {
        
        System.out.println(MapCounter("Struggle Jobb"));
    }
    
    public static Map<Character,Integer> MapCounter(String s){
        
        Map<Character,Integer> map = new LinkedHashMap<>();
        char[] arr = s.toCharArray();
        
        for( char c :arr){
            
            if(c !=' ') {
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }
        
        
        return map;
    }
    
}
