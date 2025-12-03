public class Question27 {
    
    public static void main(String[] args) {
        
        System.out.println(Factorial(120));
    }
    
    public static int Factorial(int num){
        
        for (int i = num-1; i >=1 ; i--) {
            
            num*=i;
        }
        
        return num;
    }
    
}
