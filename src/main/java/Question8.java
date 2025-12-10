public class Question8 {
    //Second Max from Array
    public static void main(String[] args) {
      //
        System.out.println(SecondLargestNum(new int[] {4, 781, 8, 99, 103}));
      
      
    }

    public static int SecondLargestNum(int[] arr) {

        int max = 0;
        int sec_max = 0;

        for(int num :arr){

            if (num > max){

                sec_max = max;
                max = num;
            }
            else if (sec_max < num){

                sec_max = num;
            }
        }
        return sec_max;
    }

    }



    