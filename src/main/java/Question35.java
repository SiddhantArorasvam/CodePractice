import java.util.HashSet;
import java.util.Set;

public class Question35 {

    //longestSubstringnonRepeatingcharacters
    public static int LongestSubstringNonRepeating(String s){

        if(s == null || s.length() ==0){

            return 0;
        }


        int start=0;
        int end = 0;
        int maxlen = 0;


        Set<Character> set = new HashSet<>();


        for (end = 0; end < s.length(); end++) {


            char ch = s.charAt(end);

            while (set.contains(ch)){

                set.remove(s.charAt(start));
                start++;

            }

            set.add(ch);

            int currentlength = end - start +1;


            if(currentlength > maxlen){

                maxlen = currentlength;
            }
        }


        return maxlen;
    }

    public static void main(String[] args) {

        String str = "abcdabddba";
        System.out.println(LongestSubstringNonRepeating(str));

    }
}
