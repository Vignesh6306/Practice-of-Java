import java.util.*;

class MaximumNumber1InAnArray{

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int n = s.nextInt();

        System.out.println("Enter the elements : ");
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
            arr[i] = s.nextInt();

        int max = arr[0];

        for(int i=1; i<arr.length; i++){

            if(arr[i] > max)
                max = arr[i];
        }
        System.out.print("The maximum value from the input is : " + max);
    }
}