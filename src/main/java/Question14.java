public class Question14 {
    //EvenOdd
    public static void main(String[] args) {
        System.out.println(EvenOddChecker(2));
        
    }
    public static boolean EvenOddChecker(int num){
        
        if(num%2==0){
            return true;
        }
        else {
            return false;
        }
    }
}
