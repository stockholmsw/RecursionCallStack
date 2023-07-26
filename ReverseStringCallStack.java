package recursive_coding;

public class ReverseStringCallStack {
    public static void main(String[] args) {

        System.out.println(reverseString("KÖKSAL"));
    }
    public static String reverseString(String input){
        // What is the base case?
        //What is the smallest amount of work I can do in each iteration?

        if(input.equals("")){
            return "";
        }

        return   reverseString(input.substring(1)) + input.charAt(0);
    }
}
