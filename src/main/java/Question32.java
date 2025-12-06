public class Question32 {
    public static void main(String[] args) {

        //IgnoreAlphabets only add the numbers

        String s ="abc23hskja34nsjs78jsks";


        System.out.println(StringSum(s));
    }

    public static int StringSum(String s){

        int sum = 0;
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();

        for (char ch :arr){

            if (Character.isDigit(ch)){

                sb.append(ch);

            }
            else if(sb.length()>0){

              sum += Integer.parseInt(sb.toString());

              sb.setLength(0);

            }



        }

      return sum;
    }


}
