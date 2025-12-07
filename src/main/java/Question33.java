public class Question33 {

    public static void main(String[] args) {

        String s = "this12is22java5interview";
        //o/p -> interview java is this

        String[] str = s.split("\\d+");

        StringBuilder sb = new StringBuilder();

        for (int i = str.length -1; i >=0 ; i--) {


            sb.append(str[i]).append(" ");
        }
        System.out.println(sb.toString().trim());


    }


}
