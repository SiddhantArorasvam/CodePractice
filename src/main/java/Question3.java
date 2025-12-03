public class Question3 {
    
    public static void main(String[] args) {
    
        //Find Prime Number
        
        System.out.println(CheckPrime(20));
    
    }
    
    public static Boolean CheckPrime(int num){
        
        for (int i = 2; i <=num/2 ; i++) {
            
            if(num%i==0){
                return false;
            }
            
        }
       return true;
        }
        
    }

