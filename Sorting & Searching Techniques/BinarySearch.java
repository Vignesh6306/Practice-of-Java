import java.util.*;

class BinarySearch{

    public static int binarySearch(int[] arr, int target){

        int low = 0;
        int high = arr.length-1;

        while(low <= high){

            int mid = low + (high - low)/2;
            
            if(arr[mid] == target)
                return mid;

            else if(arr[mid] < target)
                low = mid + 1;

            else 
                high = mid -1;
        }
        return -1;
    }
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the Size : ");
        int n = s.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the Element : ");
        for(int i=0; i<n; i++)
            arr[i] = s.nextInt();

        System.out.println("Enter the search element : ");
        int target = s.nextInt();

        int index = binarySearch(arr, target);

        if(index != -1)
            System.out.print("The value is found " + target + " at index : " + index);
        else
            System.out.print("The value is not found !");
    }
} 