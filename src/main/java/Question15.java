import java.util.Arrays;

public class Question15 {
    
    //Sum of two equal to provided number
    
    public static void main(String[] args) {
        
        System.out.println(Arrays.toString(Sumoftwo(new int[]{1,2,3,4}, 3)));
    
    
    }
    public static int[] Sumoftwo(int[] arr, int num){
    
        int[] Sumnum = new int[2];
        
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = i+1; j < arr.length; j++) {
            
                if(arr[i] + arr[j] == num){
                    
                    Sumnum[0] = arr[i];
                    Sumnum[1] = arr[j];
                    
                }
            }
        }
    
        return Sumnum;
    }
    
    
}
