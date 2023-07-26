package recursive_coding;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
    int arr[] = {2,5,6,7,8,11,15,16,21};
        System.out.println(recursiveBinarySearch(arr,0,arr.length-1,16));

    }
    public static int recursiveBinarySearch(int[]a,int left,int right,int numberToFind){
        int midPoint = (left + right)/2;
        if(left>right){
            return -1;
        }
        else if(numberToFind == a[midPoint]){
            return midPoint;
        }else if(numberToFind<a[midPoint]){
            return recursiveBinarySearch(a,left,midPoint-1,numberToFind);
        }else{
            return recursiveBinarySearch(a,midPoint+1,right,numberToFind);
        }
    }

}
