public class Question11 {
    
    //Remove Duplicate
    public static void main(String[] args) {
        
        System.out.println(RemoveDup("aaaaabbbbbccaaaddd"));

    }

    public static String RemoveDup(String str){

        String output = "";
        char[] arr = str.toCharArray();

        for (char ch :arr){

            if (output.indexOf(ch)==-1){

                output = output + ch;

            }

        }

        return output;


    }
    

}


//public static String RemoveDup(String str){
//
//    String output = "";
//
//    for (int i = 0; i < str.length(); i++) {
//
//        char ch = str.charAt(i);
//        if(output.indexOf(ch)==-1){
//
//            output+= ch;
//
//        }
//
//    }
//
//
//    return output;
//}
