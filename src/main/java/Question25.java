public class Question25 {
    //Second Smallest in Array
    
    public static void main(String[] args) {
        
        
        System.out.println(SecondSmallest(new int[]{1,2,3,4,5,6}));
        System.out.println(SecondSmallest(new int[]{0,99,909,1,2,3,4,5,6}));
        
    }
    
    public static int SecondSmallest(int[] arr){
        
        int min = arr[0];
        int secmin = arr[1];
        
        if (arr[0]>arr[1]){
            
            min = arr[1];
            secmin= arr[0];
            
        }
        
        for (int i = 2;i<arr.length;i++){
            
            if (min>arr[i]){
                
                secmin = min;
                min= arr[i];
            } else if (secmin > arr[i]) {
                
                secmin = arr[i];
            }
        }
        
        return secmin;
    }
}
