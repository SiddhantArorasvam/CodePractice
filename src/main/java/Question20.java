public class Question20 {
    
    //AdditionofNumbers in a string
    
    
    public static void main(String[] args) {
        String  input = "12bas10bbb32as10";
        System.out.println(Sum(input));
    }
    
    public static int Sum(String input){
        int sum = 0;
        StringBuilder builder = new StringBuilder();
        char[] arr = input.toCharArray();
        
        
        for (char ch : arr){
            if (Character.isDigit(ch)){
                
                builder.append(ch);
                
            }
            else {
                
                if (builder.length() >0){
                    
                    sum = sum + Integer.parseInt(builder.toString());
                    builder.setLength(0);
                }
                
            }
          
        }
        if(builder.length()>0){
           
            sum = sum + Integer.parseInt(builder.toString());
            
        }
        
        return sum;
    }
}
