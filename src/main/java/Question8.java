public class Question8 {
    //Second Max from Array
    public static void main(String[] args) {
      //
        System.out.println(SecondLargestNum(new int[] {4, 781, 8, 99, 103}));
      
      
    }
    
    public static int SecondLargestNum(int[] arr){
        
        int max = 0;
        int secmax = 0;
        
        
        
        for (int num :arr){
            
            if (max < num){
                
                secmax = max;
                max = num;
                
            } else if (secmax < num) {
                
                secmax = num;
            }
            
        }
        
        
        return secmax;
    }
    
    
    }

    