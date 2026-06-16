import java.util.*;
import java.util.Scanner;

class InsertionSort{

    public static int[] insertionSort(int[] arr){

        int n = arr.length;

        for(int i=1; i<n; i++){

            int key = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] > key){

                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the Size : ");
        int n = s.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the Element : ");
        for(int i=0; i<n; i++)
            arr[i] = s.nextInt();

        System.out.println("Before Sorting : " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("After sorting : " + Arrays.toString(arr));
    }
}