import java.util.Arrays;
import java.util.Scanner;

class BubbleSort{
    
    public static int[] bubbleSort(int[] arr){

        int n = arr.length;

        for(int i=0; i<n-1; i++){

            for(int j=0; j<n-i-1; j++){

                if(arr[j] > arr[j+1]){
                    
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;                }
            }
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
        bubbleSort(arr);
        System.out.println("After sorting : " + Arrays.toString(arr));
    }
}