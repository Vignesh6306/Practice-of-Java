import java.util.*;

class SimpleSort{
    public static int[] Sort(int[] arr){
        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the Element : ");
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Before Sorting : "+ Arrays.toString(arr));
        Sort(arr);
        System.out.println("After Sorting : "+ Arrays.toString(arr));
    }
}