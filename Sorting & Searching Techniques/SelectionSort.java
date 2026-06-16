import java.util.*;

class SelectionSort{

    public static int[] selectionSort(int[] arr){

        int n = arr.length;

        for(int i=0; i<n-1; i++){
            int minIndex = i;

            for(int j=i+1; j<n; j++){
                
                if(arr[j] < arr[minIndex])
                    minIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
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
        selectionSort(arr);
        System.out.println("After sorting : " + Arrays.toString(arr));
    }
}