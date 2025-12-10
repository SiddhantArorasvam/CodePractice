public class Question34 {

    public static void main(String[] args) {

        int input  = 98765;
        System.out.println(SumInt(input));

    }

    public static int SumInt(int input){

        String str = String.valueOf(input);
        char[] arr = str.toCharArray();
        int result = 0;

        for (char ch :arr){

            result = result + Integer.parseInt(String.valueOf(ch));

        }

        return result;
    }
}
