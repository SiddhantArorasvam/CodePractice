import java.util.Arrays;

public class Question1 {
    
    public static void main(String[] args) {
      // Reverse arr {1, 2, 3, 4, 5};
        int[] arr = {1,2,3,4,5};
        
        System.out.println(Arrays.toString(ReverseArray(arr)));
        
        }
        
     public static int[] ReverseArray(int[] arr){
        
        int start = 0;
        int end = arr.length -1;
        
        while (start < end){
            
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            
            start++;
            end--;
            
        }
        
        return arr;
        
     }
     
    }




