public class Question20 {
    
    //AdditionofNumbers in a string
    
    
    public static void main(String[] args) {
        String  input = "12bas10bbb32as10";
        System.out.println(Sum(input));
    }

    public static int Sum(String str){

        int sum=0;
        StringBuilder sb = new StringBuilder();
        char[] arr =str.toCharArray();

        for (char val :arr){

            if (Character.isDigit(val)){

                sb.append(val);

            }
            else if (sb.length() >0){

                sum = sum + Integer.parseInt(sb.toString());
                sb.setLength(0);
            }

        }
        if(sb.length()>0){

            sum = sum + Integer.parseInt(sb.toString());
        }

        return sum;
    }



}


