import java.util.Scanner;

class InsertAtMiddle{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int n = s.nextInt();
        int[] arr = new int[n+1];

        System.out.println("Enter the Element : ");
        for(int i=0; i<n; i++)
            arr[i] = s.nextInt();

        System.out.print("Enter the element to insert at middle : ");
        int x = s.nextInt();
        int mid = n/2;

        for(int i=n; i>mid; i--)
            arr[i] = arr[i-1];

        arr[mid] = x;

        for(int i=0; i<n; i++){
        if(n == n+1)
            System.out.print(arr[i]);
        else
            System.out.print(arr[i] + " ");
 }
    }
}