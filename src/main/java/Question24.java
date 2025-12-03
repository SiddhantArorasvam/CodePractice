import java.util.LinkedHashMap;
import java.util.Map;

public class Question24 {
    
    //PrintNonRepeatingCharacters
    
    public static void main(String[] args) {
       
       String s = "SLIPPERS";
       Map<Character,Integer> Counterresult = charcounter(s);
       
       for (Map.Entry<Character,Integer> entry :Counterresult.entrySet()){
           
           if (entry.getValue()==1){
               
               System.out.println("Non Repeating char is : "+entry.getKey());
           }
       }
       
    }
    
    public static Map<Character,Integer> charcounter(String s){
        
        char[] arr = s.toCharArray();
        
        Map<Character,Integer> maps = new LinkedHashMap<>();
        
        for (char c :arr){
            
            maps.put(c,maps.getOrDefault(c,0)+1);
            
        }
        
        return maps;
        
    }
    
    
}



//Map<Character,Integer> MapDetials = MapCounter(s);
//
//
//       for (Map.Entry<Character,Integer> Entry :MapDetials.entrySet()){
//
//        if (Entry.getValue()==1){
//
//        System.out.println("Non Repeating characters are "+Entry.getKey());
////public static Map<Character,Integer> MapCounter(String s){
//
//    char[] arr =  s.toCharArray();
//    Map<Character,Integer> map = new LinkedHashMap<>();
//
//    for (char counter:arr){
//
//        map.put(counter,map.getOrDefault(counter,0)+1);
//
//
//
//    }
//
//
//    return map;
//