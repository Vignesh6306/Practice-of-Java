import java.util.*;

class ReverseAnArray{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int n = s.nextInt();

        System.out.println("Enter the elements : ");
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
            arr[i] = s.nextInt();

        int left = 0;
        int right = arr.length-1;

        while(left < right){

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        System.out.print("The reverse array : " + Arrays.toString(arr));
    }
}