import java.util.Scanner;
public class MaxValueArray {
    public static void main(String[] args) {
        System.out.println("Enter array size: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[ ] arr = new int[size];

        System.out.println("Enter array elements: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i=1; i<size; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max element is: "+max);
    }
}
