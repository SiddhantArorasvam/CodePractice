import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question21 {
    //Duplicate in List
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,6,7,7,8,8,8,8,0,0,0);
        
        Set<Integer> Unique = new HashSet<>();
        Set<Integer> Duplicate = new HashSet<>();
        
        for (int num :list){
            
            if (!Unique.add(num)){
                
                Duplicate.add(num);
            }
            
        }
        
        System.out.println("Suplicate Numbers are :- "+Duplicate);
        
        
        
        
    }
}
