import java.util.Scanner;

class DeleteAtMiddle{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int n = s.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the Element : ");
        for(int i=0; i<n; i++)
            arr[i] = s.nextInt();

        int mid = n/2;

        for(int i=mid; i<n-1; i++)
            arr[i] = arr[i+1];

        for(int i=0; i<n-1; i++){
            if(i == n-2)
                System.out.print(arr[i]);
            else
                System.out.print(arr[i] + " ");
        }
    }
}