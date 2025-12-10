import java.util.Arrays;

public class Question16 {
    
    //ReverseOnlyAlphabets
    
    public static void main(String[] args) {
        
        System.out.println(Arrays.toString(ReverseAlphabets("12ab1")));
    }

    public static char[] ReverseAlphabets(String str){

        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length -1;

        while (start<end){

            if (!Character.isLetter(arr[start])){

                start++;
            }
            else if (!Character.isLetter(arr[end])){

                end --;
            }
            else {

                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end --;
            }
        }
        return arr;
    }
    

}


//public static char[] ReverseAlphabets(String input){
//
//    char[] chararr = input.toCharArray();
//    int left = 0;
//    int right = chararr.length-1;
//
//    while (left<right){
//
//        if(!Character.isLetter(chararr[left])){
//
//            left++;
//        }else if(!Character.isLetter(chararr[right])){
//
//            right--;
//        }
//        else {
//
//            char temp = chararr[left];
//            chararr[left] = chararr[right];
//            chararr[right] = temp;
//
//            left++;
//            right--;
//
//
//        }
//    }
//
//
//    return chararr;
//}
