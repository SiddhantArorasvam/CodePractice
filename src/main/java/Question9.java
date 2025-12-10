public class Question9 {
    //SWAP without third variable
    public static void main(String[] args) {
      int a = 20;
      int b = 40;
        
        a = a-b;
        b= b+a;
        a=b-a;

        System.out.println("value of b is "+b+" and the value of a is now "+a);
    
    }
    

}
