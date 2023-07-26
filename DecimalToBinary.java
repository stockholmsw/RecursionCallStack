package recursive_coding;

public class DecimalToBinary {
    public static void main(String[] args) {
       String binary = findBinary(128,"");
        System.out.println(binary);

    }
    public static String findBinary(int decimal,String result){
        if(decimal ==0){
            return result;
        }
        result+=decimal%2;
        return findBinary(decimal/2,result);

    }
}
