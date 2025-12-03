public class Question6 {
    
    //Max in Array
    public static void main(String[] args) {
        
        System.out.println(FindMax(new int[]{1,2,3,4,5,6}));
        
    }
    
    
    public static int FindMax(int[] arr){
        
        int max = arr[0];
        
        for (int num:arr){
            
            if (max <num){
                
                max = num;
            }
            
        }
        
        return max;
    }
    
    
    }
    
    
    


//public static int max(int[] arr){
//
//    int max = arr[0];
//
//    for (int num : arr){
//
//        if(max<num){
//            max = num;
//        }
//    }
//    return max;
//}
