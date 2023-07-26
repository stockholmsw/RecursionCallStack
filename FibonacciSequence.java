package recursive_coding;

public class FibonacciSequence {
    public static void main(String[] args) {
        int fibResult = recursiveFibonacciSequence(10);
        System.out.println(fibResult);
    }
    public static int recursiveFibonacciSequence(int k){
        if(k==0 || k ==1){
            return k;
        }
        else{
            return recursiveFibonacciSequence(k-1) + recursiveFibonacciSequence(k-2);
        }
    }
}
