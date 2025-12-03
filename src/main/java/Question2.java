public class Question2 {
    
    public static void main(String[] args) {
        
        String sentence = "apple banana kiwi";
        System.out.println(ReverseSentence(sentence));
        
    }
    
    public static String ReverseSentence(String sentence){
        
        StringBuilder sb = new StringBuilder();
        String[] words = sentence.split(" ");
        
        for (int i = words.length -1; i >=0 ; i--) {
            
            sb.append(words[i]).append(" ");
            
        }
        
        return sb.toString().trim();
    }
    
   
}


