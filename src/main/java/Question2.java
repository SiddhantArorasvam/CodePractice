public class Question2 {
    
    public static void main(String[] args) {
        
        String sentence = "apple banana kiwi";
        System.out.println(ReverseSentence(sentence));
        
    }


    public static String ReverseSentence(String str){

        String[] arr = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = arr.length -1;i>=0 ; i--){

            sb.append(arr[i]).append(" ");

        }

        return sb.toString().trim();


    }
    

}





