import java.util.Arrays;

public class Question30 {
        
        //Array Indices for the elements Sum of which is the target
        
        
        
        public static void main(String[] args) {
                
                int[] arr = {1,3,5,7,9,5,4};
                int target = 8;
                System.out.println(Arrays.toString(SumResult(arr,target)));
                
        }
        
        public static int[] SumResult(int[] arr,int target){
                
                for (int i = 0; i < arr.length; i++) {
                        
                        
                        for (int j = i+1; j < arr.length; j++) {
                        
                                if(arr[i]+arr[j] == target){
                                      
                                      return new int[]{i,j};
                                }
                        }
                        
                }
                
           return null;
        }
    
}
