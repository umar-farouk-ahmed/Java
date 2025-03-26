import  java.util.*;
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        double[] arr = new double[n];
        System.out.println("Enter inputs: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextDouble();
        }
        int j=3;
        for(int i=1; i<arr.length; i=i+4){
            double temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j = j +4;
        }
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
