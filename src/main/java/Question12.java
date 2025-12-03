import java.util.LinkedHashMap;
import java.util.Map;

public class Question12 {
    
    public static void main(String[] args) {
        
        System.out.println(CharCounter("straight"));
    
    }
    
    public static Map<Character,Integer> CharCounter(String str){
    
       Map<Character,Integer> counter = new LinkedHashMap<>();
       
       char[] inputarr = str.toCharArray();
       
       for (char ch :inputarr){
       
           if (counter.containsKey(ch)){
               
               counter.put(ch,counter.get(ch)+1);
           }
           else {
               counter.put(ch,1);
           }
       }
       
       return counter;
    }
}
