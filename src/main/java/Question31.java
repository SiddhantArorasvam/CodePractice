import java.util.Arrays;
//Move 0s to the end
public class Question31 {

    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 0, 0, 4, 5, 6, 7, 0};

        System.out.println(Arrays.toString(Shuffle(arr)));

    }

    public static int[] Shuffle(int[] arr){



        int index = 0;

        for (int num :arr){

            if (num !=0){

                arr[index] = num;
                index++;
            }



        }
        while (index < arr.length){

            arr[index] =0;
            index++;
        }

        return arr;
    }


}
