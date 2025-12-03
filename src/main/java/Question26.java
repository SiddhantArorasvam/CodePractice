import java.sql.Array;
import java.util.*;

public class Question26 {
    public static void main(String[] args) {
        //Remove Duplicate
      String[] arr = {"Java","C","C++","Java"};
      
      Set<String> remove_dup = new LinkedHashSet<>();
      
      for (String val:arr){
          
          remove_dup.add(val);
          
      }
        
        System.out.println(remove_dup);
      
      
      
    }
    
}
