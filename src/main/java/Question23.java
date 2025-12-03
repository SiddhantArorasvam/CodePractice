public class Question23 {
    
    //Remove Non Alphaneumeric Characters
    
    public static void main(String[] args) {
        
        String input = "Testing the *(&*(&*((*&*ALPHA(*&*(&NEUMERIC";
        
        String Result = input.replaceAll("[^A-Za-z0-0]","");
        
        System.out.println(Result);
    }
}
