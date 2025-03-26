import java.util.*;
public class LinearSearch {
    public static int serach(int[] arr,int n){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == n){
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] marks = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integer marks:");
        for(int i=0; i<marks.length; i++){
            marks[i] = sc.nextInt();
        }
        System.out.println("Enter a number to search in the array: ");
        int a = sc.nextInt();
        int result = serach(marks,a);
        if(result != 0){
            System.out.println("Found at "+result);
        }
        else {
            System.out.println("Not Found");
        }
    }
}
