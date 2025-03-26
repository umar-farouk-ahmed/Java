import java.util.*;
public class LargestNumber {
    public static int getLargest(int[] numbers){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
        }
        return largest;
    }
//    public static int secondLargest(int[] numbers){
//
//    }
    public static int getSmallest(int[] numbers){
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] < smallest){
                smallest = numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int[ ] numbers = {1,2,20,65,45,100,64,101};
        int max = getLargest(numbers);
        int min = getSmallest(numbers);
        System.out.println(max);
        System.out.println(min);
    }
}
