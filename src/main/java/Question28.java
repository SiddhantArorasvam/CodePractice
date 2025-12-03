public class Question28 {
    
    public static void main(String[] args) {
        
        String s = "This is Siddhant ";
        System.out.println(Wordsize(s));
    }
    
    public static int Wordsize(String s){
        
        s= s.trim();
        char[] arr = s.toCharArray();
        int count =0;
        for (int i = arr.length-1;i>=0;i--){
            
            if(arr[i] !=' '){
                
                count++;
                
            }
            else if(count > 0){
                
                return count;
                
            }
            
        }
        return count;
    }
}
