package recursive_coding;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int totalResult = recursiveSummation(10);
        System.out.println(totalResult);
    }
    public static int recursiveSummation(int inputNumber){
        if(inputNumber==1){
            return inputNumber;
        }
        return inputNumber + (recursiveSummation(inputNumber-1));
    }
}
